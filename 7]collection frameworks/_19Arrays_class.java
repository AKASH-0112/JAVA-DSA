import java.util.Arrays;
public class _19Arrays_class {
    public static void main(String[] args) {
        
        //  works on array .normal java array

        int [] sa = { 1,4,5,8,9 };

        int index =Arrays.binarySearch(sa, 8); // internally use BS ,log n , works for sorted array onle
        System.out.println(index);

        int a [] ={ 3,8,1,0,4};
        Arrays.sort(a); // sorting quick sort internally
        System.out.println(Arrays.toString(a)); // tostring of Arrays class is overriden in it , so we can see [] otherwise will get class and obj hashcode


        int arry[] ={2,44,6,7,8,9};
        Arrays.fill(arry, 0);// fill for all indises same value
        System.out.println(Arrays.toString(arry));

    }
}
