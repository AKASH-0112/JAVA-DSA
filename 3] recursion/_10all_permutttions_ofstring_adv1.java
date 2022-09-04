public class _10all_permutttions_ofstring_adv1 {


    static void allpermutations(String str , String permutations){


        if (str.length() ==0 ) {
            System.out.println(permutations);
            return;
            
        }

        for (int i = 0; i < str.length(); i++) {

            char currentchar = str.charAt(i);
            String newstr =  str.substring(0,i) + str.substring(i+1 );

            allpermutations(newstr, permutations+currentchar);
            
        }
    }
public static void main(String[] args) {
    

    //  permutations of string
    // possible combination of letters of string
    // depend on no of letters in string
    // abc ,  3! = 6
    // 3p3

    allpermutations("abc","");

    //  O(n!*n)
}
    
}
