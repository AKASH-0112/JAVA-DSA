import java.util.Arrays;;
public class _14array {
 
    
    public static void main(String[] args) {
        

    // --------------------------for array

     int arry []  ={3,5,7,1};
     System.out.println(Arrays.toString(arry));  // printted array is pure string  ,stored in pool ,form   "[]"
     Arrays.sort(arry); // Arrays class is use to sort normal array 
     System.out.println(Arrays.toString(arry));
   
   
       // public static String toString(int[] a) {
       //     if (a == null)
       //     return "null";
       // int iMax = a.length - 1;
       // if (iMax == -1)
       //     return "[]";
   
       // StringBuilder b = new StringBuilder();
       // b.append('[');
       // for (int i = 0; ; i++) {
       //     b.append(a[i]);
       //     if (i == iMax)
       //         return b.append(']').toString();
       //     b.append(", ");
       // }
    }
}
