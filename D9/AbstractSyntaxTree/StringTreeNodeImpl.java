public class StringTreeNodeImpl implements StringTreeNode {
    private String node;
    private StringTreeNode left;
    private StringTreeNode right;

    public StringTreeNodeImpl(String str) {
        node = str;
        left = null;
        right = null;
    }
    
    public void add(String newStr) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNodeImpl(newNumber);
            } else {
                right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNodeImpl(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }

    public String toString() {
        if (left == null && right == null) {
            return this.value + ", ";
        } else if (left != null && right != null) {
            return left.toString() + this.value + ", " + right.toString();
        } else if (left!= null) {
            return left.toString() + this.value + ", ";
        } else if (right!= null) {
            return this.value + ", " + right.toString();
        } else {
            return "";
        }
    }
    
    public static StringTreeNode input(String input) {
        String input = "34 + 3";
        String[] array = new String[3];
        return array;
    }
}
