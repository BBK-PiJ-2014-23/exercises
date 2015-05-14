public class ListUtilities {
    public static IntSet arrayToSet(int first, String kind, int[] array) {
        if (kind.equals("tree")) {
            IntSet set = new TreeIntSet(first);
            for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
            }
            return set;
        } else {
            IntSet set = new ListIntSet(first);
            for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
            }
            return set;
        }
    }
}