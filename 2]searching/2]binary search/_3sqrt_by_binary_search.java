public class _3sqrt_by_binary_search {
    public static void main(String[] args) {
        
        // Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
        // for x=4 ,   2
        // for x=8 , 2 root(2) , but root 2 is decimal so ignore , return 2 only

        //******  brute force  , O(root(n))
        // 25 , we will see one by one from 1----25
        // max can be upto 5 we compare


        //****** binary search approach , O(log n)
        // log n <<< root(n) complexity comparison
        // if n=27 , then ans must be lie between , 0----27 , which is sorted array
        // s =0 ,e =x   ( we are applyig on element direct ) , why  0 bcz to handle  n=0 case
        // we will be doing , bS on this range
        // then compare if mid*mid > target ,then e=mid-1
        // if target > mid*mid , just s=mid+1 , and we will be storing the privous mid as, decimla digit sare truncated 
        // if we dont able to find  mid , such mid*mid == target , we will be return previous mid
        // eg,.

            System.out.println(sqrt(26));
            System.out.println(sqrt(37));
        
    }

    public static long sqrt(int x) {

        long s = 0; // ele  , start from  0 as for 0 case ,x=0
        long l = x;

        long previousans = -1;

        while (s<=l) {
            long mid  = s+(l-s)/2;

            if (x == mid*mid) {
                return mid;
            }
            else if( x > mid*mid){
                previousans =mid; // must to store before value , bcz we will never get perfect squire aage
                s =mid+1;
            }
            else if(x < mid*mid){

                l= mid-1;
            }
        }
        return previousans;

    }
}
//  search space , ans can be found in it
// take squre store in long , otherwise we will get error