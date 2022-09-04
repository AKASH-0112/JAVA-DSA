public class _18single_element_in_sorrted_array {
    
    // given sortted array
    // having all duble number  , except one 
    // find that eleemnt
    public static void main(String[] args) {
        //  1] approch  Xor  opertion of all elemnts will give single element
        // bcz same element xor  will make them zero
        // O(n) time and O(1) space

        // int a[]  = { 1,1,2,2,3,3,4,5,5,6,6};
        int a[]  = { 1};

        int temp = 0 ;
        
        for (int i = 0; i < a.length; i++) {
              temp  = temp ^ a[i];
        }

        System.out.println(temp);


        // binary search  O(log n)

        // imagine the two half line which divide the left half (which has all double element)
        // right half satrt with ,non double element
        // normally , even index have first occurance , odd index have second occurance
        // in left half  , even have first, odd inddex have second occurance
        // in right  half  , odd index have first appppperance due to distortion by singl element , and even have second occurance of element

        // then by finding mid , check weather we are in left half or not'
        // try to come in left half , by eliminating the half part

        // overally we are trying to find that break line between two half 

        // take last index as  a.length-2 , have reason special

        // checking in left half is like, check mid index if odd then its even side have must have same elmnt , 
        // if our mid is in right half , it will not have even index as , first occurance
        //  l =  mid-1
        // as our mid fall in left half
        // shrink the left half , move start to mid +1 index

        // after that find mid again, is it in left half ,if we are in right half shrink right half
        // by moving high to mid-1

        // all this things will , give result as , low will standing at immidiately after left half
        // and high will be standing at immidiately before left half
        // due to shrinking effect
        // low is index is ans

        
        int s = 0;
        int l = a.length-2; // for special case handling we taking -2 index as last
        // we are handing sibgle element case here only
        // + last element is  single  , this case also handling
        // basically for avoiding out of bound index ,we need to take -2

        // so that e will never be last index and s will never out of bound as ( breaking while condtion is  s > l)
        //for single elent in array (lenght 1)
        // l = -1 ,s =0 
        // no condtion match (s <=l) ,while condtion breaks
        // so return ar[s]

        while (s <= l) {
            
            int mid = (s+l)>>1;

            if (mid % 2== 0 && a[mid] == a[mid+1]  || mid % 2 != 0 && a[mid] == a[mid-1] ){  // two ways we can be in left half
                //  we are in left half
                // just shrink s ,to mid +1
                s =mid+1;
            }
            else {
                // we will definately in right half
                //shrink l

                l =mid-1;
            }
        }
        
        System.out.println(a[s]);
    }
    
}


//  use bit manipulation most of times , decreases speed ,and interviever appreciate the concepts ,stand diff
// dividing by 2 ,  num>> 1
//  num^1 ,  if num is odd , will produce  num-1
//  num^1 ,  if num is  , will produce  num+1
