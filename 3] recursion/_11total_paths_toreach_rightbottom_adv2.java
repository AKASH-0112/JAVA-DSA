public class _11total_paths_toreach_rightbottom_adv2 {

    // in this type of que ,consider index from 1 , as we are taking matrix size as formal paras 

    static int allpath(int m ,int n){ // no of  count paths to reach m,n


        if (m==1 || n==1) { // here we write  bc on 1 , so we are considering the , first row as 1 and col as 1
            
            return 1;
        }


        return allpath(m-1, n) +allpath(m, n-1)  ; // paths to reach at m,n we hav e this two entry point  to enter at destination 
        // so we calculate how mant paths to reach that entry point ===== must be eqaul to total paths
    }
    public static void main(String[] args) {
        
        //  total no of paths to reach the destination
        // source  left toppmost box --- to deestination  right bottom box  ,  of matrix


        //  if there is one row or col , and at any box we want to find path 
        // it will be same for all boxes n tha row or col , so this is base condtion

        // O(2^n) complexity
        System.out.println(allpath(3, 3)); // give matrixx size 
        
        
    }
}



//  *********if diagonal is allowed then 
// + allpaths(m-1,n-1);


