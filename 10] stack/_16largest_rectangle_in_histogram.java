public class _16largest_rectangle_in_histogram {
    

    public static void main(String[] args) {
        // brute force
        // given width is 1 only 
        // array with heights 
        //O(n^2)
        int []heights = {2,1,5,6,2,3};

        int maxrectans = 0 ; 
        int i =0 ;

        while (i < heights.length) {
            int currrectans = heights[i] ; 
            int in =1;
            int dec =-1;
            while (  in+i < heights.length && heights[i+in] >= heights[i]) { // remember that , to check first condtion first,otherwise error
                currrectans = heights[i] + currrectans;
                in++;
            }

            while (i+dec >=0 && heights[i] <= heights[i+dec]) {
                currrectans =currrectans + heights[i];
                dec--;
            }

            maxrectans = Math.max(currrectans, maxrectans);

            i++;  // dont forgot this otherwise no output in terminal
        }

        System.out.println(maxrectans);



        

    }
}
