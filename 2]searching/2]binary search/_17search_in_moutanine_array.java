public class _17search_in_moutanine_array {
    

    public static void main(String[] args) {
        

        int a [ ] = { 3 ,5 ,8 ,12 ,45  ,34 ,24 ,20 ,19};

        int peekind = peekind(a);
        int target =20;

        int ans1 =bs(a, target, 0 ,peekind);
        int ans2 =bs(a, target, peekind+1 ,a.length-1);

        if (ans1==-1) {
            System.out.println(ans2);
        }
        else{
            System.out.println(ans1);
        }



    }

    public static int bs(int a[] ,int target,int s ,int l){

        if ( a[s] < a[l]) {

            int start = s;
            int  end = l;

            while (start <=  end) {
                int mid = (start+end)/2;

                if(a[mid] == target){
                    return mid;
                }
                else if (a[mid] < target){
                    start=mid+1;
                }
                else if(a[mid] > target){
                    end =mid-1;
                }
            }
            return -1;
            
        } else if(a[s] > a[l]) {

            int start = s;
            int  end = l;

            while (start <=  end) {
                int mid = (start+end)/2;

                if(a[mid] == target){
                    return mid;
                }
                else if (a[mid] > target){
                    start=mid+1;
                }
                else if(a[mid] < target){
                    end =mid-1;
                }
            }
            return -1;
        }
       
        return -1;

    }


    public static int peekind(int a[]){

        int s =0;
        int l = a.length-1;

        while (s <= l ) {
            
            int mid = (s+l)/2;

            if (mid != 0 && mid!= a.length-1) {
                if (a[mid] > a[mid+1] && a[mid] >a[mid-1]) {
                    return mid;
                }
                else if(a[mid] <a[mid-1]){
                    l = mid-1;
                }
                else if(a[mid] <a[mid+1]){
                    s=mid+1;
                }

            } else {
                
                if(mid==0){
                    if (a[mid] > a[mid+1]) {
                        return mid;
                    }
                    else{
                        return mid+1;
                    }


                }
                else if(mid ==a.length-1){

                    if(a[mid] >a[mid-1]){
                        return mid;
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
