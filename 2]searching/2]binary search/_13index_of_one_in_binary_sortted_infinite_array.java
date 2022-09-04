public class _13index_of_one_in_binary_sortted_infinite_array {
    public static void main(String[] args) {
        int a[] = { 0 ,0 ,0 ,0 ,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,};

        System.out.println(ans(a));
    }

    public static int ans(int a[] ){

        int s =0 ;
        int l =1;

        while (a[l] != 1) {
            
            int temp = l;

            l = l + 2*(l-s+1);
            s = temp+1;
        }

        int indofone = bs_firstocc(a ,s,l);

        return indofone;
    }

    public static int bs_firstocc(int a[] ,int s ,int l){
        int mybe =-1;
        while (s <=l ) {
            
            int mid =(s+l)/2;

            if (a[mid] == 1) {
                 mybe =mid;
                l = mid-1;
            }
            else if(a[mid] < 1){
                s=mid+1;
            }
        }

        return mybe;
    }
}
