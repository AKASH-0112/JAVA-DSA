import java.util.ArrayList;

public class _5find_All_duplicates_in_array {
    
    // elements at wrong index are duplicates
    public static void swap(int a[] ,int i ,int currect_index){
        int temp = a[i];

        a[i] =a[currect_index];
        a[currect_index] =temp;
    }
    public static void main(String[] args) {
        
        int ary []= {4,2,1,3,2,3};



        int i =0 ;

        while ( i <ary.length) {
            
            int currect_index = ary[i]-1;

            if (ary[i] != ary[currect_index]) {
                
                swap(ary,i,currect_index);
            }
            else{
                i++;
            }
        }
        
        ArrayList<Integer>  l  = new ArrayList<>();
        // checking the wrong index and element
        for (int j = 0; j < ary.length; j++) {
            
            if (ary[j] !=  j+1) {
                l.add(ary[j]);
            }
        }
    }
}
