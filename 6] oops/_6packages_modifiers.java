

class B2{
   private String pass;

   public void getpass(){
    setpass("efsf");
    System.out.println(pass);
   }

   private void setpass(String pass){ // so what use of private metho
    String password =pass; // to use insie class only
   }
}

public class _6packages_modifiers {
    public static void main(String[] args) {
        

        //  packages are similar class file in folder (package name)
        // java .util . Scanner;
        // java package  , util subpackage , Scanner class file

        // import for adding
        // package bank; for craeting package

        //  javac  -d . bank.java  -- to create package at per given folder
        // java java.mypck.bank  -- to run class file
        // lang and cwd is default pack imported 


        //  4types in java
        // 1] default
        // 2 ] public
        // 3] protected
        // 4 ] private(getters and seeters for accesing )


        

    }
}
