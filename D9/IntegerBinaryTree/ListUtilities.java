public class ListUtilities {
    public static IntegerTreeNode arrayToTreeNode(int first, int[] array) {
        IntegerTreeNode tree = new IntegerTreeNodeImpl(first);
        for (int i = 0; i < array.length; i++) {
            tree.add(array[i]);
        }
        return tree;
    }
}