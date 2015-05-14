public class SortedList<T> extends List<T> {
    @Override
    public void add(T value) {
        Node<T> newValue = new Node<T>(value);
        if (first == null) {
            first = newValue;
            return;
        }
        Node<T> current = first;
        while (current.getNext().getValue() < newValue.getValue()) {
            current = current.getNext();
        }
        Node<T> temp = current.getNext();
        current.setNext(newValue);
        current.getNext().setPrevious(current);
        current.getNext().setNext(temp);
        current.getNext().getNext().setPrevious(newValue);
    }
}