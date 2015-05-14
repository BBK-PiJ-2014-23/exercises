public class Stack<T extends Number> {
    private Node<T> first;

    public Stack() {
        first = null;
    }

    public void push(T value) {
        Node<T> newNumber = new Node<T>(value);
        if (first == null) {
            first = newNumber;
            return;
        } else {
            Node<T> temp = first;
            first = newNumber;
            first.setNext(temp);
        }
    }

    public void pop() {
        if (empty()) {
            first = null;
            return;
        }
        first = first.getNext();
    }

    public int size() {
        if (first == null) {
            return 0;
        }
        Node<T> current = first;
        int counter = 1;
        while (current.getNext() != null) {
            counter++;
            current = current.getNext();
        }
        return counter;
    }

    public boolean empty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    public void printList() {
        Node<T> current = first;
        while (current != null) {
            System.out.print(current.getValue() + ", ");
            current = current.getNext();
        }
        System.out.println();
    }   

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>();
        intStack.printList();
        System.out.println(intStack.size());
        System.out.println(intStack.empty());
        intStack.push(0);
        intStack.push(1);
        intStack.printList();
        System.out.println(intStack.size());
        System.out.println(intStack.empty());
        intStack.pop();
        intStack.printList();
        System.out.println(intStack.size());
        System.out.println(intStack.empty());
        intStack.push(2);
        intStack.printList();
        System.out.println(intStack.size());
        System.out.println(intStack.empty());
        
        //Stack<String> errorStack = new Stack<String>();
    }
}