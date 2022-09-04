import java.util.Arrays;
import java.util.Stack;

public class _12Next_greter_to_right_ {
    public static void main(String[] args) {
        //  from starting  index we can also do
        //  next element  , use chote ko pop krega and uska ans bn jayega 
        // at last push hoga ele vhi 

        // it is like cl bhay uth ja tera next big element aa gya h

        //  we use here index bcz we need to assign valus too
        int a[] = {2,5,1,6,13,12,9};


        Stack<Integer> st =new Stack<>();

        st.push(0);
        int i = 1;
        while (i < a.length) {
            
            if(a[i] >  a[st.peek()]){

                while ( !st.empty() && a[i] > a[st.peek()]){
                    a[st.peek()] = a[i];
                    st.pop();
                }

                st.push(i);
            }
            else if( a[i] < a[st.peek()]){
                st.push(i);
            }

            if(i == a.length-1){
                a[i]=-1;
                
            }
            
            i++;
        }

        // this is for rmaining index in satck which do no have greater elem in right 

        while (!st.empty()) {
            int ind = st.pop();
            a[ind]=-1;
        }
        System.out.println(Arrays.toString(a));
    }
}
