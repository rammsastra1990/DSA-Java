// DoublyLinkedList class
public class DoublyLinkedList {
  Node head; // reference to the first node
  Node tail; // reference to the last node

  // constructor
  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  // method to insert a node at the beginning of the list
  public void insertAtBeginning(int data) {
    Node newNode = new Node(data); // create a new node
    if (head == null) { // if the list is empty
      head = newNode; // set the new node as the head and tail
      tail = newNode;
    } else { // if the list is not empty
      newNode.next = head; // set the next pointer of the new node to the current head
      head.prev = newNode; // set the prev pointer of the current head to the new node
      head = newNode; // set the new node as the head
    }
  }

  // method to insert a node at the end of the list
  public void insertAtEnd(int data) {
    Node newNode = new Node(data); // create a new node
    if (tail == null) { // if the list is empty
      head = newNode; // set the new node as the head and tail
      tail = newNode;
    } else { // if the list is not empty
      newNode.prev = tail; // set the prev pointer of the new node to the current tail
      tail.next = newNode; // set the next pointer of the current tail to the new node
      tail = newNode; // set the new node as the tail
    }
  }

  // method to insert a node at a given position in the list
  public void insertAtPosition(int data, int position) {
    Node newNode = new Node(data); // create a new node
    if (position < 1) { // if the position is invalid
      System.out.println("Invalid position");
    } else if (position == 1) { // if the position is 1, insert at the beginning
      insertAtBeginning(data);
    } else { 
      Node current = head; // start from the head of the list
      int count = 1; // keep track of the current position
      while (current != null && count < position - 1) { // traverse until we reach one position before or end of the list 
        current = current.next; 
        count++;
      }
      if (current == null) { // if we reached end of list, insert at end 
        insertAtEnd(data);
      } else { 
        newNode.next = current.next; // set next pointer of new node to next pointer of current node 
        newNode.prev = current; // set prev pointer of new node to current node 
        if (current.next != null) { 
          current.next.prev = newNode; // set prev pointer of next node to new node 
        } else {
          tail = newNode; // if next node is null, set new node as tail 
        }
        current.next = newNode; // set next pointer of current node to new node 
      }
    }
  }

  // method to delete a node from the beginning of the list 
  public void deleteFromBeginning() {
    if (head == null) { // if list is empty, do nothing 
      return;
    } else if (head == tail) { // if list has only one node, delete it and set head and tail to null 
      head = null;
      tail = null;
    } else { 
      head = head.next; // set head to next node 
      head.prev = null; // set prev pointer of new head to null 
    }
  }

  // method to delete a node from the end of the list 
  public void deleteFromEnd() {
    if (tail == null) { // if list is empty, do nothing 
      return;
    } else if (head == tail) { // if list has only one node, delete it and set head and tail to null 
      head = null;
      tail = null;
    } else { 
      tail = tail.prev; // set tail to prev node 
      tail.next = null; // set next pointer of new tail to null 
    }
  }

  // method to delete a node from a given position in the list 
  public void deleteFromPosition(int position) {
    if (position < 1) { // if the position is invalid 
      System.out.println("Invalid position");
    } else if (position == 1) { // if the position is 1, delete from the beginning 
      deleteFromBeginning();
    } else { 
      Node current = head; // start from the head of the list 
      int count = 1; // keep track of the current position 
      while (current != null && count < position) { // traverse until we reach the position or end of the list 
        current = current.next;
        count++;
      }
      if (current == null) { // if we reached end of list, do nothing 
        return;
      } else { 
        if (current.next != null) { 
          current.next.prev = current.prev; // set prev pointer of next node to prev pointer of current node 
        } else {
          tail = current.prev; // if next node is null, set prev node as tail 
        }
        if (current.prev != null) { 
          current.prev.next = current.next; // set next pointer of prev node to next pointer of current node 
        } else {
          head = current.next; // if prev node is null, set next node as head 
        }
      }
    }
  }

  // method to display the data of the list in forward direction
  public void displayForward() {
    Node current = head; // start from the head of the list
    while (current != null) { // traverse until end of the list
      System.out.print(current.data + " "); // print the data of the current node
      current = current.next; // move to the next node
    }
    System.out.println(); // print a new line
  }

  // method to display the data of the list in backward direction
  public void displayBackward() {
    Node current = tail; // start from the tail of the list
    while (current != null) { // traverse until end of the list
      System.out.print(current.data + " "); // print the data of the current node
      current = current.prev; // move to the previous node
    }
    System.out.println(); // print a new line
  }

  // public static void main(String[] args) {
  //   DoublyLinkedList dll = new DoublyLinkedList(); // create a doubly linked list object
  //   dll.insertAtBeginning(10); // insert 10 at the beginning
  //   dll.insertAtEnd(20); // insert 20 at the end
  //   dll.insertAtPosition(15, 2); // insert 15 at position 2
  //   dll.displayForward(); // display forward: 10 15 20
  //   dll.displayBackward(); // display backward: 20 15 10
  //   dll.deleteFromBeginning(); // delete from beginning
  //   dll.deleteFromEnd(); // delete from end
  //   dll.deleteFromPosition(1); // delete from position 1
  //   dll.displayForward(); // display forward: empty list
  //   dll.displayBackward(); // display backward: empty list
  // }
}