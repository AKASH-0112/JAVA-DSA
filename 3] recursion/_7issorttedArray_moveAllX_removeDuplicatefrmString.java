//  return, in void recusrsive function is big take away
//  nhito call stop nhi hogi ( bcz we are doing nothing if it is int returntype then , return ans;)
public class _7issorttedArray_moveAllX_removeDuplicatefrmString {

  static boolean issorted(int A[], int i) {
    if (i == A.length - 1) {
      return true;
    }

    if (A[i] < A[i + 1]) {
      boolean ans = issorted(A, i + 1);
      return ans;
    } else {
      return false; // agr ek bhi posotion yesi h jo unsorted vhi se stack return hoga
    }
  }

  static boolean issorted2(int A[], int i) {
    if (i == A.length - 1) {
      return true;
    }

    if (A[i] >= A[i + 1]) { // reverse condtion
      return false;
    }

    boolean ans = issorted2(A, i + 1); // this is taking memory but still toclear under standing u can do like this then optimize
    return ans;
  }

  static void moveX(String str, int i, int count, String newstr) {
    if (str.length() == i) {
      for (int j = 1; j <= count; j++) {
        newstr = newstr + "x";
      }
      System.out.println(newstr);
      return;
    }
    char currentchar = str.charAt(i);
    if (currentchar == 'x') {
      count++;
    } else {
      newstr = newstr + currentchar;
    }
    moveX(str, i + 1, count, newstr);
  }

  static boolean array[] = new boolean[26]; // defaul value of boolean is false

  // and static takes default values
  //26 bcz the a-z is 26 letters
  // 0 1 2 .....25   ,
  // a-z have asci value in continuous ordr
  // a-a = 0 , index 0 is for a
  static void removeduplicate(String str, int i, String nstr) {
    if (i == str.length()) {
      System.out.println(nstr);
      return;
    }
    char currentchar = str.charAt(i);
    if (array[currentchar - 'a'] == true) {
      removeduplicate(str, i + 1, nstr);
    } else {
      nstr = nstr + currentchar;
      array[currentchar - 'a'] = true;
      removeduplicate(str, i + 1, nstr);
    }
  }

  public static void main(String[] args) {
    //--------  4 ] sorted or not array (stricktly)
    // o(n)
    int A[] = { 2, 4, 10, 9 };
    System.out.println(issorted(A, 0));
    System.out.println(issorted2(A, 0));

    //----5] move all xto end of string
    // o(n +count)== O(n + n) === O(2n)==O(n)
    moveX("axbcxxd", 0, 0, "");
    moveX("xnxx", 0, 0, "");

    //----6] remove duplicate from string
    // use map arraay ,to checking is used or not
    // curentchar -'a'= index value of array
    //  O(n)
    removeduplicate("akash", 0, "");
  }
}
