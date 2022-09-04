public class _2no_of_even_digit_numbers {
    
    public static int noofdigits(int num){

        return (int)Math.log10(num)+1;
    }
    public static void main(String[] args) {
        
        int arr[] = {23,56,777,1,0};

        int count =0;
        for (int i = 0; i < arr.length; i++) {
            
            if(noofdigits(arr[i])%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
