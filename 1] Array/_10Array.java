import java.util.Scanner;

public class _10Array {
    public static void main(String[] args) { // string type ka array inputs as arguments
        //  in non primtive datatypes 
        // we can declared by own (Like size)

        // list of iteam of same datatype

        int[] marks =new int[3];
        marks[0]=98;
        marks[1]=90;
        marks[2]=96;

        System.out.println(marks[0]);
        System.out.println(marks); // hash code with class and dimension

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // in memory
        // each byte have address (hexadecimal number )
        //for storing given array we need 12 bytes (4bytes per int)
        //  array is contiguous memeory locatiobn


        //  other way to declared array

        int[] A ={2,4,5,3};

        // input size and iteams

        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int Array [] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(Array[i]);
        }
        //  in java automatic initilise for array 
        //  int array 0
        //  float array 0.0                                       // cpp nhi hota h ye (so benifit in java)
        //  boolean array false
        //   string array " "
        

        // input size and iteams and output
        int s =sc.nextInt();
        int Array1 [] = new int[s];

        for (int i = 0; i < s; i++) {
            Array1[i]=sc.nextInt();
        }
        for (int i = 0; i < s; i++) {
            System.out.println(Array1[i]);
        }


        // lenght variable is used to give lenght of array
        System.out.println(Array.length);


        
    }
}

// --------------- linear search in array
