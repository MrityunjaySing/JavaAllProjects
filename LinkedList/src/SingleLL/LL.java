package SingleLL;

public class LL {
  Node head;
//simple linked list with 3 nodes and discussed linked list traversal
  class Node{
      int data;
       Node next;

       Node(int d){
          data = d;
          next =null;
       }
       //Add a node at the front:
    public void push(int new_data){
           Node new_node =new Node(new_data);
           new_node.next = head;
           head = new_node;
    }
    //Add a node after a given node
    public  void insertAfter(Node prve_node, int new_data){

           if(prve_node == null){
               System.out.println("privius value can not be null ");
           return;
           }
           Node new_node = new Node(new_data);
           new_node.next = prve_node.next;

    }
  }

}
