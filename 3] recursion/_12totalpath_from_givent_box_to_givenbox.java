
public class _12totalpath_from_givent_box_to_givenbox {

    // if , right move and dowmove allowed only
    // no of aptahs to reach the destination  cordinate  from any cordinate


    static int allpath(int i ,int j,int m ,int n){  // initial cordinate , final conrdinates


        if (m==i || n==j) { // this is fro stop condtion ,as specific initial cordinat
            // if  no  specidfic we use 1 
            // as we start indexing from 1 in such type que
            
            return 1;
        }


        return allpath(i,j, m-1, n) +allpath(i,j,m, n-1)  ;
    }


    public static void main(String[] args) {
        
    }
}
