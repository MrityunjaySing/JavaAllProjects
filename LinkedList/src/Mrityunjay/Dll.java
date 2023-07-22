package Mrityunjay;
// Doubely link list
public class Dll {
    private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prv= null;
        if(head!=null){
            head.prv = node;
        }
        head=node;
    }
    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.vla + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }
    private class Node{
        int vla;
        Node next;
        Node prv;
        public Node(int val){
           this.vla= val;
        }
        public Node(int val, Node next, Node prv){
            this.vla= val;
            this.next=next;
            this.prv=prv;
        }
    }

}
