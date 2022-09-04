import java.util.Arrays;

public class _19flood_fill_matrix {

    static void floodfill(int[][]a ,int r ,int c , int tofill , int prefill){

        if (r >= a.length || r<0 || c>= a[0].length  ||c<0 ) {
            
            return;
        }
        if (a[r][c] != prefill) {
            return ;
        }

        a[r] [c] = tofill;

        floodfill(a, r-1, c, tofill, prefill);
        floodfill(a, r+1, c, tofill, prefill);
        floodfill(a, r, c+1, tofill, prefill);
        floodfill(a, r, c-1, tofill, prefill);
        

    }
    public static void main(String[] args) {
        
        int a[][] = {
            { 1,2,2,2,3},
            {1,1,1,2,3},
            {1,1,2,2,3},
            {2,1,2,3,3},
            {2,2,2,2,2}
        };

        for (int i = 0; i < a.length; i++) {
            
            for (int j = 0; j < a[0].length; j++) {
                
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        floodfill(a, 2,2,0,2);
    
        for (int i = 0; i < a.length; i++) {
            
            for (int j = 0; j < a[0].length; j++) {
                
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
   
    }
}

/// O(4^n)