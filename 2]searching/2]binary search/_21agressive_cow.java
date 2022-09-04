import java.util.Arrays;

public class _21agressive_cow {

    public static void main(String[] args) {
        // binary search approach (binary search on ans)
        // O(n log n)

        // we know if we cant take min distance as 4 , then we even cant take > 4
        // so find search space
        // int inp[] = {1,2,8,4,9};
        // [1,,,,,,,, a[l]-a[0] ]
        // as cows number [2,n] , as we take less cows we get more dist , so max dist
        // between them is when cows are2

        int n = 5, m = 3;
        int a[] = { 1, 2, 8, 4, 9 };
        Arrays.sort(a); // must to sort as we will have e value correct

        int s = 1;
        int e = a[a.length - 1] - a[0];

        while (s <= e) {

            int mid = (s + e) >> 1;

            if (ispossible(a, mid, m)) {
                s = mid + 1;
            } else {

                e = mid - 1;
            }
        }
        System.out.println(e);

    }

    public  static boolean ispossible(int a[] ,int mid ,int cows){

        int k = a[0];
        cows--;
        for (int i = 1; i < a.length; i++) {
            
            if(a[i] - k >= mid){
                cows--;

                if (cows==0) {
                    return true;
                }

                k =a[i];
            }
        }

        return false;
    }
}
