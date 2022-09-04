import java.util.Stack;

public class _21celebrity_problem {
 
    
    public static void main(String[] args) {
        
        //  O(n) time 
        // satck approch
        // O(n)  , space

        // elimination approach 
        // uncertain ans will be get , just make sure it is correct
        // so we will check its col row again 


        int  k =3 ;
        int indentity [] [] = {
            {0 ,1 ,0},
            {0 ,0 , 0},
            {1 ,1 , 0}
        };

        Stack<Integer> st = new Stack<>();

        for(int i =0 ; i  < k; i++ ){
            st.push(i);
        }

        int ind1;
        int ind2;
        for (int i = 0; i < k-1; i++) {
            
             ind1 = st.pop();
             ind2 = st.pop();

            if (indentity[ind1][ind2]==1) {
                st.push(ind2);
            } else {
                st.push(ind1);
            }
        }

        // after that ans is not ccertain so  , we will check row(which tells us that , this person or index dont know no one) and col( will tell us that the all other knows i index or person)
        int zeros = 0 ;
        for(int i =0 ; i <indentity.length ; i ++){

            if (indentity[st.peek()][i] == 0) {
                zeros++;
            }
        }

        if (zeros == indentity.length) {
            int ones =0 ;
            for(int i =0 ; i <indentity.length ; i ++){

                if (indentity[i][st.peek()] == 1) {
                    ones++;
                }
            }
            if (!(ones == indentity.length-1)) {
                System.out.println("no cel");
            }
            else{
                System.out.println(st.peek());
            }
        } 
        
        else {
            
            System.out.println("no cel");
        }
       

        







    }
}
