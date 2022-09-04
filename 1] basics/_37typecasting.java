public class _37typecasting {
    //in local variable array(int type)
    //  store char as asci 

    // expression type casting or promotion is done when expression occurs and operand stack working start
    public static void main(String[] args) {

        // -----------------autotypecasting in java

        char c = 'A';   // storing in lovcal varaibale array ,it stores ascii int value
        int i = 'a';  //  ascci int value will be i
        char v = 65; //  ascci char value to v
        float f =123; //  int will to float 123.0
        byte b1 =12;
        byte b2 =12;
        char ch ='a';
        // byte b =b1*b2;  b1 b2 are int in OS , autocasting ,promotion in expression // error as not compatible
        int b =b1*b2*ch;

        System.out.println(c );
        System.out.println(i );
        System.out.println(v );


        //  ------------------------explisit tyepcasting

        int x = (int )('a');
        System.out.println(x);

        byte b4  =(byte) (134533); // narrowing but loose of data 


        //-----------------------using wrapper classes

        String str ="123";
        int i2 = Integer.valueOf(str);

        int p =123 ;
        String st = Integer.toString(p);

    }
}
