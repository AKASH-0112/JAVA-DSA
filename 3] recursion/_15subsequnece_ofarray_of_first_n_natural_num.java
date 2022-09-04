import java.util.ArrayList;

// ******** arralist need  element to add()
//********   arraylist need index to remove

// hashset --  add(element)  remove(element

class _15subsets_ofset_of_first_n_natural_num {

    static void allsubset(int n , ArrayList<Integer> list){ //  3 se calu hoga 
        // 3 2 1
        // 3 2 _


        if (n==0) {
            
            for (Integer integer : list) {
                System.out.print(integer+" ");
            }
            System.out.println();
            return;
        }


        list.add(n);
        allsubset(n-1, list);
        list.remove(list.size()-1);  // last index of arraylist
        // arraylist remove element form arraylist  // om index baiscs 
        // this is why we used arraylist 
        allsubset(n-1, list);
    }
    public static void main(String[] args) {
        //  find all subsets of a set of give n natural numbers

        //  O(2^n)

        int n =3 ;
        ArrayList<Integer> list =new ArrayList<Integer> ();
        allsubset(n ,list);
    
    }
}


// 2^n





// all subsequence of array  ( A , i , set(hashset))
// all list of array  ( n , set(Arraylist))
// power set 
// all tis are same

//another que devied from this is , print only  unique   (use of hashset ,arralist contains() mthdo)
