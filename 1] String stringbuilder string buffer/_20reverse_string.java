public class _20reverse_string {
      public static void main(String[] args) {
            

            //-------- reverse string without using reverse function in builder
            // consider it as array
            // then first letter to last last to first swap
            // swapping is done for half string

            StringBuilder str =new StringBuilder("AKASH");

            for (int i = 0; i < str.length()/2; i++) {
                  int front_ind = i;
                  int back_ind = str.length()-1 -i;

                  char front_char = str.charAt(front_ind);
                  char back_char =str.charAt(back_ind);

                  str.setCharAt(front_ind, back_char);
                  str.setCharAt(back_ind,front_char);
            }

            System.out.println(str);


      }
}

//  time complexity is O(n/2)===O(n)