public class _3all_missing_numbers_in_array {
    
    public static void swap(int a[] ,int i ,int currect_index){
        int temp = a[i];

        a[i] =a[currect_index];
        a[currect_index] =temp;
    }
    public static void main(String[] args) {
        

        // [1,n]   , n=9
        // array will aslo containe [1,n] vale elements only
        // missing element ke jgh pe , ismese hi ek number allocate kiya hoga , so that cyclic sort me problem na aayae
        int arr [] = { 1,6,7,4,3,8,2,1,1};  // 9 elemets h


        int i = 0 ;
         while (i<arr.length) {
            
            int currect_index = arr[i]-1;

            if(arr[i] != arr[currect_index]){  // equal nhi honge to sswap krte rho  

                // in case duplicate taken number like 1, will copite again for 0th index ata that time also we will move forword 
                swap(arr, i, currect_index);
            }
            else{
                i++;
            }
         }

         for (int j = 0; j < arr.length; j++) {
            
            if (arr[j]-1 != j) {
                System.out.print(j+1 + " ") ;
            }

         }
    }
}
