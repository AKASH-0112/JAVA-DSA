public class _3sorted_2d_stricktly {
    public static void main(String[] args) {
    
        int[][] a ={
        {1,2,3},
        {4,5,6},
        {7,8,9}
        };
        int target =9;

        // 1 ] linear  O(n *m)
        // 2 ]  binarys erach on each row , O( m* log n )

        for (int i = 0; i < a.length; i++) {  // row on which to implement binary search
            
            int s = i;
            int e = a[i].length-1;

            while (s <=e) {
                
                int mid = (s+e)/2;

                if(a[i][mid] == target){

                    System.out.println(i + " " + mid);
                    break;
                }
                else if(target > a[i][mid]){
                    s= mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }

        // 3 ]  rowwise and col wise sortted assume kro , then  O( n+m)


        // 4 ]  optimal sol , O(log m*n)

        // say imaginary index for each element 
        // say all eleemnt is in an array , which will be sortetd 
        // so , s =0 , l = n*m -1 index
        // mid will also be index , 
        // by it we can get taht index element
        // mid/col =  row no
        //mid%col = col no

        int s1 =0 ;
        int e1 = (a.length * (a[0].length))-1;

        while (s1 <=e1) {
            
            int mid =(s1+e1)>>1;

            if(target == a[mid/a[0].length][mid%a[0].length]){

                System.out.println(mid/a[0].length +" "+mid%a[0].length);
                break;
            }
            else if( target > a[mid/a[0].length][mid%a[0].length])
            {
                s1 =mid+1;
            }
            else{

                e1 =mid-1;
            }
        }


    }
    
  
}
