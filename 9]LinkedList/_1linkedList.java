public class _1linkedList {
    public static void main(String[] args) {
        
        //  Arraylist
        // dynamic array , increase size at last psoition , by   n/2 + 1
        //  adding at index ,inserting O(n)  ,add( 2 , 765)
        // search ,get(ind) , O(1)

        // lInked list memory allocation of element is non contigius
        // last node is linked to null,means empty
        // adding at any index ,  we need to add directly , by breaking egde and connecting to new added , O(1)
        // searching O(n)

        // ==> if we have more  operation of add and less of searching , use linkedlist and viceverse

        // linked list variable size  until comp memory full
        //non contigious
        // insert O(1)
        // search O(n)

        // node is linked to each other
        //last node is nullnode ,emptynode
        // node has , data + next ref/pointer/linking
        // nullnode has not next ref

        // we need to keep adress of first node only , bcz we can track all other by it only
        // types of linked list , 
        //1] singular , []-->[]-->null
        //2] doubly  ,  []<-->[]<-->[]<-->null  , aage bhi ja skte piche ,pointer to previous node too
        //3 ] circular ,  [] --> [] -->[]  , to first node , no null  
        // circular double linkedlist also there complex ds

        
    }
}
