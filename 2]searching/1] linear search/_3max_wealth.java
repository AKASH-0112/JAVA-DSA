public class _3max_wealth {

    public static void main(String[] args) {
        
        // wealth is sum of all bank acount money
        // 3 persons and have 3 difff bank acc
        
        int[][]  act = {
            {1,2,3},
            {3,2,9},
            {1,9}
        };
    
        System.out.println(maxWealth(act));
    }

    static int maxWealth(int[][] A){

       int  max_wealth = Integer.MIN_VALUE;

       for (int[] is : A) {
           int sum =0;
           for (int is2 : is) {
               sum = sum+is2;
           }
           if(sum>max_wealth){
               max_wealth=sum;
           }
       }

       return max_wealth;


    }
}
