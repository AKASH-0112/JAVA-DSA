import java.util.Arrays;
import java.util.Stack;

public class _13Next_greater_to_right {
    public static void main(String[] args) {
        
        //  2]  varient second  , cycle allowed 

        // int nums []  = {9 ,4,3,1,8};
        // int nums []  = {1,1,1,1,1};
        int nums []  = {100,1,11,1,120,111,123,1,-1,-100};
        // int nums []  = {1,2,3,4,3};
        int size = nums.length;
        Stack<Integer> st = new Stack<>();

        int [] ansarry = new int [size];

        st.push(0); // index pushed
        int l = 2*size;
        int  i=  1 ;

        while (i < l) {
        
                if(nums[i%size] > nums[st.peek()]){

                    while (!st.empty() && nums[i%size] >nums[st.peek()]) {
                        ansarry[st.peek()] = nums[i%size];
                        st.pop();
                    }
                    
                    if(i < size){
                    st.push(i);}

                }
                else if(nums[i%size] < nums[st.peek()]){

                    if(i < size){  // just push below size index
                    st.push(i);}
                }

            i++;
        }

        while (!st.empty()) {
            ansarry[st.peek()] =-1;
            st.pop();
        }
        System.out.println(Arrays.toString(ansarry));
    }
}

//  for cycle we use  %
// we craeted imaginary array , by doubling length , and by using % we fetch ele
// just  not to add  i in stack if i > size-1


//  why we need extra array , in such case is dur to if we change elements and  after size  >n , we are accesing them again 
// but they might updated in case , so take extra array