import java.util.Arrays;

public class _20aggresive_cow {
   
    public static void main(String[] args) {
        //  given  n , no of stalls
        //  n siz array ,with cordinates (1d)
        // given  k = no of cows , must be between [2 , n]

        // in all the combinations of cow placed at diff cordinates cases , there
        // find  min distance between two cows that is largest in amount (there might be a case which it can be happed)


        // *************brute force approch  , we will define minimum distance , 1
        // if we can able to place cows such that configuration retunr minimum , 1
        // move to next minumum ,2 
        // again check can we configure cows so that , min diff can possible 
        //if no we are at max minumum dist possible beteween cows
        // for loop for dist ,min\
        // inner will check possible to place or not

        int n = 5, m = 3;
        int inp[] = {1,2,8,4,9};
        Arrays.sort(inp);

        int maxD = inp[n - 1] - inp[0];
        int ans = Integer.MIN_VALUE;
        for (int d = 1; d <= maxD; d++) {  // loop for ans(min diff can be)
            boolean possible = isCompatible(inp, d, m); // chck min dist can possible
            if (possible) {
                ans = Math.max(ans, d); // if then , choose max from old and curr min distance
            }
        }
        System.out.println("The largest minimum distance is " + ans);

        
    }
    static boolean isCompatible(int inp[], int dist, int cows) {
       
        int k = inp[0];  // take first element to cound diff
        cows--; // means first cow at first position
        for (int i = 1; i < inp.length; i++) {  // puut cows on 1-n places
            if (inp[i] - k >= dist) { // if get postion where  , inp[i] - k(first ele) >= dist
                cows--;// place cow and try for next cow
                if (cows == 0) {
                    return true;
                }
                k = inp[i]; // store prev cow value to calculate next 
            }
        }
        return false;
    }
}

