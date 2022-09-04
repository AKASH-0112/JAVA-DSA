import java.util.Arrays;

public class _6search_in_2d_aray {
    public static void main(String[] args) {
        int [] [] ary ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(Arrays.toString(search(ary,6)));
    }


    static int[] search(int[][] A , int tar){


        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                
                if(A[i][j]==tar){
                    int[] ans ={i,j};
                    return ans;
                }
            }
        }
        return new int[] {-1,-1};
    }
}
