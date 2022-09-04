import java.util.*;

public class _3insertionsort {
      public static void main(String[] args) {
            //  array into two part 
            // we consider left side arrya(initially 0 th element ) sorted and  right side all elemnt in unsorted
            // from unsoreted we insert each number with its correct postion in sorted array


            //  we push the sorted elemnt to right uptill the ,comparing element bcms small
            // which makes the space for putting new element in it

            //  phle sb compare krke push krdo
            //then put element
            int [] A ={4,3,1,8};


            //  no swap , sort 

            for (int i = 1; i < A.length; i++) { // we consider first element in unsorrted array

                  int current_element =A[i]; // taking first unsorted elemnt to put in sorted at correct index
                  int j = i-1; // sorted array element  last index

                  //  j is traveling    ,    i-1  ---> 0

                  while (j>=0 && current_element<A[j]) { // maghchi index >= 0 asli pahije and to eelemt >current pahije
                        A[j+1]=A[j]; // to make space   // cuurent ke iye jgh bana rha h
                        j--; 
                  }
                  //placment
                  //after while loop breaks untill now j is on elemnt which is less than curent_element
                  // so we put it after that less value
                  A[j+1] = current_element; 
                  
            }
            
            System.out.println(Arrays.toString(A));



         





            
      }
}
