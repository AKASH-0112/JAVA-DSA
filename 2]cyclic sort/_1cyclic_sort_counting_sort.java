import java.util.Arrays;

public class _1cyclic_sort_counting_sort{

    public static void main(String[] args) {
        // 3,5,2,1,4 is array
        // if we want to sort in a single pass
        // in O(n)

        //when given numbers from range 1,N  or 0 to N ===> use cylic sort 
        // 1 2 3 4 5  array  1 to n
        // 0 1 2 3 4  index
        // A[i] = i+1;
        // 0 1 2 3 4   array  0 to n
        // 0 1 2 3 4  index
        // A[i] = i;

    
        // check swap check swap..........if ith position is correct element then , move

        //only using i , check is at right index swpa ,move
        
        // in single pass ,O(n)
        // need array of  1-n or 0-n like this
        // for loop will have  0 to length-1 
        // we will decide currect index of a[i] , a[i]-1 is index to place

        int a []  ={ 2,4,6,1,5,3};

        int i =0 ;
        while( i < a.length) { // we cant use for
            
            int currect_index = a[i]-1;
            // what i have swpaed , might be not on correct index
            // so we ae not changing postion after swap 
            if (a[i] != a[currect_index]) {
                swap(a,i,currect_index);
                // we will swap utill right now index get sorted element real element
            }
            else{
                // if the elem right now is at real postion go move to next
                i++;
            }
        }


        System.out.println(Arrays.toString(a));
    }

    public static void swap(int a[] ,int i ,int currect_index){
        int temp = a[i];

        a[i] =a[currect_index];
        a[currect_index] =temp;
    }
}