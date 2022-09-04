import java.util.ArrayList;
import java.util.List;



// normal recuibve single call is not called backtracking 
// if we are changing node branch after one finished call that is backtrack
//code after recursive call

// all posible solution and we have have choosy too ,in base condtion

// eg.permutation of string ,

        // n*n chessboard
        // n quens
        // print all posible sol where qunees are safe (no one can fall any one)
        
        //quenne can travel 8dir at any distance

public class _1nQunees_1 {

    static boolean isSafe(int row  ,int col ,char[][] board){

        //horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[row][i]== 'Q') 
              return false ;  
            
        }
        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col]=='Q') 
                return false ;
            
        }
        //upper left
    
        for (int i = row , j =col ; (j>=0 && i>= 0) ; i-- , j--) {
            if (board[i][j]=='Q') 
                return false;
            

        }
        //upper right
    
        for (int i = row ,j =col;(j<board.length && i>= 0) ; i-- ,j++) {
            
            if (board[i][j] == 'Q') 
                return false;
        }

        // लोवर लेफ्ट
        for (int i = row ,j =col ; (i < board.length && j >= 0); i++ ,j--) {
            if (board[i][j] =='Q') 
            return false ;   
            
        }
        //lower right
        for (int i = row , j =col ; (i <board.length && j < board.length); i++ ,j++) {
            if (board[i][j] == 'Q') 
                return false ;
            
        }
        return true ;
    }


    static void saveBoard(char [ ] [] board ,    List<List<String>> allBoards){

        String row = "" ;
        List<String> newboard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row ="";
            for (int j = 0; j < board[i].length; j++) {
                
                if (board[i][j] == 'Q') { // this if elese is due to default value stored in char arrayb(in java) , so for them to ignore 
                    
                    row =row + "Q";
                } else {
                    
                    row =row + ".";
                }
            }
            newboard.add(row);
        }
          allBoards.add(newboard);
    }



    static void nqunees( int col , char[][] board ,    List<List<String>> allBoards){

        if (col == board.length) {
            saveBoard(board , allBoards); // save board will covert borad car 2d array's each row to string and add in to newboard and then new boerd list willl added to all boards 
            // which is list contains list of strings
            return ;
        }

        for (int i = 0; i < board.length; i++) {  // as per issafe cases the no of ccall will be on next level
            if (isSafe( i ,col ,board)==true) {
                
                board[i][col] = 'Q';
                nqunees(col+1, board, allBoards);
                board[i][col] = '.';
                
            }
        }
        // when not even single spot is not safe then the function end , as normal functin
        // and go to last call line 103
    }



    public static void main(String[] args) {
        
        int n =4;
        List<List<String>> allBoards = new ArrayList<>();
        char [] [] board =new char[n][n];

        nqunees( 0 ,board ,allBoards);


        System.out.println(allBoards.toString());

    }
}


//  O(n^n)
// also we can optimise by reducing lloop os isSafe()
//  hashing is way to optimize