public class NodeLinkedList {
    private Node head;
    private int size=0,number;


    public void addToFront(int value){
        Node node = new Node(value);
        node.setNext(head);
        head = node;
        size++;
    }
    public void addToTail(int value){

        Node node = new Node(value);
        Node node1 = head;
        if(size == 0){
            head=node;
        }
        else{
            for(int i = 0; i<size-1; i++){
                node1 = node1.getNext();
            }
            node1.setNext(node);
        }
        size++;
    }
    public Node removeFromFront(){
        if (head!=null) {
            Node newHead = head.getNext();
            Node oldHead = head;
            oldHead.setNext(null);
            head = newHead;
            size--;
            return oldHead;
        }
        else{
            return null;
        }


    }
    public void remove(int value){
        Node node = head;
        if(node.getValue()==value){
            removeFromFront();
        }
        else{
            while(node != null){
                if(node.getNext()!= null && node.getNext().getValue()==value){
                    Node nextNode = node.getNext();
                    node.setNext(node.getNext().getNext());
                    nextNode.setNext(null);
                }
                node=node.getNext();
            }
        }
    }
    public Node removeTail(){
        Node x = head;
        int v=0;
        if(head != null) {
            while (x != null) {
                if (x.getNext().getNext() == null) {
                    v = x.getNext().getValue();
                    remove(x.getNext().getValue());
                }
                x = x.getNext();
            }
            size--;
        }
        return null;

    }
    public Node getTail(){
        Node node =head;
        if(head!=null) {
            for (int i = 0; i < size - 1; i++) {
                node = node.getNext();
            }
            return node;
        }
        else{
            return null;
        }

    }
    public int getSize(){
        return size;
    }
    public Node getHead(){
        return head;
    }
    public int getNumber(){
        return number;
    }
}
