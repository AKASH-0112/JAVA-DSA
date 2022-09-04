public class _17String_by_constructor_method {
    public static void main(String[] args) {

        //  string created by String contructor takes memory in heap 
        // and each and every time it craete new obj only ( still th elitterrls are same  )
        // str1 str2 have diff memeory in heap having same literal string

        // contructor method is same named as class

        String str =new String("akash");  // create a obj of akash only in heap (not in pool)
        System.out.println(str);

        String str2 =new String("akash");  // create another obj only in heap(not in pool)
        System.out.println(str2);


        System.out.println(str==str2); //false( shows ref are differnet)
        System.out.println(str.compareTo(str2)); // 0 as they are same

        str2.concat(" sable");  // new created in heap but have no ref so garbage collected 
        System.out.println(str2);

        // str2= str2.concat(" sable");  // akash sable is new obj  having str2 ref
        // System.out.println(str2);

        
    }
}

//  here also we can not update or delete original  string(immutable  property)



