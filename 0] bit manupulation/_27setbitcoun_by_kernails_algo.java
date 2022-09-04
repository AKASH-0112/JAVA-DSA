import java.util.Scanner;

public class _27setbitcoun_by_kernails_algo {
      public static void main(String[] args) {
            

            Scanner sc = new Scanner(System.in);
            int i =sc.nextInt();

            // 1
            int setbit_count =0;
            for (int j = 0; j < 32; j++) {  // but it check each and every bit (bad point)
                  

                  if (((i>>j) & 1) == 1) {
                   
                        setbit_count++;
                  }
            }
            System.out.println(setbit_count);

            //2 kernighans algoritham(only see  bit 1)

            /*
             x = 10 ,  1010
             rsb   = ,  0010
             x=x-rsb =  smae  2 ki power cut ho jana h so ,  1000
             while (x != 0) tk run krna h
             count++
             */

             int x =sc.nextInt();
             int no_of_set_bit =0;
             while (x!=0) {  
                   
                  int rsb = x & -x;
                  no_of_set_bit++;
                  x = x-rsb; // at end x bcms 0 and loop breka
             }
             System.out.println(no_of_set_bit);



      }
}
