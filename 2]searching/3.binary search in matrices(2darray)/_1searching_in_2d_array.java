import java.util.Arrays;

public class _1searching_in_2d_array {
    public static void main(String [] A){


        // matrix is not sorted 
        int[][] ary ={
            {56,22,22},
            {47,51,10},
            {72,81,92}
        };

        System.out.println(Arrays.toString(linear_serach(ary,6)));

    }
    static int[] linear_serach(int[][]A,int target){
        int a [] ={-1,-1};
        for (int row = 0; row < A.length; row++) {
            
            for (int col = 0; col < A[row].length; col++) {
                
                if (target== A[row][col]) {
                    a[0]=row;
                    a[1] =col;
                    System.out.print("yes found! on below row col :");
                    return a;

                } 
            }
        }
        return a;
    }

    // comparions
    // worste case time compalexity is , O(n^2) -- in case of squre matrix 
    // in other than squrae matrix  , O(n*m) , row *col
}
