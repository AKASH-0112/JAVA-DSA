public class _4revreseString_firstlastOcuuranceOfELEMEnt {
      //------------------------------------------------------------------------------------------------------
      static void reverse(String str , int l){

            if(l==0){
                  System.out.print(str.charAt(l));
                  return; // vvvimp here to retun and end last function 
                  // otherwise the function will not end and  -1 index error aso comes
            }


            System.out.print(str.charAt(l));
            reverse(str,l-1);
      }


      //----------------------------------------------------------------------------------------------------
      // as we do not want to updated each time in paras , firstocc ,lastocc to avoid mekmroy  uses
      // we are gonna use them in static method , which will be used in static  main() , that is also one reason why they are not sueing   , intance   var
      // intance do not  works ,but for using them in static occur() , we need to created obj ref each stack or call, and update  ref obj variable , each time
      // in each stack /meth call ref.firstocc will -1;
      // this is not what we want that updation contguous

      static int first_occur =-1;
      static int last_occur =-1; // we cant take 0, as it isone of index
      // we can also use them in paras but it will take each stack memory
      static void occuraance(String str , int i , char element){

            if (i==str.length()) {
                  System.out.println();
                  System.out.print(first_occur);
                  System.out.print(",");
                  System.out.print(last_occur);
                  return;
            }


            char currentchar = str.charAt(i);
            if (element==currentchar) {
                  if (first_occur == -1) {  // in each func call it is updated heap vala value 
                        first_occur =i;   // update heap vala first_occ
                  } else {
                        last_occur =i;
                  }
            }

            occuraance(str, i+1, element);
      }
      //after methd use , metho ke bar static var will be new value ,padted
      // as they are in heap  and updated 
      // so thy are called dynamic memory updated in for method



      public static void main(String[] args) {
           
            // ---------- string in reverse
            // o(n)
            String str ="AKl";
            int i = str.length()-1;
            reverse(str,i);

            // --------------1st and last occurance of elemenet in string

            String name ="aaksjkjskdja";
            char element ='a';
            occuraance(name,0, element);

            // System.out.println(first_occur);
            // System.out.println(last_occur);
      }
}



//  1 ] we are using it in sattic method so
//  2 ]  to save memory not use para as firstocuu  .
//  3 ]  we cant use  intance var here, bcz need to create ref obj , which will not carrry previous call updated firstoccu , it will just create new obj ref for each recusrive call, with original instance variables the updated firsoccur instace var will be limited to that ref or obj only


//  static is only one copy per class