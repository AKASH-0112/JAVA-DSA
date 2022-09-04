import java.util.ArrayList;
import java.util.List;

public class _4ratinmaze_2 {

    static void solve(int i ,int j , int[][] maze ,String move ,  ArrayList<String> toans, int [][] vis ){

        if (i == maze.length-1 && j==maze.length-1) {
            
            toans.add(move);
            return;
        }

        // DLRU - as per lexicographycal scope of alphabets

        if (i+1 < maze.length && maze[i+1][j] == 1 && vis[i+1][j] == 0) {
            
            move =move + "D";
            vis[i][j] =1;
            solve(i+1, j, maze, move, toans, vis);
            vis[i][j] =0; //backtrack step
        }
        if (i-1 >= 0 && maze[i-1][j] == 1 && vis[i-1][j] == 0) {
            
            move =move + "L";
            vis[i][j] =1;
            solve(i-1, j, maze, move, toans, vis);
            vis[i][j] =0; //backtrack step
        }
        
        if (j + 1 < maze.length && maze[i][j+1] == 1 && vis[i][j+1] == 0) {
            
            move =move + "R";
            vis[i][j] =1;
            solve(i, j+1, maze, move, toans, vis);
            vis[i][j] =0; //backtrack step
        }
        if (i-1 >= 0 && maze[i-1][j] == 1 && vis[i-1][j] == 0) {
            
            move =move + "U";
            vis[i][j] =1;
            solve(i-1, j, maze, move, toans, vis);
            vis[i][j] =0; //backtrack step
        }
    }
    

    static ArrayList<String> allpaths (int maze[][]){

        int vis  [] [ ] = new int[maze.length][maze.length];
        // for (int i = 0; i < vis.length; i++) {
        //     for (int j = 0; j < vis.length; j++) {
        //         vis[i][j] =0;
        //     }
        // }

        ArrayList<String> toans = new ArrayList<>();

        if (maze[0][0] ==1) {
            solve(0 , 0 , maze , "" ,toans,vis);
        }

        return toans;
    }






    public static void main(String[] args) {
        

        int [ ] [  ]  maze= {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

        List<String> ans = allpaths(maze);


       for (int i = 0; i < ans.size(); i++) {

        System.out.print(ans.get(i)+" ");
       }



        
    }
}
