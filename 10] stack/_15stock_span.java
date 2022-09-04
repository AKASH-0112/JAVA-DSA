import java.util.Arrays;
import java.util.Stack;

public class _15stock_span {
    

    public static void main(String[] args) {
        
        // stock span is ,continous number of days before price having less stock price from current day
        // brute force , O(n^2)   , when worste case , sorted 
        // O(n) if we use extra array
        int price[] = {100,80,60,70,60,75,85};
        for (int i = 0; i < price.length; i++) {
            int days =0 ;
            for (int j = i; j >= 0; j--) { // should run uptill greater appers ,so e use break
                
                if(price[i] >= price[j]){
                    days++;
                }

                else if(price[i] <price[j]){  // agr bdaa mil gya to break kro baki check kroge to days will increases
                    break;
                }
            
            }
            System.out.print(days+", ");
        }
        System.out.println();




        // optimal , stack approch
        // O(n) ,  O(n)

        // we will go on adding index ,  at any price we will pop , smaller price indexes uptill max price indexx occurs
        // at that we ,if we  will have non empty stack , and peek index will be  left greter for  given day price 
        // peek() - i will be span 
        // if we have emty stack , i +1 

        // think we are finding left first greatest element 

        int []ans = new int[price.length]; 

        Stack<Integer> st =new Stack<>();
        ans[0] =1;   // first price have always 1 span
        st.push(0); // push to st
        int i = 1;
        while (i < price.length) {
            
            while (!st.empty()  && price[i] >= price[st.peek()]) {  // if not empty and price is grter than peek() , remove and reach to greter price index to left
                st.pop();
            }

            //  after while , if the stack is empty, means all small prices to left,  sapn =i+1
            if(st.empty()){

                ans[i] = i+1;
                st.push(i);
            }
            else{
                // if stack is not empty after pops , twe are at greter price index (st.peek())
                ans[i] = i - st.peek();
                st.push(i);
            }

            i++;
        }

        System.out.println(Arrays.toString(ans));






        // we are removing smaller prices index before anyprice , and curr price index
        // if after ward if this curr is smaller to that price ,then usee smaller bhi  that price ke smaller honge so 
        // we will directly jumps to lagest index of before price
    }
}


//  keep moving 
// As we can see
// As it is