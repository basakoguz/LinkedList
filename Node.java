

public class Node<D> {
    Node<D> next;
    D data; //V2.0 To make the data type Generic, D is added.
    //Node previous; (double linkedlists)

    public Node(D data){
      this.data = data;
      next = null;
    }

    public Node(D data, Node<D> next){
      this.data = data;
      this.next = next;
    }

    //Getters and Setters
    public D getData(){
      return data;
    }

    public Node<D> getNext(){
      return next;
    }

    public void setData(D data){
      this.data = data;
    }

    public void setNext(Node<D> next){ //IMPORTANT TO REMEMBER TO ADD D
      this.next = next;
    }

    public static void main(String[] args){

    }
}
