public class _16mountaine_array_peek_element_or_index {

    // mountain array atleast elements 3
    // bitonic or moutanine array
    //peek element in this type of array is one only

    public static void main(String[] args) {

        int a[] = { 0, 3, 5, 10, 8, 9, 7 };

        System.out.println(peek(a));
    }

    public static int peek(int a[]) {

        int s = 0;
        int l = a.length - 1;

        while (s <= l) {

            int mid = (s + l) / 2;

            // [3,5,3,2,0] , we also need to define 0th inde x and last index cases

            if (mid != 0 && mid != a.length - 1) {

                if (a[mid] > a[mid + 1] && a[mid] > a[mid - 1]) {
                    return a[mid];
                }

                else if (a[mid] < a[mid + 1]) {
                    s = mid + 1;
                } else if (a[mid] < a[mid - 1]) {
                    l = mid - 1;
                }
            }
            else{
                if(mid==0){

                    if (a[mid] > a[mid+1]) {
                        return a[mid];
                    }
                    else{
                        return a[mid+1];  // why we are able return directly bcz ,
                        // when mid will be 0 , only  s+l ==1
                        // means two elements remains

                        // if the 0th one is not greter then 1th one must be greater 
                    }
                }
                else if(mid == a.length-1){

                    if(a[mid] > a[mid-1]){
                        return a[mid];
                    }
                    else{
                        return mid-1;
                    }
                }
            }

            
        }
        return -1;
    }
}