public class IntegerList {
    private IntegerNode first;

    public IntegerList() {
        first = null; 
    }

    public void add(int number) {
        IntegerNode newNode = new IntegerNode(number);
        if (first == null) {
            first = newNode;
            return;
        } else if (first.getNumber() > newNode.getNumber()) {
            IntegerNode temp = first;
            first = newNode;
            first.setNext(temp);
            return;
        }
        IntegerNode current = first;
        while (current.getNext() != null && current.getNext().getNumber() < newNode.getNumber()) {
            current = current.getNext();
        }
        IntegerNode temp = current.getNext();
        current.setNext(newNode);
        current.getNext().setNext(temp);
    }

    public String getList() {
        IntegerNode current = first;
        String list = "";
        while (current != null) {
            list = list + current.getNumber() + ", ";
            current = current.getNext();
        }
        return list;
    }
}