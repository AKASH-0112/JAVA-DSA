public class _12search_in_infinite_sorted_array {
    public static void main(String[] args) {
        // infinite array not exist
        // but we have to assume that
        // by not using .length function
        // as it is infinite we cant have length of array 

        //  without start and end we cant use binary serach
        // so we need to have chunks 
        // moving chunk ,to star end of any range

        
        // brute force approch , linear search
        // optimise sol is ,binary search

        // find start and end index having ur target element
        // shift chunk then apply binary search ,if the range chunk contains element


        // increasing size of window , exponationally
        // chunks we take are in  ,reverse of binary search breakig  , like first is between 2 then 4 then 8 ..... n size of array
        // this is same as time complexty O(log n), worste case
        
        int[] Ary ={2,3,4,5,6,7,8,9,10,11,12,15,20,23,30}; // assumme it is infinite

        System.out.println(ans(Ary,15));

    }

    static int ans(int [] A ,int target){
        int start=0;// chunk start 
        int end=1;

        //target element cant be less than start, if it there then it might found previously
        while (target>A[end]) { // jbtk target in not in rage double the chunk

           int  temp= end +1;  // we take temp bcz we are gonna use start var in end calculation
            // new end   = previousend ind + 2 size of previous box;
            //size of box = (end -start)+1; === end-(s-1)
            end = end +2*(end-start+1); // we eed to use last start so we use temp
            start =temp;
        }

        int ans  =search(A, target, start, end);
        return ans;
    }

    static int search(int a[],int target, int start ,int end){
        
        
        while (start<=end) {
            
            int mid =(start+end)/2;
            if(target==a[mid]){
                return mid;
            }
            else if(target>a[mid]){
                start =mid +1;
                
            }
            else{
                end =mid-1;
            }

        }
        return -1;

        }

    }



    // size of array by index
    // size = e-(s-1)