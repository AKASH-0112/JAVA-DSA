import java.util.Scanner;

 class _25power_of_2 {

      public static boolean isPoweroftwo(int x){

            if(x==0) return false;

            while (x!=1) {
                  
                  if(x%2 != 0){  // if remainde r zezo nhi hoga kisis stage ya first satge pe , to vese bhi 2 ka power nhi hoga na vo
                        return false;
                  }
                  x=x/2;
            }
            return true;
            

      }
      public static void main(String[] args) {
            
            /*
            if  multiple by 2 to a number  ,  num << 1
            -- num<<2  them multiply by 2^2   --- num<<3  multioly by 2^3
            if divide by 2 to a number ,    num >>1
            -- num>>2 then divde by  2^2
            
            1<<2  ,   100   , 2^2
            1<<3  ,   1000  , 2^3
            1<<x  ,   1 ----- x times0   , 2^x

            for any 2 power numer  n ,
            AND of  n & n-1 always  0
            
            */
            
            Scanner sc = new Scanner(System.in);
            int a  = sc.nextInt();

            // 1]  reduce number - then use 
            // O(1)

            if ((a&(a-1)) == 0){
                  System.out.println("yes it is power of 2");
            } else {
                  System.out.println("no not power of 2");
            }

            // 2]  count set bit( power of 2 have 1 set bit only)
            // alsowe can  use kernagals algirtham
            // O(log n)

            int count = 0;
            int i =0;
            while (i<=32) {
                  
                  if((a & (1<<i)) != 0 ){
                        count++;
                  }
                  i++;
            }
            if (count==1) {
                  System.out.println("yes it is power of 2");
            } else {
                  System.out.println("no it is not power of 2");
                  
            }

            //3]  go on dividning untill first quuestion comes 1( if remaind remain wjile deviding return false directly ,bcz  2 power number will always be even ,so whie didviding by 2 no remiander should remains)
            //O(log n)

            System.out.println(isPoweroftwo(a));
            

            //4]  floar and ceil (of maths)
            // O(1)
            // a = 16
            //  log2(16) = log (16)/log(2)=log(2^4)/log(2)= 4
            // floor and ceil of 4 will 4 only 

            // and if we pass non power 2number ,then the log(12) = decimal point which effects flooar and ceil ,make them diff(not equal)

            if (a == 0) {
                  System.out.println("0 cant be power of 2");
            } else {
                  
                  System.out.println(Math.ceil(Math.log(a)) == Math.floor(Math.log(a)));
            }



            




           
           
            
      }
}
