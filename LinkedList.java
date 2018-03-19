

public class LinkedList<D>{

  Node<D> head;
  int count;

  public LinkedList(){
    head = null;
    count  = 0;
  }

  public LinkedList(Node<D> head) {
    this.head = head;
    count = 1;
  }

  public void add(D data){
    Node<D> newNode = new Node(data);
    Node<D> current = head;
    while(current.getNext() != null){
      current = current.getNext();
    }
    current.setNext(newNode);
    count++;
  }

  public D get(int index){
    /*if (index <= 0){ //V2.0 Generics exercise; since D is not always int, return -1 will not work.
      //return -1;//If the request (the given index) is not valid.
      //Or an exception might be thrown.
    }*/
    Node<D> current = head;
    for (int i=1; i<index; i++){
      current = current.getNext();
    }
    return current.getData();
  }

  public int size(){
    return count;
  }

  public boolean isEmpty(){
    return head == null;
  }

  public void remove(){ //Remove from the end of the list.
    Node<D> current = head;
    while (current.getNext().getNext() != null){
      current = current.getNext();
    }
    current.next = null;
    count--;
  }

  public static void main (String[] args){
    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("Alice");
    linkedList.add("Jane");
    System.out.println(linkedList);
  }

}
