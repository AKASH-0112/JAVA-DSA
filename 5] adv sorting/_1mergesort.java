import java.util.Arrays;
// O(nlogn)
// har log n ke liye n lagana pdta h 
// divide kiya to conqure bhi krna pdta

public class _1mergesort {
    static void conqure(int a[] ,int si ,int ei,int mid){

        int merged [] = new int[ei -si +1];
       int indx1 =si;
       int indx2 = mid +1;
       int mergedin =0 ;

       // O(n)
       while (indx1 <= mid && indx2 <=ei) {
        if (a[indx1] >= a[indx2] ) {
            merged[mergedin] = a[indx2];
            indx2++ ;
            mergedin++;
        }
        else{
            merged[mergedin] = a[indx1];
            mergedin++;
            indx1++;
        }
       }

       // from bellow both one only gonna execute 
       // if both are two uptill that ,upper while is fit &
       // this whiles are for only filling remaining elemets into merged array
       while (indx1<=mid) {
        merged[mergedin] =a[indx1];
        indx1++;
        mergedin++;
       }
       while (indx2<=ei) {
        merged[mergedin] =a[indx2];
        indx2++;
        mergedin++;
       }

       // coping into original array

       for (int i = 0 , j =si; i < merged.length; i++ ,j++) {  // j=si  always bcz next time samllest in merged will be diff than down level
        a[j] =merged[i]; // si is of upper level call node
       }

    }

    static void divide(int[] a ,int si ,int ei){

        if (si==ei) {  // si ,mid same ho jay tb
            
            return;
        }
        //O(logn)
        int mid = ( si+ei )/2 ;
        divide(a, si, mid);
        divide(a, mid+1, ei);
        conqure(a,si,ei,mid);// merged two sorted array

        //  try to nderstand by jennys video
    }
    public static void main(String[] args) {
        
        //  merge sort 
        // based on divide and conqure
        // o()  same as quick sort


        int a [] =  { 6,3,9,5,2,8};

        divide(a , 0 ,a.length-1);
        
        System.out.println(Arrays.toString(a));
    }
}



// in mereged sort we use  extra space array each time while conqure
// in quick sort  , no extra space 