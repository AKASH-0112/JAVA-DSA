
// -------- scrach implememtation of linkedlist
// heap memory allocation

public class _2linkelistcode {

    private int size;

    _2linkelistcode(){
        this.size=0;
    }



     Node head; // head will be having nodes 

    // node inner class (ele + next ref)  represent as class
    class Node{

        String data;
        Node next; // next  ka type Node , bcz next is node

        // constructor for node
        Node(String data){// only pass elemenet , null wil be assigned auto
            this.data = data;
            this.next =null; // whenever we create elel in node , next always assigned to null , at initial

            size++;
        }
        
    }
    // add,last ,first
    // first ,  next ref of added new node will point to initial head , then initial head will be shifted to new added node
    public  void addFirst(String data){

        Node newnode =new Node(data);// shuruwaat me node bntaa
       if (head==null) { // means no node before
            head = newnode;
            return;
       }
       newnode.next =head;
       head =newnode;

    }
    // add last , head se travel kro untill last node or node's next is null, and that last nodes next point toward newnode
    // newnodes next alredy is null
    public  void addLast(String data){
        Node newnode =new  Node(data);
        if (head==null) {
            head =newnode;
        }

        // travels inked list to last node
        Node currenode = head ; // new node having head nodes values
        while (currenode.next != null) {
            currenode = currenode.next;
        }// at end currentnode is last node ,having next as null


        currenode.next =newnode;
    }

    //  printi linked list
    public  void printl(){

        if (head==null) {
            System.out.println("empty list");
        }

        Node currentnode = head;

        while (currentnode != null) {  // we need last node to print so  , we do not use next
            System.out.print(currentnode.data +" -->");
            currentnode =currentnode.next;
        }
        System.out.println("null");
    }

    // delete(first ,last)
    // delete first
    // first ka next ko head transfer kro  , and phle vala will be collected by garbage
    public void deletefirst(){
        if (head==null) {
            System.out.println("empty h");
            return;
        }
        size--;
        head =head.next;
    }
    //  delete (last) , second last node ke next ko null bnaao
    public void deletelast(){

        if (head==null) {
            
            System.out.println("empty list");
            return;
        }

        size--; // position must be this only ,

        if (head.next == null) {
            head =null;
            return;
        }
        Node scnlastnode  = head ;
        Node lastnode = head.next; // if one node is in LL, then head.next= null 
        while (lastnode.next != null) { // and null.next donot exist   , corner case  , we write if above
            scnlastnode = scnlastnode.next;
            lastnode =lastnode.next;
        }
        scnlastnode.next =null;

    }

    public int getsize(){
        return size;
    }
    
    public static void main(String[] args) {
        _2linkelistcode list = new _2linkelistcode(); //mutable h
        // basic 4 operations  , add(lasst , first) ,printing ,delete(first ,last),size 
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printl();
        list.deletefirst();
        list.deletelast();
        list.printl();   

        System.out.println(list.getsize());
        
    }
}
//  heap pointer always at first node , all time 
// never travel head or manipulation operation on it , as it is at first always ,(while traveling to last node we never use head to travel see above)
// otherwise if head goes forward , we will loose left side nodes