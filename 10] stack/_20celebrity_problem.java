public class _20celebrity_problem {
    public static void main(String[] args) {
        
        //  given number of people  , n 
        //  given n*n matrix  which show , does one knows another 
        // 1 means know , 0  means do not know 
        // celebrity is person whihc known by evry one in grp of number ,but dont know jis all fans

        // in a party
        // find that person  , who is celebrity
        // 3 people means  , 0 1 2 person names
        /*
          // in party ,there will  be max one celebrity only
          // min 0

          //  0 ,1 2 ,  if 1 is celebrity ,  0 know 1 ,2 konw 1  == >  0 and 2 cant be celebrity bcz they know fans
        {
            0  1  1
            0  0  0
            1  1  0

        }
         */
        // diagonal always  0, as no sense ki  0th person  0th ko janta


        //   O(n^2)  brute force
        int  k =3 ;
        int indentity [] [] = {
            {0 ,1 ,0},
            {0 ,0 , 0},
            {1 ,1 , 0}
        };

        for (int i = 0; i < indentity.length; i++) {
            int zerocount  = 0 ;  // if this bcmz = length means he dont know no one in party
            for (int j = 0; j < indentity.length; j++) {
                
                if(indentity[i][j]==0){
                    zerocount++;
                }
            }
            if(zerocount==indentity.length){
                // count if all other know him/her
                // uske col me dekho
                int onecount =0;
                for (int j = 0; j < indentity.length; j++) {
                  if(indentity[j][i] ==1){
                    onecount++;
                  }
                }

                if (onecount==indentity.length-1) {
                    System.out.println(i + "th person is celebrity");
                    break; // bcz there will be only one cel in party
                }
            }
          
        }




    }
}

//  we have n^2 information we need to find in n 