import java.util.Scanner;

public class _27total_setbit {
      public static void main(String[] args) {

            // --------------------  total numebr of set bits  upto given number
            // n=4 
            // then , setbit of(1 +2+3+4)
            // given total
            Scanner sc= new Scanner(System.in);
            int x = sc.nextInt();
            int count  = 0;
            for (int i = 1; i <= x; i++) {
                  
                  int num = i;
                  while (num!=0) {
                        int rsb = num & -num;
                        num= num-rsb;
                        count++;
                  }
            }
            System.out.println(count);
      }
}
