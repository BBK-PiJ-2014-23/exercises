public class IntegerTreeNodeTester
{
    public static void main (String[] args) {
        int[] array = {3, 9, 20, 11, 12, 4};
        IntegerTreeNode tree = ListUtilities.arrayToTreeNode(6, array);
        System.out.println(tree.contains(11));
        System.out.println(tree.contains(5));
        System.out.println(tree.getMax());
        System.out.println(tree.getMin());
        System.out.println(tree.toString());
        System.out.println(tree.toStringSimple());
        System.out.println(tree.depth());
        tree.remove(11);
        System.out.println(tree.toStringSimple());
        System.out.println(tree.contains(11));
        System.out.println(tree.countNodes());
    }
}
