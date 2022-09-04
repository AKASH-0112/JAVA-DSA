public class _4find_duplicate_numbers {
    public static void swap(int a[] ,int i ,int currect_index){
        int temp = a[i];

        a[i] =a[currect_index];
        a[currect_index] =temp;
    }

    public static void main(String[] args) {
        
        //approch 1 , hashmap



        // cyclic sort way
        // [1,n]
        // array size is n+1
        // one duplicate element but from this range only

        // [1,4]
        int ary [] = {1,2,3,4,1 };

        // do cyclic sort the duplicate element will , be placed at last index of array automatically
        // or we can say elemenrt at wrong index is duplicate

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

        System.out.println(ary[ary.length-1]);
    }
}
