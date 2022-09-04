import java.util.HashSet;

public class _8allsubsqeunce_uniquesubsequence {

      static void allsubsequences(String str, int i , String nstr){

            if (i==str.length()) {
                  System.out.println(nstr);
                  return;
            }
            char currentchar= str.charAt(i);

            // two diff call 

            // if added 
            allsubsequences(str, i+1, nstr+currentchar);
            // if avoid 
            allsubsequences(str, i+1, nstr);
      }

      static void unisubsequences(String str, int i , String nstr, HashSet<String> set){// hashset is for chceking

            if (i==str.length()) {
                
                  if (set.contains(nstr)) {
                        
                        return;
                  } else {
                        System.out.println(nstr);
                        set.add(nstr);
                        return;
                  }
            }
            char currentchar= str.charAt(i);

            // two diff call 

            // if added 
            unisubsequences(str, i+1, nstr+currentchar,set);
            // if avoid 
            unisubsequences(str, i+1, nstr,set);
      }
      public static void main(String[] args) {
            

            // ------7] all subsequences of string
            // each cha has choice to use or not
            // but order is matters
            //  abc  -   abc  ab bc ac a b c ___
            // no of subsequ = 2^n always
            // O(2^n)
            allsubsequences("abc", 0, "");

            //----8] unique subsequnec of a string
            // wwe use new datastructre called hashset , which store data ,and no duplicate s are allowed a st is set
            HashSet <String> set = new HashSet<>();
            unisubsequences("aaa", 0, "",set);

      }
}

//  if we change the call position output will be reverse in order "  " - - - > abc