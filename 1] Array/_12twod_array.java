import java.util.Scanner;

public class _12twod_array {
    public static void main(String[] args) {
        // java is  zero indexed based language
        //  momory is contigious and like strips on eachother
        // each box is basically 4 bytes
        // for short it is 2 bytes for each iteam
        
        //( row * col ) * size of datatype  === total memory

        int A[][] = new int[2][3];


        // --------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
        int col =sc.nextInt();

        int Arr [] []  =new int [row][col];


        //  java indexing is from 0 so

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Arr[i][j]= sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }


        //  search in it
        int search_Number = sc.nextInt();

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[0].length; j++) {
                
                if (Arr[i][j]==search_Number) {
                    System.out.println("("+ i +"," +j+")");
                }
            
            }
        }


    }
}
