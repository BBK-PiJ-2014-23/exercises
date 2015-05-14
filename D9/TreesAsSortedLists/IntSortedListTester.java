public class IntSortedListTester {
    public static void main(String[] args) {
        int[] array = {2, 9, 7, 12, 4, 3, 10, 17};
        IntSortedList tree = ListUtilities.arrayToTreeList(6, "tree", array);
        System.out.println(tree.contains(4));
        System.out.println(tree.contains(5));
        System.out.println(tree.toString());
        System.out.println();

        IntSortedList list = ListUtilities.arrayToTreeList(6, "list", array);
        System.out.println(list.contains(4));
        System.out.println(list.contains(5));
        System.out.println(list.toString());
        System.out.println();
    }
}
