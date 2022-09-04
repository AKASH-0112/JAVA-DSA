public class _15peak_element_index {
    
    public static void main(String[] args) {
        
        //  peak element is greater than its nebohour(pre and next)
        //  return the index of peak element

        //given unsortted array
        // 5 10 20 15  , ans is index 2

        // can have more than a peek element
        // so retrun any one

        //  0th and last index case (no two neibours)
        // int his case just one side need to check 
        // 0th ke liye , see if it is grtater than its next elemenet

        // for last element , see its prvious element  , is the last element is greter thn the second last element

        // at med need to check is that mid element is ans of our que or not
        //ans ki possibililty kidhr hogi udhar move kro
        // 5 10 20 15 , mid 1
        //  5  10  20 15 , we are at 10 check if 10 is peek , if not decide t move
        //  most possibility is on right side , bcz on left for 10 smaller exist , so that smaler will never be peek ,as it has bigger in right side
        // so move to right half

        // jo bda h mid ele ka nebour us side jao
        
        // int a [] = { 5, 10 ,20, 15};
        // int a [] = { 5, 10 };
        // int a [] = { 5};
        int a [] = { 5 , 6 ,4 ,8 ,7};

        System.out.println(ans(a));

        // binary search on ans ( like we consider ,possibilities , and then move)

        
    }
    public  static int ans(int a[]){
        int s =0 ;
        int l =a.length-1;

        if(a.length ==1){ // corner case 
            return a[0];
        }

        while (s <=l) {
            
            int mid =(s+l)/2;


            if ( mid!=0 && mid!= a.length-1) {

                if(a[mid] > a[mid-1] && a[mid] > a[mid+1] ){
                    return a[mid];
                }
                else if(a[mid] < a[mid+1] ){
                    s =mid+1;
                }
    
                else if(a[mid] < a[mid-1]){
                    l =mid-1;
                }
            }
            else {

                if(mid==0){

                    if (a[mid] > a[mid+1]) {
                        return a[mid];
                    }
                    // here this condtion is main
                    else{
                        return a[mid+1];    //  [1,2]  , mid at 0 , but not  > mid+1 
                    }
                }
                else if(mid==a.length-1){
                    
                    if (a[mid] > a[mid-1]) {
                        return a[mid];
                    }
                    else{
                        return a[mid-1];
                    }
                }
            }

            
        }
        return -1;

    }
}

// integer overflow  que is imp ( why we use  s - (l-s)/2  to find mid)
