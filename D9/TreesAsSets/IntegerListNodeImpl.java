public class IntegerListNodeImpl implements IntegerListNode {
    int value;
    IntegerListNode next;

    public IntegerListNodeImpl(int first) {
        this.value = first;
        next = null;
    }

    public void add(int newNumber) {
        if (next == null) {
            next = new IntegerListNodeImpl(newNumber);
        } else {
            next.add(newNumber);
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