public class _22median_of_two_sorteed_array {
    public static void main(String[] args) {
        // imagine the sorrted of both 
        // divide it into two halfs 
        // if both combined array is even number
        // two half will be of equal ,size
        // we will take max from l1 l2 , and lest from r1 r2 
        // add them and /2 then return 
        
        // if odd , we will have  5  ,4 ratio 
        // and we will return max from left half 
        // int a []= {2,3,6,15};
        // int b []= {1,4,7,10,12};
        int b []= {1};
        int a []= {1};
        // int b []= {1,2};
        // int a []= {3,4};
        System.out.println(givemedian(a,b,a.length,b.length));
    }
    public static int givemedian(int a[],int b[] ,int m ,int n ){
        if (a.length > b.length) {// insure that ,a is small in size
            return givemedian(b, a, n, m);
        }

        int low = 0;
        int high = a.length;
        int lefthalf_total = (m+n+1)>>1;  // how much we need in left half (for both case )

        while (low <=high) {
            
            int cut1 = (low+high)>>1;  // mid value shows no of element , mid tk lena h elements 
            int cut2 = lefthalf_total -cut1;
            // cut is line after before that index , means  0 cut is before 0th index element
            // cut-1; is the element last in half
            int r1 =0; 
            int r2 =0;
            int l1 =0;
            int l2 =0;;
            if (cut1 ==0  ) {
                 l1 = Integer.MIN_VALUE;
                // int l2  =Integer.MIN_VALUE;
            }
            else{
                l1 = a[cut1-1];
            }

            if( cut2==0){
                 l2  =Integer.MIN_VALUE;
            }
            else{
                 l2  = b[cut2-1];
            }



            if (cut1 ==a.length) {
                  r1 = Integer.MAX_VALUE;
                }
                else{
                    r1 =a[cut1];
                }
            if(cut2==b.length){
                 r2 = Integer.MAX_VALUE;
            }
            else{
                 r2 = b[cut2];
            }
            //--------------------------------------------------------------------------------------------------------------------
            // lets just check if the the haf are correct or not and then change , search space
            if (l1 <= r2 && l2 <= r1) {  
                
                if ((a.length +b.length)%2==0) {
                    int f = Math.max(l1,l2);
                    int s = Math.min(r1,r2);
                    return (f+s)/2;
                } else {
                    return Math.max(l1, l2);
                }
            }
            else if( l1 > r2){
                 high =cut1-1;
            }
            else{
                low =cut1+1;
            }
        }
        return 0;
    }
}



/// we are playing with cut not index

// l1<= r2  equal ,  [1,1,1] [1,1,1]
// why to take smaller as a , 
// case  , [1]  []// , l2 =b[cut2-1]; here we will get stuck if dont reverse 