public class _14frind_pairs {

    static int callguest(int n){

        if (n==1) {
            return 1;
        }
        if (n==0) { // this is for second call  +ve ans  ,
            // if two mmemers are thhere 
            // they tyey can be called by paired

            // but for next call callguest(2-2) --  to avoid  0 return it will make whole expression 0 so we nend to return 0 
            return 1;
        }


        // first call is ,, taking single 
        // secomnd call ,, paired  
        // n-1 ways to paired so we mutiple it 
        return callguest(n-1) +  (n-1)*callguest(n-2);

        // callguest(n-1) --- baki guest kse call honge 
        // callguest(n-2) ----  paired ke baad  baki bche ko kese call kre uske liye call
    }
    public static void main(String[] args) {

        //  friend pair problem
        
        //  find no of ways that u invite n peoples or frind to ur party
        //  single  and paired are allowed
        //   if n=2 ,    (1,2 ,, 1-2 ) 2 ways

        System.out.println(callguest(4));


    }
}
