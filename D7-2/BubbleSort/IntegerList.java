public class IntegerList {
    private IntegerNode first;
    
    public IntegerList() {
       first = null; 
    }
    
    public void setFirst(IntegerNode node) {
        first = node;
    }
    
    public IntegerNode getFirst() {
        return first;
    }
    
    public void add(int number) {
        IntegerNode newNumber = new IntegerNode(number);
        if (first == null) {
            first = newNumber;
            return;
        }
        IntegerNode current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNumber);
    }
    
    public void printList() {
        IntegerNode current = first;
        while (current != null) {
            System.out.print(current.getNumber() + ", ");
            current = current.getNext();
        }
        System.out.println();
    }   
    
    public static void main(String[] args) {
        int[] array = {5, 3, 8};
        IntegerList intList = ListUtilities.arrayToLinkedList(array);
        intList.printList();
        intList = ListUtilities.bubbleSort(intList);
        intList.printList();
    }
}