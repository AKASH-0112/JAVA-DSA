import java.util.Arrays;
import java.util.Stack;

public class _11Next_greater_element_to_right {
    //  two varients are there , 
    // 1 ]  just check uptill end , not found -1 
    // 2 ]  uptill end check not found   , come again one 0th index and check uptill elem index
    public static void main(String[] args) {
        
        // ************************************** 1st varient 

        //O(n^2)
        //O(1)
        int a[] = {2,5,1,6,7,12,9};

        for (int i = 0; i < a.length; i++) {
            
            for (int j = i+1; j < a.length; j++) {
                
                if(a[j] > a[i]){
                    a[i] =a[j];
                    break;
                }

                if (j == a.length-1 && a[j] <= a[i]) {
                    
                    a[i]=-1;
                }
            }
        }
        a[a.length-1] = -1;   // needed as it will not able to reach there ,

        System.out.println(Arrays.toString(a));


        //O(n)
        //O(n)space

        int arr [] = {2,5,1,6,7,12,9};

        int li =arr.length-1;

        Stack<Integer> st = new Stack<>();
        while (li >=0) {
            

            if(st.empty()){
                st.push(arr[li]);
                arr[li] = -1;
            }
            else if (arr[li]  > st.peek()) {
                    
                while (  !st.empty() && arr[li] > st.peek()) {  // st.peek() must be after ,  !st.empty() , otherwise stack empty exception will be there
                     st.pop();
                }

                if(st.empty()){
                    st.push(arr[li]); // no nedd to store as we will be give -1
                    arr[li] = -1;
                }
                else{
                    int temp = arr[li];// need to store before
                    arr[li] = st.peek();
                    st.push(temp);
                }
            }
            else if(arr[li] < st.peek()){
                int temp =arr[li]; // need to store before
                arr[li] = st.peek();
                st.push(temp);
            }


            li--;
        }
        System.out.println(Arrays.toString(arr));



    }
}
//intuation 
//            3  2  4  5
// we are at 3 , stack has 2 4 5
// if 3 is greter than 2 then remove it frm stack 
// 3 will be next greter for any one of left ele , and 2 cant be so we can remove it

//  x  -- 2x x/2 x 5x   , x and x/2 is of no use there