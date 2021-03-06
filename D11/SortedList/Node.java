public class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> previous;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public int compareTo(T value) {
        if (this.getValue() < value) {
            return -1;
        } else if (this.getValue() == node.getValue()) {
            return 0;
        } else {
            return 1;
        }
    }
}