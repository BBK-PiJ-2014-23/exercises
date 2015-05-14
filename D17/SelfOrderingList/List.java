
/**
 * Write a description of class List here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class List implements Runnable
{
    Node head;
    boolean isSorted;
    Thread sorter;

    public List() {
        head = null;
        isSorted = true;
        sorter = new Thread(this);
        sorter.start();
    }

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node runner = head;
            while (runner.getNext() != null) {
                runner = runner.getNext();
            }
            runner.setNext(node);
            isSorted = false;
        }
    }

    public int get(int pos) {
        int currentPos = 0;
        Node runner = head;
        while (currentPos < pos) {
            runner = runner.getNext();
            currentPos++;
        }
        return runner.getValue();
    }

    public synchronized void run() {
        Node runner = head;
        boolean isFinished = true;
        while(runner.getNext().getNext() != null) {
            if (runner.getNext().getValue() > runner.getNext().getNext().getValue()) {
                isFinished = false;
                Node next = runner.getNext();
                Node rest = runner.getNext().getNext().getNext();
                runner.setNext(runner.getNext().getNext());
                runner.getNext().setNext(next);
                runner.getNext().getNext().setNext(rest);
            }
            runner = runner.getNext();
        }
        if (isFinished) {
            isSorted = true;
        }
    }
}
