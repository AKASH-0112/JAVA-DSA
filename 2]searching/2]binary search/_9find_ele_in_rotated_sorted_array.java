

public class _9find_ele_in_rotated_sorted_array {
    
    // brute force  , O(n)
    //  O(log n ) search
    public static void main(String[] args) {
        int [] a = {4 ,5 ,1 ,2 ,3};

        int target = 3;
        int smallestind =shortestindex(a);
        int ans1 = bs(a,smallestind,a.length-1,target);
        int ans2 = bs(a,0,smallestind-1,target);

        if (ans1 != -1) {
            System.out.println(ans1);
        }
        else if(ans2 != -1){
            System.out.println(ans2);
        }
        else if(ans1==-1 && ans2 ==-1){
            System.out.println("no element fount");
        }

    }

    public static int bs(int a[] ,int s,int l,int target){

        while (s <=l) {
            int mid = (s+l)/2;

            if (a[mid] == target) {
                return mid;
            }
            else if(target >= a[mid] ){
                s =mid+1;
            }
            else if(target <= a[mid]){
                l =mid-1;
            }
        }

        return -1;
    }

    public static int shortestindex(int a[]){

        if(a[0] < a[a.length-1]){
            return 0;
        }

        int s =0;
        int l =a.length-1;

        while (s <l) {   // as s==l we will return ans ,that would be our ans 
            
            int mid = (s+l)/2;

            if (a[mid] > a[l]) {
                s =mid+1;
            }
            else{
                  
                l = mid;
            }
        }


        return  s ;// both s and l at same element so  return any thing
}
}