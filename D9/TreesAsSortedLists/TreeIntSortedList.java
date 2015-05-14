public class TreeIntSortedList implements IntSortedList {
    private IntegerTreeNode node;

    public TreeIntSortedList(int number) {
        node = new IntegerTreeNodeImpl(number);
    }

    /**
     * Adds a new int to the list so that the list remains sorted; a list can contain duplicates unlike a set.
     */
    public void add(int newNumber) {
        node.add(newNumber);
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
       return node.toSortedString();
    }
}
