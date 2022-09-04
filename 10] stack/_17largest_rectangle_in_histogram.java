
import java.util.Stack;

public class _17largest_rectangle_in_histogram {
    
    public static void main(String[] args) {
        //  O(n) time 
        // O(n)  space
        // stack approch

        // for each height , we will find left samllest and right smallest element index
        
        int arr[] = {6,2,5,4,5,1,6};
        // int arr[] = {2,4};
        int [] rse  = new int [arr.length];

        Stack<Integer> st1 = new Stack<>();

        rse[arr.length-1] = arr.length;  // next smaller to right of last height , we conside it as length indexx
        st1.push(arr.length-1);
        int s = arr.length-2;
        while (s>=0) {

            while (!st1.empty()  && arr[s] <= arr[st1.peek()]) {
                st1.pop();
            }

            if(st1.empty()){
                rse[s] = arr.length;
                st1.push(s);
            }
            
            if(arr[st1.peek()] < arr[s]){
                rse[s] = st1.peek();
                st1.push(s);
            }
            s--;
        }

        int [] lse  = new int [arr.length];

        Stack <Integer> st2  =new Stack<>();
        lse[0] = -1;
        st2.push(0);
        int ss  = 1 ;
        while (ss <arr.length) {
            

            while (!st2.empty()  &&  arr[ss] < arr[st2.peek()]) {
                st2.pop();
            }


            if(st2.empty()){
                lse[ss]= -1;
                st2.push(ss);
            }
            else{
                lse[ss] =st2.peek();
                st2.push(ss);
            }


            ss++;

        } 
    

        int maxarea =Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currheightarea = 0;

            currheightarea  = arr[i] *  (rse[i]-lse[i] -1);

            maxarea = Math.max(currheightarea, maxarea);

        }

        System.out.println(maxarea);


















    }
}
