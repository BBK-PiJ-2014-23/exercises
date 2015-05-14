public class IntegerListNodeImpl implements IntegerListNode {
    int value;
    IntegerListNode next;

    public IntegerListNodeImpl(int first) {
        this.value = first;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public void setNext(IntegerListNode next) {
        this.next = next;
    }

    public IntegerListNode getNext() {
        return next;
    }

    public void add(int newNumber) {
        if (next == null) {
            next = new IntegerListNodeImpl(newNumber);
        } else {
            next.add(newNumber);
        }
    }

    public void addSorted(int newNumber) {
        if (next != null && newNumber <= next.getValue()) {
            IntegerListNode temp = next;
            next = new IntegerListNodeImpl(newNumber);
            next.setNext(temp);
        } else if (next == null && newNumber <= value) {
            int temp = value;
            value = newNumber;
            next = new IntegerListNodeImpl(temp);
        } else if (next == null) {
            next = new IntegerListNodeImpl(newNumber);
        } else {
            next.addSorted(newNumber);
        }
    }

    public boolean contains(int number) {
        if (number == this.value) {
            return true;
        } else if (next == null) {
            return false;
        } else {
            return next.contains(number);
        }
    }

    public boolean containsVerbose(int number) {
        if (number == this.value) {
            System.out.println(value);
            return true;
        } else if (next == null) {
            System.out.println(value);
            return false;
        } else {
            System.out.println(value);
            return next.containsVerbose(number);
        }
    }

    public String toString() {
        if (next == null) {
            return "" + this.value;
        } else {
            return "" + this.value + ", " + next.toString();
        }
    }
}