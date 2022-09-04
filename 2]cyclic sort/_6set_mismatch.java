
import java.util.Arrays;

public class _6set_mismatch {
    public static void swap(int a[] ,int i ,int currect_index){
        int temp = a[i];

        a[i] =a[currect_index];
        a[currect_index] =temp;
    }

    public static void main(String[] args) {
     
        //  [1 ,n]
        // contain an element duplicate 
        // which is mismatch to which element

        // find duplicate , and what should on it place we shoul return 


        int ary[] ={ 1,2,2,4}; //  3ki jgh 2 again ayaa
        // so return [duplicate , right ans  ]
        int i =0 ;
        while ( i <ary.length) {
            
            int currect_index = ary[i]-1;

            if (ary[i] != ary[currect_index]) {
                
                swap(ary,i,currect_index);
            }
            else{
                i++;
            }
        }
        int ans [ ] = new int [2];

        for (int j = 0; j < ary.length; j++) {
            
            if(ary[j]-1 != j){
                ans[0] =ary[j];
                ans[1]=j+1;
            }
        }


        System.out.println(Arrays.toString(ans));
    }
}
