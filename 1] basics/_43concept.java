public class _43concept {
    
    public static int fun(Byte a){
        return a+1;
    }
    public static int fun(byte a){
        return a+2;
    }

    public static void main(String[] args) {
        
        Byte a =45;
        byte b =23;
        System.out.println(fun(a));
        System.out.println(fun(b));
    }
}
