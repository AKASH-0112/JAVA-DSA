public class _5que_search_in_range {


public static void main(String[] args) {
    String str = "SABLE";

    System.out.println(serach(str, 'E', 1,3));
}

static boolean serach(String str ,char c,int startin ,int endind){

    if(str.length()==0){   // string have lenght function internally it has var value of lengh ,in Arry itbis lengh variable
        return false;
    }

    for (int i = startin; i <= endind ; i++) {
        
        if (c == str.charAt(i)) {
            return true;
            
        }
    }
    return false;

}
}
