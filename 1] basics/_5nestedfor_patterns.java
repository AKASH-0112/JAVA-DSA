public class _5nestedfor_patterns {
    public static void main(String[] args) {
        

        // //  1 ] solid rectangle
        int n =4;
        int m= 5;
        for (int i = 1; i <=  n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" * ");
                
            }
            System.out.println();
        }

        //2] hollow rectangle 
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                
                if (i==1 || j==1 || i== n || j==m) {
                    System.out.print(" * ");
                } else {
                    
                    System.out.print("   ");
                }
            }
            System.out.println();

        }

        //3]half pyramid
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }

        System.out.println("-------------------------------------");
        //4] inverted half pyramid

        for (int i = n; i >=1; i--) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(" * ");
            }
            System.out.println();
        }

        //5] half pyramid (180 rotated)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
            // we can use j again as its scope is upto its braces
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //6] half pyramid with number
        int n1 =5;

        for (int i = 1; i <= n1; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //7] half inverted pyramid with number

        for (int i = n1; i >=1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

        //8] floyd triangle
        int counter =1;
        for (int i = 0; i <=n1; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

        //9] 0-1 triangle
        for (int i = 1; i <=n1; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                if ( (i+j )% 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
