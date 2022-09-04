import java.util.Arrays;

public class _18sliding_window_maximum {
    

    // O(n^2)
    // max window  of k grp
    public static void main(String[] args) {
        int nums [] =  {1,3,-1,-3,5,3,6,7};
        int k =3 ; 

        int ans[] = new int[nums.length-k+1];

        for (int i = 0; i <= nums.length-k; i++) {
            int maxval = Integer.MIN_VALUE;

            for (int j = i; j < k+i; j++) {
            
                if (maxval < nums[j]) {
                    maxval =nums[j];
                }
            }
            ans[i] = maxval;
        }       
        System.out.println(Arrays.toString(ans));


    }
}



//  finding  next max and all que , use candle diagram ,better understanding