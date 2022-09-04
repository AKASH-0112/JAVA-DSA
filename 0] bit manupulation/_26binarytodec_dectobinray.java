public class _26binarytodec_dectobinray {

      static void toBinary(int x){

            for (int i = 31; i >=0; i--) { // considering the input is int (32 bits )

                  int num  = (x>>i) & 1; 

                  if (num==1) {
                        System.out.print(1+" ");
                  } else {
                        
                        System.out.print(0+" ");
                  }

            }
            System.out.println();


      }

      static void todecimal(int x){
           
      }

      public static void main(String[] args) {
            
            //------------------- decimal to binary
            toBinary(7);

            
            System.out.println(Integer.toBinaryString(7)); // built in function for it

      
            int x =6 ;
            String str = "";
            while (x!=0) {
                  int r = x%2;
                  str = str +r;
                  x=x/2;
            }
            System.out.println(str);


            //---------------- binary to decimal


            System.out.println(Integer.parseInt("1010",2)); //  RADIX IS BASE // AND INPUT MUST BE IN STRING

            
            int x1 =1010;
            double sum = 0;
            int r;
            int i;
            i=0;
            while (x1!=0) {
                  r= x1%10;
                  if (r==1){
                        sum= sum+ Math.pow(2, i);
                  }
                  x1=x1/10;
                  i++;
            }
            System.out.println(sum);
            
            
            


            
   



      }
}
