import java.util.Stack;

public class _9duplicate_bracket {
    
    public static boolean haveDuplicate(String str){

        Stack<Character> s = new Stack<>();
        int i =0;
        while (i < str.length()) {
            
            char c =str.charAt(i);

            if(c != ')'  ){
                s.push(c);
            }
            else if(c == ')'){

                if (s.peek() == '(') {  // asr ) ke niche hi sidha  (   h to extra brackes h bcz dont have content to contain
                    return true;
                }
                else{

                    while (s.peek() != '(' ) {
                        s.pop();
                    }
                    s.pop();
                }
            }
            i++;
        }
        return false;

    }

    public static void main(String[] args) {
        //  given balanced expression  , aall closed brackets
        //  to find needless bracket present or not
        // if present return true 
        // if not present false
        // (A+b) + (bc+b) -- > false
        // (A+f)+ ((a-g))  --- > true

        // O(n) time bcz wile is not gonna execute all time , as it is in if { }
        // O(n)  space 
        String str = "(a+b)-( t-q)";

        System.out.println(haveDuplicate(str));
    }
}


// char [] chararry =  str.toCharArray();


