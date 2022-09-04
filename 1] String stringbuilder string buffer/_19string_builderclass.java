public class _19string_builderclass {
    
    public static void main(String[] args) {
        
        //   strings are immutable in java
        // so if we want to update a string or to delete from it we nedd to create new object in pool
        // and this is time taking process
        
        // so we use stringbuilder class , which provide same operation on string without creating new obj literals of string in heap
        // stringbuilder class have additional operation too


        StringBuilder sb =new StringBuilder("tony"); // as new is used so heap
        System.out.println(sb);
        
        // ---charat()
        System.out.println(sb.charAt(0));
        
        //----setcharAt()
        sb.setCharAt(0, 'T');
        System.out.println(sb);
        
        // -----insert()
        sb.insert(0, 'A');
        System.out.println(sb);

        //------delete()  , char or substring deleteing
        sb.delete(0,1);  // 1 is not encluded
        System.out.println(sb);

        // ----append()
        sb.append(" stark");
        System.out.println(sb);
        
        StringBuilder str =new StringBuilder("h");
        str.append("e");
        str.append("l");
        str.append("l");
        str.append("o");
        System.out.println(str);
        // in string class ,we need to create all time new obj in pool
        //  str = str+"e"  str=str+"l"....


        // ---lenght()
        System.out.println(sb.length());


        // ---reverse()
        str.reverse();
        System.out.println(str);


        
        
        
        
        
        
    }
}

// in stack , function with ref are present which pointing towras heaps(objects (like string))
// in stack always main function with allits ref are stored at bottome(like primitive datatypes ref var, ref var of objects created by contructors)

//  String class is final as no one can modify its behaviour
// string builder is new class created ,insted of modifying the String class for mutability
//  string builder also a final class
