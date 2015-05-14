
/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node
{
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
    public Node getNext() {
        return next;
    }
}