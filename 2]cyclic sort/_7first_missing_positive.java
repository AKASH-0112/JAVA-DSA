import java.util.Arrays;
public class _7first_missing_positive {
    
    public static void main(String[] args) {
        
        // approch 1 
        // sort array in O(n log n)
        // take smallest postive number which is 1, as naive answer,
        // check is it present in array 0th index , if index have  -ve and 0 just skip them 
        // check for postive numbers only
        // if found means ans cant be , missing positive 
        // so ans ++;
        // as array is sorted ans =2 will be ahed of element 1 
        // O(nlogn  + n)
        //O(1) space
        int ary [] = {3,1,2,4,6};
        // int ary [] = {3,1,2};
        Arrays.sort(ary); // O(nlogn)
        int ans =1;
        for (int i = 0; i < ary.length; i++) {
            if(ary[i] <= 0){
                continue;
            }
            else if(ans == ary[i]){
                ans++;
            }
            else{
                System.out.println(ans);
                break;
            }
            if(ary[ary.length-1] == ans){
                System.out.println(ary[ary.length-1]+1);
            }
        }


        // approch 2 
        // O(n) 
        //O(n) space hashmap
        // int ar [] = { }


        

        


    }
}
