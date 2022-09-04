public class _11queArray {
    public static void main(String[] args) {
        // ---min max from array

        int Array[] ={3,5,9,1,5,7,54};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < Array.length; i++) {
            
            if (Array[i] > max) {
                max =Array[i];
            }

            if (Array[i]<min) {
                min =Array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);


        //------- check weather array is in accending or not

        int A [] ={ 1,2,3,4,5,6};
        int a[] ={4,3,2,6,8};
        boolean isAccending =true;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[i+1]) {
                isAccending =false;
            }

        }
        
        if (isAccending) {
            System.out.println("yes accednding");
        } else {
            System.out.println("not in accending");
        }
    }
}
