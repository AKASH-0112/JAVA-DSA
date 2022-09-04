public class _1binary_search {
    
     //when to use binary search
        //1] if in que given  ,sorted array and said to do something , first try BS(most of time)
        //2] somtimes not given sorted array ,not menstioned but like we start from middle , and some squence of numbers are sorted
    public static void main(String[] args) {
           //  binary search is use bcz time comlexity is less than linear search
        // binary search mostly used on the sorted arrays

        //  sorted means ,accending or decennding oreder

        // int [] A = {4,8,12,16,20,24,28,32,36,40};

        // 1] midlle element , Sin +lind /2
        // 2] check waether the target element is on right or left of midlle element , greter than or less than
        // 3] middle ele== target ,return index

        // we need to change the , last index and start index  by using middle index ,as per our elelment posion (left or right of middle)


        // why we need binary search ??????????????????
        
        // best case in binary search, first middle value == targeted valus, one step need
        // best case complexity =   O(1) , constant time complexity , do not depend on how big is array 
        //time remains cont fro nay size of any in best case

        //  worse case,
        // max number of comparison 
        // when we find  targeted element when array reduced to the kth level where the no of elements are 1
        // on each stage array reduced to the  n/2
        // n n/2 n/4 n/8  n/16     ------ n/2^k   ,k is level(no of comparison)  , and leves start from 0
        // so when array size is 1  ,, we assume that is kth level  and no of elements are  
        // total comparison is log2(n) , n is size of array
        //time complexity is O(log2(n))

        //comparison  of time complexity od worsete case between linear and binary serach
        // worste  case in linear is   1m time compariosn
        // worste in binary is log2(1m)=== 18 comparions


        int [] ary ={4,8,12,16,20,24,28}; // must have to be sorted   
        System.out.println(binarysearch(ary,20));


    }
    static int binarysearch(int [] a ,int target){

        int start =0;
        int end =a.length-1;

        while (start<=end) { // = make sure that last midle will include

            int mid = start + (end-start)/2 ; ///efficinet way to calculate  mid index

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
        return -1; // if non of above return ,means no element is there 

    }
}

//  to avoid int overflow  , eg  number out of range of int datatype

//  reverse sorted array ( decending order) , same concept just condtion change kro

