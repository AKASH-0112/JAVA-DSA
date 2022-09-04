public class _4loops {
    public static void main(String[] args) {
        

        //  ----for loop

        for(int counter =0; counter<100 ; counter++){ // if terminating condtion not given , infinite loop
            System.out.println("hello world");
        }
        for(int i =0 ; i<11 ; i++){
            System.out.println(i);
        } 
        // dry run the code means , do each step roughly


        //-----while loop

        int i =0 ;
        while (i<11) {
            
            System.out.println(i);
            i++;
        }

        //--------do while

        int j =0;
        do{
            System.out.println(j);
            j++;
        }while(j<11); // terminator dyaan rkho

    }
}
