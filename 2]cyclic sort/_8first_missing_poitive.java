
import java.util.Arrays;

public class _8first_missing_poitive{

    public static void swap(int a[] ,int i ,int currect_index){
        int temp = a[i];

        a[i] =a[currect_index];
        a[currect_index] =temp;
    }
    public static void main(String[] args) {
        
        // by cyclic sort O(n)

         int nums[] = {3,4,-1,1};
         int  i = 0;
         while (i < nums.length) {
            int currect = nums[i]-1;
            if ( nums[i] >0 && nums[i] <= nums.length && nums[i] != nums[currect]) {
                swap(nums, i, currect);
            }
            else{
                i++;
            }
         }
         System.out.println(Arrays.toString(nums));
         for (int j = 0; j < nums.length; j++) {
            
            if(nums[j]-1 != j){                                                                 
                System.out.println(j+1);
            }

            if(j==nums.length-1 && nums[j]-1 !=j ){
                System.out.println(j+2);
            }

         }


        
     
    }

}