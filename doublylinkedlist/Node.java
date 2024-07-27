public class Node {
  int data; // data stored in the node
  Node prev; // reference to the previous node
  Node next; // reference to the next node

  // constructor
  public Node(int data) {
    this.data = data;
    this.prev = null;
    this.next = null;
  }
}
