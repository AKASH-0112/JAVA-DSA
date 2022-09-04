
class ratinMAze_1 {

//  pritning the matrix , by which rat can reach
// any one solution 

  static void fun (int i ,int j , int  a[][] , int ans [][] ){

    if(i == a.length-1 && j ==a.length-1){

      ans[i][j]  =1;
      
      return;
    }
    // DLRU
    if ( i +1 < a.length && a[i+1][j] ==1 && ans[i+1][j] ==0 ) {
      ans[i][j] = 1;
      // vis[i][j] = 1;
      fun(i+1, j, a, ans );
    }
    if ( j-1 >=0  && a[i][j-1] ==1  && ans[i][j-1] ==0) {
      ans[i][j] = 1;
      // vis[i][j] = 1;
      fun(i, j-1, a, ans );
    }
    if ( j+1 <a.length && a[i][j+1] ==1 && ans[i][j+1] ==0 ) {
      ans[i][j] = 1;
      // vis[i][j] = 1;
      fun(i, j+1, a, ans);
    }
    if ( i-1 >=0  && a[i-1][j] ==1 && ans[i-1][j] ==0 ) {
      ans[i][j] = 1;
      // vis[i][j] = 1;
      fun(i-1, j, a, ans );
    }

  }

  public static void main(String[] args) {

    int n = 4;
    int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

    // int vis [] [ ] =new int[4][4]; 

    int ans [] [] =  new int[4][4]; 

    if (a[0][0]==1) {
      fun(0,0,a, ans  );
    }

    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans.length; j++) {
        System.out.print(ans[i][j]);
      }
      System.out.println();
    }



    
 
  }
}