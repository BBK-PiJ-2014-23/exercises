public class List<T> {
    protected Node<T> first;

    public List() {
        first = null;
    }

    public void add(T value) {
        Node<T> newValue = new Node<T>(value);
        if (first == null) {
            first = newValue;
            return;
        }
        Node<T> current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newValue);
        current.getNext().setPrevious(current);
    }

    public void delete(T value) {
        Node<T> delNode = new Node<T>(value);
        if (first.getValue().equals(delNode.getValue())) {
            first = first.getNext();
            first.setPrevious(null);
            return;
        }
        Node<T> current = first;
        while (current.getNext() != null) {
            if (current.getNext().getNext() != null) {
                if (current.getNext().getValue().equals(delNode.getValue())) {
                    current.setNext(current.getNext().getNext());
                    current.getNext().setPrevious(current);
                }
                current = current.getNext();
            } else if (current.getNext().getValue().equals(delNode.getValue())) {
                current.setNext(null);
            } else {
                return;
            }
        }
    }

    public int Length() {
        if (first == null) {
            return 0;
        }
        int counter = 1;
        Node<T> current = first;
        while (current.getNext() != null) {
            current = current.getNext();
            counter++;
        }
        return counter;
    }

    public void printList() {
        Node<T> current = first;
        while (current != null) {
            System.out.print(current.getValue() + ", ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void printListBackwards() {
        Node<T> current = first;
        while (current.getNext() != null) {
            current = current.getNext(); 
        }

        while (current != null) {
            System.out.print(current.getValue() + ", ");
            current = current.getPrevious();
        }
        System.out.println();
    } 
}
