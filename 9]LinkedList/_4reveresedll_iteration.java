public class _4reveresedll_iteration {
    private int size;
    _4reveresedll_iteration(){ // linked list bnte hi size initilized ho jay
        this.size=0;
    }
    Node head; // head will be having nodes so  node type of refvar h head  // have default values as null, (objests ref var default values )
    class Node{
        String data;
        Node next; 
        Node(String data){
            this.data = data;
            this.next =null; 
            size++;
        }
        
    }
    public  void addFirst(String data){

        Node newnode =new Node(data);
       if (head==null) { 
            head = newnode;
            return;
       }
       newnode.next =head;
       head =newnode;

    }
    public  void addLast(String data){
        Node newnode =new  Node(data);
        if (head==null) {
            head =newnode;
        }

        Node currenode = head ; 
        while (currenode.next != null) {
            currenode = currenode.next;
        }

        currenode.next =newnode;
    }
    public  void printl(){

        if (head==null) {
            System.out.println("empty list");
        }

        Node currentnode = head;

        while (currentnode != null) { 
            System.out.print(currentnode.data +" -->");
            currentnode =currentnode.next;
        }
        System.out.println("null");
    }

    public void deletefirst(){
        if (head==null) {
            System.out.println("empty h");
            return;
        }
        size--;
        head =head.next;
    }

    public void deletelast(){

        if (head==null) {
            
            System.out.println("empty list");
            return;
        }

        size--; 

        if (head.next == null) {
            head =null;
            return;
        }
        Node scnlastnode  =head ;
        Node lastnode = head.next; 
        while (lastnode.next != null) { 
            scnlastnode = scnlastnode.next;
            lastnode =lastnode.next;
        }
        scnlastnode.next =null;

    }

    public int getsize(){
        return size;
    }

    public void reversell(){

        // if head is null empty ll ,
        if (head==null) {
            return;
        }
        // if one node  , single node is always reveresd
        if (head.next ==null) {
            return;
        }

        // this two are outside loop ,
        Node prenode = head; // gonna use at last  ,head =prenode
        Node currnode = head.next; //  for while condtion
        while (currnode !=null) {
            Node nextnode =currnode.next;
            currnode.next =prenode;
            //updation 
            prenode =currnode;
            currnode =nextnode;
            
        }
        // to remove that double edge 
        head.next =null;
        // at while breaking condtion , cuurentnode will be  , and prevnode will be the last so point it head 
        head = prenode;
    }
    public static void main(String[] args) {
        
        // 2 ways to reverese (iterative , recursive) + collection framework ka ek way
        // [h] 1->2->3->null  to     null<-1<-2<-3[h]
        // without using extra space , O(1)
        // with time O(n)
        
        _4reveresedll_iteration ll =new _4reveresedll_iteration();
        
        ll.addFirst("Aksh");
        ll.addLast("is");
        ll.addFirst("boy");
        ll.printl();
        
        
        
        
        // 1] iterative way
        // by using 3 variables, pre ,curr, next nodes
        // here is call for reverese 
        ll.reversell();
        ll.printl();
        
        


    }
}
//  why to use 3 var  , to avoid garbage collection of cutted inklist


//  another approch for reversing is 
// taking pre = null;
// no need to break that extra edge 
// in platforms it works only