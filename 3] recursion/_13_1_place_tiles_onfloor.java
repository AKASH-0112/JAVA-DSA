public class _13_1_place_tiles_onfloor {
    
    static int noOfPattern(int n , int m){

        if (m==n) { 
            return 2;
        }
        if (n<m) {
            return 1;
        }

        // if first placed horizontal   , remain floor is n-1
        //if vertical , remains floor  n-m
        return noOfPattern(n-1, m)+noOfPattern(n-m, m);

    }
    public static void main(String[] args) {
        
    //     patterns forms , to fill  floor
    //     n*m floor matrxi , to fill with 1*m

    System.out.println(noOfPattern(4, 2)); //5

    }
}


//  here it consider , mirror cases as count
