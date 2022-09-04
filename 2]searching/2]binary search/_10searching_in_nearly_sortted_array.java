public class _10searching_in_nearly_sortted_array {
 
    
    public static void main(String[] args) {
        
        //  nearly sorted means 
        // element which sould be at , ith postion can be at ith or i-1th or i+1th position

        // 2 4 6 8 12
        // 2 6 4 8 12 is nearly sortted

        //  modified bs will be used
        //while chceking for mid we will aslo check for next pre  (after checking pre  != -1 and  next != length)


        int a []  = {  10 ,20,40,30,50,60 ,70,90,80};

        System.out.println(ans(a,90 ,0 ,a.length-1));
    }

    public static int ans(int a[] , int target ,int s ,int l){

        while(s <=l){

            int mid =(s+l)/2;


            if(a[mid] == target){
                return mid;
            }
            else if(mid-1 >= 0 && a[mid-1]==target){
                return mid-1;
            }
            else if(mid +1 < a.length && a[mid+1]==target){
                return mid+1;
            }
            else if( target >a[mid]){
                s =mid+2;
            }
            else if(target < a[mid]){
                l =mid-2;
            }
        }

        return -1;
    }
}
