import java.util.Arrays;



public class _2sorted_2d_byrowwise_and_colwise {
    public static void main(String[] args) {
        // sorted by rows and col means any row or col are n sorted manner

        // sorted matrix
        int [][] A ={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        //  we can solve  this also by linear but complexity is(n^2)

        // try to minimise search space
        //linear search is not having good time complexity

        // we need to craete start end for this also
        
        // start is 0 th index 
        //end is  last index of  1 st array
        // then we compare the last index element to target 
        // if target > element then remove first row 
        // if target < element then remove last col
         
        // for cols we are comming from last to first 
        // for row first to last 
        // n+n=2n
        // O(n)
        // complexity is  O(n)
        
        // space complexity is are we takng extra space, no
        // so O(1)  is space complexity

        System.out.println(Arrays.toString(search(A,49)));
        System.out.println(Arrays.toString(search(A,476)));

        //  we eliminate row nd colos in this 
    }

    // works for m*n also 

    static  int[] search(int[][]A ,int target){

        int r=0;
        int c= A.length-1;

        while(c>=0 && r <A.length){

            if(A[r][c] == target){

                return new int[] {r,c};
            }
            if(A[r][c]<target){
                
                r++;// r become size if no element found 
            }
            // if(A[r][c]>target){
            //     c--;
            // }// if we are using this , then r wil be out off index ,will give exception
            else{
                c--;
            }
        }
        return new  int[] {-1,-1};
    }

}

//  basically binary search technique