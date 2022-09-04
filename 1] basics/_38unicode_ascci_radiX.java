import java.util.Scanner;

public class _38unicode_ascci_radiX {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        sc.useRadix(2);// for inpute binary
        // 10 decimal (default) , 16 hexadecimal , 8  octal


        // unicode follow krta and ascci is a part of unicode
        // unicode makes java to sout in any language

        int a =sc.nextInt();
        System.out.println(a);
        sc.close();
    }
}
