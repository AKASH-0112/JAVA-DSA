class _4que_search_in_string {
    public static void main(String[] args) {
        

        // string is basicaaly array of characters only
        String str ="AKASH SABLE";
        System.out.println(serach(str, 'B'));
        System.out.println(serach(str, 'a'));
    }

    static boolean serach(String str ,char c){

        if(str.length()==0){   // string have lenght function internally it has var value of lengh ,in Arry itbis lengh variable
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            
            if (c == str.charAt(i)) {
                return true;
                
            }
        }
        return false;

    }

    //  by for each loop
        static boolean search2(String str , char c ){
            if(str.length()==0){
                return false;
            }
            for(char ch : str.toCharArray()) {
                
                if(ch==c){
                    return true;
                }
            }
            return false;
    }
}



//  string have method , tochararray()--- which make string into array of its single characters