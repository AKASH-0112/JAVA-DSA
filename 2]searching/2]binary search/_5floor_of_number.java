public class _5floor_of_number {
    public static void main(String[] args) {
        
        //  ceiling of given number means
        // smallest element in array greter or equal to target element 


        int[] array ={2,6,9,13,56};

        System.out.println(seiling(array,1));

        
    }
    static int seiling(int [] a ,int target){

        int start =0;
        int end =a.length-1;

        while (start<=end) { 

        int mid = start + (end-start)/2 ; 

            if(a[mid]==target){
                return mid;
            }
            else if(target >a[mid] ){
                start = mid+1;
            }
            else if(target <a[mid]){
                end =mid -1;
            }
            
        }
        return end; //  end  index in floor

     
        // java do not have ngative index but 
        // in array if element not found it auto return -1
        // in case end itself is -1 index 

    }
}

//  if we find middle first ,then we get on of space of divison 
// {2,3,5,9,14,16,18}  ,tar=15
//{2,3,5,9,14} --- returning mid-1  ====ans for that
// but we cant do like this bcz

// tar==8 ,we are getting first mid is 16 ,then also we need to jump into left side but the ans is not 14
//whic is last or mid-1 
// so we need to find all binary serach
