import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeLinkedListTest {
    @Test
    public void shouldaddToFront(){
        NodeLinkedList list = new NodeLinkedList();
        assertEquals(0,list.getSize());
        list.addToFront(5);
        assertEquals(1,list.getSize());;
        list.addToFront(10);
        assertEquals(2, list.getSize());
        list.addToFront(15);
        assertEquals(3, list.getSize());


    }
    @Test
    public void shouldaddToTail(){
        NodeLinkedList listA = new NodeLinkedList();
        listA.addToTail(5);
        assertEquals(1,listA.getSize());
        listA.addToTail(10);
        assertEquals(2,listA.getSize());
    }

    @Test
    public void shouldremoveFromFront(){
        NodeLinkedList list = new NodeLinkedList();
        assertEquals(0,list.getSize());
        list.addToFront(5);
        assertEquals(1,list.getSize());;
        list.addToFront(10);
        assertEquals(2, list.getSize());
        list.addToFront(15);
        assertEquals(3, list.getSize());
        list.removeFromFront();
        assertEquals(2, list.getSize());

    }
    @Test
    public void shouldremoveFromFrontempty(){
        NodeLinkedList list = new NodeLinkedList();
        list.removeFromFront();
        assertEquals(0,list.getSize());
        assertEquals(null,list.getHead());

    }
    @Test
    public void shouldremoveTail(){
        NodeLinkedList list = new NodeLinkedList();
        assertEquals(0,list.getSize());
        list.addToFront(5);
        assertEquals(1,list.getSize());;
        list.addToFront(10);
        assertEquals(2, list.getSize());
        list.addToFront(15);
        assertEquals(3, list.getSize());
        list.removeTail();
        assertEquals(2, list.getSize());
    }
    @Test
    public void shouldremoveTailempty(){
        NodeLinkedList list = new NodeLinkedList();
        list.removeTail();
        assertEquals(0, list.getSize());
        assertEquals(null, list.getHead());
    }
    @Test
    public void shouldDoAll(){
        NodeLinkedList list = new NodeLinkedList();
        list.addToFront(5);
        list.addToTail(10);
        list.addToTail(15);
        list.addToTail(20);
        assertEquals(4, list.getSize());
        assertEquals(20, list.getTail().getValue());
        list.removeTail();
        assertEquals(3,list.getSize());
        assertEquals(15,list.getTail().getValue());
        list.removeFromFront();
        assertEquals(2,list.getSize());
        assertEquals(10,list.getHead().getValue());

    }


}