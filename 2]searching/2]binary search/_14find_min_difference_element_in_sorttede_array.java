public class _14find_min_difference_element_in_sorttede_array {
    

    public static void main(String[] args) {
        
        //  what que say is , ki we need o find a ele from sorted array 
        // such that targteted element  with that element form min diff compared to all other  array elemets

        // if target element present in array , then target itself is min diff element (0)
        // if not , then cheking nearby numbers will give min diff only
        // nearby --->  1]  ceil 2] floor


        int a [] = { 3 ,6 ,8 ,13 ,24 ,56 ,89};

        System.out.println(mindiffproducedele(a , 13));
        System.out.println(mindiffproducedele(a , 18));
    }
    public static int mindiffproducedele(int a[] ,int targte){

        int s =0; 
        int l = a.length-1;

        while ( s <=l) {
            
            int mid = (s+l)/2;

            if(a[mid] ==targte){
                return targte;
            }
            else if(targte > a[mid]){
                s =mid+1;
            }
            else if(a[mid] > targte){
                l =mid-1;
            }
        }

        int ans1  = targte - a[l];
        int ans2  = a[s] - targte;

        if(ans1 >ans2){
            return a[s];
        }else{
        return a[l];
        }
    }
}


// next concept is binary search on unsorrtede arrray ,we just need to developed criteria to move