import java.util.Scanner;

public class _3conditional_statemen {
    public static void main(String[] args) {
        // -------------------if else 

        //  % is for reminder 
        // we use for , x%2 ==0 means divisible by 2

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if(x >18){
            System.out.println("yes u r allowed ");
        }
        else{
            System.out.println("not allowed");
        }

        if (x%2==0) {
            System.out.println("enven number");
        } else {
            
            System.out.println("odd");
        }

        // else if ladder
        // ( we can also use if if if else but it will check all if ,even first one executed so to avoid this we use if else ladder)\
    
        if(x>10) {
            System.out.println("greter than 10");
        } 
        else if(x>20) 
        {
            System.out.println("greater than 20");
        }
        else{

            System.out.println("less than 10");
        }
        System.out.println("------------------------------------------------------");
        if(x>10) {
            System.out.println("greter than 10");
        } 
         if(x>20) 
        {
            System.out.println("greater than 20");
        }
        else{

            System.out.println("less than 10");
        }

        //  if statement inside if is single no nedd of braces 
        //  ; terminate the statement    if(x>12); sysout("akash")  , akash will always print 



        // ---------------------switch cases
        int button = sc.nextInt();

        switch (button) {
            case 1:
                
            System.out.println("ramram");
                // break;   if input is 1 then it will give  ram ram and hellow
        
            case 2:
                
            System.out.println("hello");
                break;
        
            case 3:
                System.out.println("namaste");
                break;
        
            default:
            System.out.println("invalid button");  // no need of break as switch ends
        }
    

        
        
    }


}
