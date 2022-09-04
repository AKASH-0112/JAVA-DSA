import java.util.Stack;

public class _5stack {
    public static void main(String[] args) {
        
        // stack  ,FILO principle
        // by using stack class (collection framework) , we can make a stack

        Stack<String> animal =new Stack<>();

        // push()
        animal.push("lion"); // at bottom
        animal.push("cat");
        animal.push("dog");
        animal.push("pig"); // at top
        System.out.println(animal);

        //peek()  
        System.out.println(animal.peek());

        //pop()
        animal.pop();
        System.out.println(animal.peek());
    
    
    }
}
