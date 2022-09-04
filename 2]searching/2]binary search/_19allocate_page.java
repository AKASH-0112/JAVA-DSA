public class _19allocate_page {
    
    // O( k log n  + n)

    public static void main(String[] args) {
        //  given  , index as books , array number as pages 
        // k , no of student which gonna read
        // rules 1] one book ,entire no half half cut down allowed
        // 2 ]  every student musthave atleast 1 book to read , yesa nhi ho skta ki sari ek ne pdh di
        //3 ] books are allocated in continuous manner 
        
        // array , of no of pages can be unsorted or sorrted 
        // still we will use binary search

        // try to do allocation such that ,   max pages allocate to student , must be min of all cases
    
        // eg, 10 20 30 40  , k=2
        // 10- 90  ,30-70 , 60-40 ,   return that max between allocation which have smallest value in all cases max 
        // max no of pages allocate should be as samll as possible
        //-----------------------------------------------------------------------------------------------------------

        //where we can apply binary search , on search space 
        // so here search space must be, all ans(that the max no of pages alocated to student)
        //[ all posible max values] is search space

        // suppose array [12 12 12 12]
        // k=4; then min max value == min of array(of pages)
        // suppose array [ 12 34 43]
        //k=1  ,then max value of pages can aaloacte is 89


        // [10 20 30 40] , k=2
        // [10  ... .. .  100]
        // a[mid] will be barrier for allocation (max value of pages untill which we can allocate to an student)
        // if we are not able to allocate all books within k student having barrier a[mid]
        // and we need one more student to allocate all books
        // so means that a[mid] value will not be ans
        // and ans must be greter than that , so that we can allocate all books to both students
        // if possible to allocate all book to k students ,then that may be ans ,store it 
        // and move to left as we need aur minimal ans
        
        
        int a[] = {10 ,20 ,30,40};
        int k =2;

        int sum = 0;
        for (int i : a) {
            sum=sum+i;
        }

        int s=a[0] ;
        int l = sum;
        int ans = -1;

        while (s <= l) {
            int mid = (s+l)/2;
            
            int barrier = mid;
            if (isAllocationPossible(barrier,a ,k)) {
                ans= barrier;
                l =mid-1;

            } else {
                s =mid+1;
            }
        }

        System.out.println(ans);

    }

    public static boolean isAllocationPossible(int barrier ,int a[] ,int k){

        int std =1;
        int pages =0;

        for (int i = 0; i < a.length; i++) {
            
            if (a[i] > barrier) {  // means an book is there greter than pages of barrier , no allocation poassible
                return false;
            }
            if (a[i] +pages> barrier ) {  // is going to  crossing the barries , dont add  ,crete new student and then add
                
                std=std+1;
                pages =a[i];  // page count also need to initialize again as , for new student we will also be chcekng that exceed barrier
            }
            else{
                pages=pages+a[i];
            }
            
    
        }

        if (std>k) {
            return false;
        }

        return true;


    }
}
// binary search on ans