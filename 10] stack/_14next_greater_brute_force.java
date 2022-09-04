import java.util.Arrays;

public class _14next_greater_brute_force {
    
    // cyclic 
    // brute force  
    //O(n^2)


    public static void main(String[] args) {
        
        int nums[] = {5,3,9,12,5,6,87,34};
        int[] res = new int[nums.length];

                for (int i = 0; i < nums.length; i++) {
                    res[i] = -1;// initial value , if not have any greater , it remains -1
                    for (int j = 1; j < nums.length; j++) {

                        if (nums[(i + j) % nums.length] > nums[i]) {
                            res[i] = nums[(i + j) % nums.length];
                            break;
                        }

                    }
                }         
            System.out.println(Arrays.toString(res));
      
    }
}
