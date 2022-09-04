class _17circle_GameOfDeath_joseph_problem {
    

    // game of death
    // safe position in game
    // joshephes problem
    


    static int josh(int n ,int k ){ // return winner value



        if (n==1) {
            return 0;
        }



        return (josh(n-1, k) + k )%n; 
    }
    public static void main(String[] args) {
         
        //  to find winner of game 
        //  perosn can kill himself too
        // f(n,k) --  n no of people in circle
        // k - gap to which kill by gun , include count from gun boy
        // gun passed to next to killed

        System.out.println(josh(5,3));

        
    }
}
// O(n)
//O(n)