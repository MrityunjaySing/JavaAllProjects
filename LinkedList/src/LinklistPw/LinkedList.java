package LinklistPw;

 class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    //implementation of insertion of a node at the end
     public void inserAtEnd(int newData){
        Node newNode = new Node(newData);
        // link list is empty
         if (head == null){
             head = new Node(newData);
             return;
         }
         // LinkList is not Empty
         newNode.next =null;
         Node temp = head;
         while (temp.next!=null){
             temp=temp.next;
         }
         temp.next = newNode;
         return;
     }
     //implementation of insertion of a node at the Beginning

     public void insertAtBeginning(int newData ){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
     }

     //Implementation of insertion of a node ofter any node
     public void inserAfter(Node prev_node, int newData){
        if(prev_node==null){
            System.out.println("previous node cannot contain null value");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next=prev_node.next;
        prev_node.next=newNode;
     }
     // implementation of displaying Link list
     public void displayLL(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
     }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.inserAtEnd(2);
        list.inserAtEnd(4);
        list.inserAtEnd(8);
        System.out.println("Before insertion of 10");
        list.displayLL();
        System.out.println();
        list.inserAtEnd(10);

        list.insertAtBeginning(1);
        list.insertAtBeginning(11);

        System.out.println("After insertion of 10");
        list.displayLL();
        System.out.println();

        list.inserAfter(list.head.next,13);
        list.displayLL();
        System.out.println();

    }
}
