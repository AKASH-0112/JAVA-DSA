import java.util.Arrays;
import java.util.Stack;

public class _19sliding_window_maximum { 
    public static int[] maxSlidingWindow(int[] nums, int k) {
        
    int ans []  =  new int[nums.length -k +1];
    
    
    int ngei [] =new int[nums.length];
    Stack<Integer> st = new Stack<>();
    
    ngei[nums.length-1] = nums.length;
    st.push(nums.length-1);
    int i = nums.length-2;
    while(i >=0){
        
        while(!st.empty() &&  nums[i] >= nums[st.peek()]){
            st.pop();
            }
        if(st.empty()){
            ngei[i] = nums.length;  // jist next greter nhi uska windos ke baher aayega
            // nicke hm chek kr rhe agr ,  < x+k  h to  j = ngei[j]
            // so yha pr , vo kisi ke range me na aaye so we make it outof range which is length
        }
        else{
            ngei[i] = st.peek();
        }
        
        st.push(i);
        i--;
    }
    
    for(int x = 0 ; x <= nums.length -k; x++){
        int j =x;
        while(ngei[j] < x + k ){  // check weather next greater  of j , is inside k grp
            j = ngei[j]; // if yes then  , jump to that index 
        }
        //after while j will have index whoose next greter is outside k grp , which is our ans only
        ans[x] = nums[j];
    }
  
    return ans;
}
    
     // O(n) by stack approch
        //  find all next greter element to right , store its index in array
        // then find in k grp , which has next greter outside the grp , is max in that grp
        //  next greter is not in grp means , all are short next to it

        // we will us 2 pointer  i,j
        // x will be traveling each window  ,start 
        // j  will jump to next greter of i then agin next greter untill the nextgreter of that grp bcmz out of grp

        // i==j at start of next grp window 

        //  at the end we will have th j index which is max in that grp

    public static void main(String[] args) {
        
        int nums [] = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }
}
