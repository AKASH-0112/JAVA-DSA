
import java.util.Arrays;
import java.util.HashMap;

public class _22next_greater_ele_II {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int nge  []= new int[nums2.length];
        
        java.util.Stack<Integer> st =new java.util.Stack<>();
        
        nge[nums2.length-1] = -1;
        st.push(nums2[nums2.length-1]);
        int iii =  nums2.length-2;
        while( iii >= 0){
            while(!st.empty() && nums2[iii] >= st.peek()){
            st.pop();
            }
            if(st.empty()){
                nge[iii] = -1;
                st.push(nums2[iii]);
            }
            else{
                nge[iii] = st.peek();
                 st.push(nums2[iii]);
            }
            
            iii--;
        }
       
        int ans [] = new int[nums1.length];
        
        HashMap<Integer ,Integer> m = new HashMap<>();
        
        for(int i = 0 ; i <nums2.length ; i++){
            m.put(nums2[i] , nge[i]);
        }
        
        for( int  i =0 ; i< nums1.length ; i++){
            
            ans[i] = m.get(nums1[i]);
        }
        
        
    return ans;
       
    }

    public static void main(String[] args) {
        
        int [] nums1 = { 2,3,6};
        int [] nums2  ={ 1,4,2,8,5,3,4,6};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
