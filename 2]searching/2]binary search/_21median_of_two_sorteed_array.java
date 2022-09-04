public class _21median_of_two_sorteed_array {
    public static void main(String[] args) {
        
        //  given 2 array , sortted 
        // of diff length
        // merged them(another sorted array) and find median
        // even length ,  2 meadiamas avg
        // odd length ,  then middle one is meadean
        
        
        // brute force
        // time O(n1+n2)
        // space O(n1+n2)

        int a [] = {1,4,6,9};
        int b [] = {2,3,5,10,14,18,20};
        System.out.println(median(a, b));
    }
    public static int median(int a [],int b[]){
        int merged [] = new int [a.length +b.length];

        int merind =0;

        int i =0;
        int j=0;

        while (i < a.length && j <b.length) {
            
            if (a[i] < b[j]) {
                merged[merind] = a[i];
                i++;
                merind++;
            }
            else if(a[i] > b[j]){
                merged[merind] =  b[j];
                merind++;
                j++;
            }
        }

        while ( i< a.length) {
            merged[merind] = a[i];
            i++;
            merind++;
        }
        while ( j< b.length) {
            merged[merind] = b[j];
            j++;
            merind++;
        }

        if(merged.length % 2 ==0){
            int firstocc = merged.length/2;
            int ssecocc = firstocc+1;

            return (merged[firstocc]+merged[ssecocc])/2;
        }

        return merged[merged.length/2];
    }
}


//  if we want to optimize more space dont create ,ds new array
// just see length sum of two ,array
// maintain a counter variable index
// as it reaches the desire count print its value ,
// in case even maitaine 2 counter variables
//O(1) space complexity 