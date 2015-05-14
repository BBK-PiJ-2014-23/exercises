public class ListIntSet implements IntSet {
    private IntegerListNode set;
    
    public ListIntSet(int first) {
        set = new IntegerListNodeImpl(first);
    }
    
    public boolean add(int newNumber) {
        if (!set.contains(newNumber)) {
            set.add(newNumber);
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(int number) {
        return set.contains(number);
    }

    public boolean containsVerbose(int number) {
        return set.containsVerbose(number);
    }

    public String toString() {
        return set.toString();
    }
}