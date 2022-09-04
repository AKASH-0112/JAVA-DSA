public class _13_2_place_tiles_onfloor {


    static int ways(int n){


        if (n==1) {
            return 1;
        }
        if (n==2) { // as we have hieght of floor 2
            return 2;
        }
        // bc  f(0) n=0  will never accoures as, it will be after  if n=2 , and we have already n=2 bc

        return  ways(n-1) +ways(n-2);
    }
    public static void main(String[] args) {

        // ways to fill floor by tile  2*1
        // floor  2* n
        
        System.out.println(ways(4));

        
    }
}
//  here it consider , mirror cases as count
