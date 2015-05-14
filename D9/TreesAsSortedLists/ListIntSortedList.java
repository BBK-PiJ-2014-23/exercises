public class ListIntSortedList implements IntSortedList {
    IntegerListNode node;
    
    public ListIntSortedList(int number) {
        node = new IntegerListNodeImpl(number);
    }
    
    /**
     * Adds a new int to the list so that the list remains sorted; a list can contain duplicates unlike a set.
     */
    public void add(int newNumber) {
        node.addSorted(newNumber);
    }
    
    /**
     * Returns true if the number is in the list, false otherwise.
     */
    public boolean contains(int number) {
        return node.contains(number);
    }
    
    /**
     * Returns a string with the values of the elements in the list separated by commas.
     */
    public String toString() {
        return node.toString();
    }
}
