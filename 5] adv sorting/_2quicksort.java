import java.util.Arrays;

class _2quicksort{



    // O(nlogn) best case   - --  list is not sorted and partion indx laways at midle
    // O(n^2)  worsete case  ---- sorted array
    // pivot - can be 1st, last, median, avg of array  , is point jiske around sbhi chize clti h , hero
    // partition - pivot divide array into two , those are partitions

    // no need of extra array , merged array 
    //  we will divide array such that , smaller ele than pivot wil be first divdion and greter is second partition



    // *************************************************
    //  in each time we will be deciding the postion of pivote


    public static void quicksort(int A[] ,int lo ,int hi){

        if (lo >=hi) { // > must h
            return;
        }

        int pivote  = A[hi];

        int pi = partition(A, lo ,hi,pivote);

        quicksort(A, lo, pi-1);
        quicksort(A, pi+1, hi);

    }

    public static int partition(int A[] ,int lo ,int hi,int pivote){

        int i = lo ;
        int  j= lo ;

        while (i <= hi) {
            
            if (A[i] <= pivote) {
                swap(A, i, j);
                i++;
                j++;

            } else {
                i++;
            }
        }
        return j-1;
    }
    public static void swap(int A[] , int i , int j ){

        int temp =A[i];
        A[i] = A[j];
        A[j]=temp;
    } 
    public static void main(String[] args) {
    

        int A [] = {3,5,8,2,1};

        quicksort(A,0 ,A.length-1);
        System.out.println(Arrays.toString(A));
    }
} 

//  single element is alsways sorted

// heght of tree will be log n when pivote of each time is medium
// then  log n  *  n

// when height is  n , when sorted array and pivote element postion is itself only ,
// second call will never execute sort(A,pi+1,hi) bcz pi+1  will be > hi