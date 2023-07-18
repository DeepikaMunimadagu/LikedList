import java.util.*;
class LinkedList {
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static Node head;
  public static Node tail;

  public void add(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = tail = newNode;
      return;
    }
    else{
      tail.next = newNode;
      tail = newNode;
    }
    
    
  }

  public void print(){
    if(head == null){
      System.out.println("LL is empty.");
      return;
    }
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.add(1);
    ll.print();
    ll.add(2);
    ll.print();
    ll.add(3);
    ll.print();
    ll.add(4);
    ll.print();
    ll.add(5);
    ll.print();
  }
}
