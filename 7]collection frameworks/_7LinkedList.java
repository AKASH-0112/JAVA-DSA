import java.util.Iterator;
import java.util.LinkedList;


public class _7LinkedList {
    public static void main(String[] args) {
        

        //  normal LinkedList
        // same as ArrayList


        LinkedList<Integer> list = new LinkedList<>();
        // or
        // List<Integer> list = new LinkedList<>();


           //  add(e)  - - insequence
           list.add(1);
           list.add(2);
           list.add(3);
           System.out.println(list);// [ , , ,] -- > internally called tostring , basically tostring have hashcode bydefault but this arraylist class had overriden that method
           
           // add(i ,e) -- at index
           list.add(0, 0);
           System.out.println(list);
   
           //list.addAll(newlist) -- add another list after list
           LinkedList<Integer> nlist = new LinkedList<>();        
           nlist.add(9);
           nlist.add(8);
           nlist.add(7);
           list.addAll(nlist);
           System.out.println(list);
   
           //list.get(i)-- take element
           System.out.println(list.get(4));  
           
           //intration of Arraylist by for
           for (int i = 0; i < list.size(); i++) {  // .size()
               System.out.print(list.get(i)+ " ");
           }
           System.out.println();
           
           //intration of Arraylist by for each
           for (Integer i : list) {    // see here Integer is given not int , as it stored as objects
               System.out.print(i+" ");
           }
           System.out.println();
           
           //intration of Arraylist by iterator
           Iterator<Integer> it = list.iterator();
           while (it.hasNext()) {
               
               System.out.print(it.next() + " ");
           }
           System.out.println();
   
   
           //list.remove(i)  --- index pr ka remove 
           list.remove(1);
           System.out.println(list);
           
           //list.remove(e)
           list.remove(Integer.valueOf(9));
           System.out.println(list);
           
           
           //list.set(i ,e) -- update value
           list.set(3, 1000);
           System.out.println(list);
           
           //list.contains(e)
           boolean ans =list.contains(1000);
           System.out.println(ans);       
           
           
           //list.clear() -- empty Arralist at onces
           list.clear();
           System.out.println(list);
        


       
        
        }
}
