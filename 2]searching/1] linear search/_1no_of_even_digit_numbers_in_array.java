class _1no_of_even_digit_numbers_in_array
 
        // find number 76 exits in array or not
        // return the index if found
        // otherwise ,return -1 ;  (as -1 does not exits)


        // time compexity ,()
        // best case O(1) -- const time complexity
        // worst case O(n) , n is size of array ,linear time complexity

        // time compelxity is how much time varies as size increases

        // what is best case,- iteam we are searching is on 0th index
        //so how many comparisons we need to do in loop
        // 1
        // is is independ of the array size
        //O(1)
        // imagine graph , size increases but the time remains same for finding
        // time will remaisn cont 

        // worste case -
        // iteam not found case is worsete 
        // comparions are made lenght of array th time
        // O(n)
        // imagine graph , fr size of 10 need 10ms ,for 20 20ms ....
        // linear graph
        // so time complexity in this case depend on  size
        // time will grow linearlly as size increase
{
    public static boolean haveEvenNoOfDigits(int num){

        if(num ==0){
            return false;
        }

        int noofdigits=0;
        while (num !=  0) {
            
            noofdigits++;
            num =num/10;
        }
        return noofdigits%2==0;
    }
    public static void main(String[] args) {
        

        int arr [] = {34,4565,345,1,67,0};
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(haveEvenNoOfDigits(arr[i])){
                count++;
            }
        }
        System.out.println(count);



    }
}