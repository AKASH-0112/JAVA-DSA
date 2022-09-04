class _9keypad_dialing_combination9 {

     static  String mapArray [] = { "." ,"abc","def","ghi","jkl"};
      static void possiblecombo(String str , int i , String combination){


            if (i >= str.length()) {
                  System.out.println(combination);
                  return;

            }


            char currentchar = str.charAt(i); // string 23 to char 2
            String map = mapArray[currentchar - '0']; // char to integer ,then to string

            for (int j = 0; j < map.length(); j++) {  // map ke lengt ke upr h howw many time it call recursive call
                  possiblecombo(str, i+1, combination+map.charAt(j));
            }

            //  for  bth  3 3  we will go for this
            // and as map also have 4 lenght string so we use for loop
            // possiblecombo(str, i+1, combination+map.charAt(0));
            // possiblecombo(str, i+1, combination+map.charAt(1));
            // possiblecombo(str, i+1, combination+map.charAt(2));
      }
      public static void main(String[] args) {
            
            //keypad combination of letters that can get  by given number
            possiblecombo("23", 0, "");


            //  onfirst level of tree nodes are 3^0
            // 3^1 ,3^2 which give 9 combination
            //  time O(3^n),- 3 is  alcso can chnage if string map is of 4 lenght  - n is lenght of map string max between both for upper bond
            // space complexity is O(n)   n is lenght of map string 2 -abc 3 defg  , max between them is taken


            // consider cas eof   abc klmn  3 and 4  ,in this case ime complxtiy is O(4^n)
            // in such case we need loop , as it will define how many time loop runs
            // like for second level itt will be 3 times 
            // but at 3rd level ,for leaf nodes it wil be 4 tims
            //  3 ka first will go with 4 ke each  means last node will have 4 nodes each of each 3 ka ek alphabest
            

            
      }



}


// System.out.println('2'-'0');  will convert into int and substract
// we use map array most time