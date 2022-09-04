public class _2order_agnostic_binary_search {
    
    // order of sorted not know binary search
    public static void main(String[] args) {
         // if we dont know the sorted order of array 
        // like it may be ,accending or decending
        // at that time we use order agnostic binary serach

        //  to figure out the sorting way
        // ***********best way is to consider first and last element
        // bcz there may be chance that  so many number sin squence may same valuse


        int [] Ary ={90,80,60,40,20,10,1};
        System.out.println(binary_search(Ary ,5));
        System.out.println(binary_search(Ary ,10));

    }

    static int  binary_search(int [] a ,int target){

        if(a.length==1){
            if(a[0]==target){
                return 0;
            }
            else{
                return -1;
            }
        }
       
        int start =0;
        int  end =a.length-1;

        if(a[0]>a[a.length-1]){

        while (start<=end) {
            
                int mid =( start +end)/2;
                if(target > a[mid]){
                end =mid-1;
                }
                else if(target<a[mid]){
                    start=mid+1;
                }
                else if(a[mid]== target){
                    return mid;
                }
            }
            return -1;

        }
        else{
    
            while (start<=end) { 
    
                int mid = start + (end-start)/2 ; 
    
                if(a[mid]==target){
                    return mid;
                }
                else if(target >a[mid] ){
                    start = mid+1;
                }
                else if(target <a[mid]){
                    end =end -1;
                }
                
            }
            return -1; 


        }
}
}