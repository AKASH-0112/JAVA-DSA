import java.util.ArrayList;

public class _3stack_by_arraylist {
    

    static class Stack {

        ArrayList<Integer> list =new ArrayList<>();

        public boolean isempty(){

            return list.size()==0;
        }

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            if (isempty()) {
                return -1;
            }
            int lastint  = list.get(list.size()-1);
            list.remove(list.size()-1);
            return lastint;
        }
        public int peek(){
            int lasttop = list.get(list.size()-1);

            return lasttop;
        }


    }

    public static void main(String[] args) {
        
        Stack s  =new Stack();
        s.push(12);
        s.push(65);
        s.push(87);
        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
