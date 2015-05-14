public class ListUtilities {
    public static IntSortedList arrayToTreeList(int first, String kind, int[] array) {
        if (kind.equals("tree")) {
            IntSortedList tree = new TreeIntSortedList(first);
            for (int i = 0; i < array.length; i++) {
                tree.add(array[i]);
            }
            return tree;
        } else {
            IntSortedList list = new ListIntSortedList(first);
            for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }
            return list;
        }
    }
}
