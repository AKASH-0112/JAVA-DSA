import java.util.*;

public class _13twod_prcat_que {
    public static void main(String[] args) {
        
    // ---------------- spiral order of matrix

        int A[] [] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
         int col_start = 0;
         int col_end = A[0].length-1;
         int row_start =0;
         int row_end =A.length-1;

    while (col_end>= col_start && row_end>= row_start) {
        for (int i = col_start; i <=col_end; i++) {
            System.out.print(A[row_start][i]+" ");
        }
        row_start++;
        for (int i = row_start; i <= row_end; i++) {
            System.out.print(A[i][col_end]+" ");
        }
        col_end--;
        for (int i = col_end; i >= col_start; i--) {
            System.out.print(A[row_end][i]+" ");
        }
        row_end--;
        for (int i = row_end; i >=row_start; i--) {
            System.out.print(A[i][col_start]+" ");
        }
        col_start++;
  
        System.out.println();
    }
    
    
    //------------- transpose of matrix
    
    int AA[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int AAA [] [] = new int[3][3];
    for (int i = 0; i < AA.length; i++) {
        for (int j = 0; j < AA.length; j++) {
            
            AAA[i][j]=AA[j][i];
        }
    }
    for (int is[] : AAA ) {
        for (int is2 : is) {
            System.out.print(is2+" ");
        }
        System.out.println();
    }
    
    
}

}


