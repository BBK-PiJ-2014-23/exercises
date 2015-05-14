public class IntegerTreeNodeImpl implements IntegerTreeNode {
    private int value;
    private IntegerTreeNode left;
    private IntegerTreeNode right;

    public IntegerTreeNodeImpl(int number) {
        value = number;
        left = null;
        right = null;
    }

    public void add(int newNumber) {
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

    public boolean contains(int n) {
        if (n == this.value) {
            return true;
        } else if (n > this.value) {
            if (right == null) {
                return false;
            } else {
                return right.contains(n);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(n);
            }
        }
    }

    public boolean containsVerbose(int n) {
        if (n == this.value) {
            System.out.println(value);
            return true;
        } else if (n > this.value) {
            System.out.println(value);
            if (right == null) {
                return false;
            } else {
                return right.containsVerbose(n);
            }
        } else {
            System.out.println(value);
            if (left == null) {
                return false;
            } else {
                return left.containsVerbose(n);
            }
        }
    }

    public int getMax() {
        if (right == null) {
            return this.value;
        } else {
            return right.getMax();
        }
    }

    public int getMin() {
        if (left == null) {
            return this.value;
        } else {
            return left.getMin();
        }
    }

    public String toString() {
        if (left == null && right == null) {
            return "[" + this.value + " L[] R[]]";
        } else if (left != null && right != null) {
            return "[" + this.value + " L" + left.toString() + " R" + right.toString() + "]";
        } else if (left!= null) {
            return "[" + this.value + " L" + left.toString() + "] R[]";
        } else if (right!= null) {
            return "[" + this.value + " L[] R" + right.toString() + "]";
        } else {
            return "";
        }
    }

    public String toStringSimple() {
        if (left == null && right == null) {
            return "[" + this.value + "]";
        } else if (left != null && right != null) {
            return "[" + this.value + " " + left.toStringSimple() + " " + right.toStringSimple() + "]";
        } else if (left!= null) {
            return "[" + this.value + " " + left.toStringSimple() + "]";
        } else if (right!= null) {
            return "[" + this.value + " " + right.toStringSimple() + "]";
        } else {
            return "";
        }
    }

    public String toStringComma() {
        if (left == null && right == null) {
            return this.value + ", ";
        } else if (left != null && right != null) {
            return this.value + ", " + left.toStringComma() + right.toStringComma();
        } else if (left!= null) {
            return this.value + ", " + left.toStringComma();
        } else if (right!= null) {
            return this.value + ", " + right.toStringComma();
        } else {
            return "";
        }
    }

    public String toSortedString() {
        if (left == null && right == null) {
            return this.value + ", ";
        } else if (left != null && right != null) {
            return left.toSortedString() + this.value + ", " + right.toSortedString();
        } else if (left!= null) {
            return left.toSortedString() + this.value + ", ";
        } else if (right!= null) {
            return this.value + ", " + right.toSortedString();
        } else {
            return "";
        }
    }

    public int depth() {
        if (left == null && right == null) {
            return 0;
        } else if (left == null) {
            return 1 + right.depth();
        } else if (right == null) {
            return  1 + left.depth();
        } else {
            return Math.max(left.depth(), right.depth());
        }
    }
}