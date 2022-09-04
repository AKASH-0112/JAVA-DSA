public class _7count_ocuurance_of_element {
    
    public static void main(String[] args) {
        


        //  count no of time targeted element is present in sorted array
        // same as first occurance an dlast occ nikalo 
        // l-f+1  ==count 

        // this what we have benifit that , it s sorted so we can do this ubstraction\
        // if not sorted then the target element can be at any postion 
        int[] ary ={2,4,6,6,6,8,10};

        int ans[] = show(ary, 6);
        if(ans[0] ==-1 && ans[1]==-1){ // corner case 
            System.out.println(0);
        }

        System.out.println(ans[1] -ans[0]+1);

    }

    static int[] show(int[]array ,int target){
        int A []  ={-1,-1};
        A[0] = occurance(array, target, true);
        A[1] = occurance(array,target, false);
        return A;

    }
    static int occurance(int a[] , int target,boolean firstocc){

        int ans =-1;  // bcause agr ek h cocurance hoga to ans return hoga na , second occurance ke khoj me so ,-1

        int start =0;
        int end =a.length-1;

        while (start<=end) { 

            int mid = start + (end-start)/2 ; 

            if(a[mid]==target){
                if (firstocc) {
                    ans =mid; // may posioble ans ,for first occurance
                    end =mid-1;
                } else {
                     ans =mid; // may posioble ans ,for last occurance
                     start =mid+1;
                 }

            }
            else if(target >a[mid] ){
                start = mid+1;
            }
            else if(target <a[mid]){
                end =mid -1;
            }
            
        }
        return ans; 
    
    }
}
