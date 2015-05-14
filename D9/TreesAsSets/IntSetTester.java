public class IntSetTester {
    public static void main(String[] args) {
        int[] array = {3, 9, 9, 20, 11, 11, 12, 4};
        IntSet set = ListUtilities.arrayToSet(6, "tree", array);
        System.out.println(set.contains(11));
        System.out.println(set.contains(5));
        System.out.println(set.containsVerbose(11));
        System.out.println(set.containsVerbose(5));
        System.out.println(set.toString());
        System.out.println();
        
        IntSet set2 = ListUtilities.arrayToSet(6, "list", array);
        System.out.println(set2.contains(11));
        System.out.println(set2.contains(5));
        System.out.println(set2.containsVerbose(11));
        System.out.println(set2.containsVerbose(5));
        System.out.println(set2.toString());
        System.out.println();
    }
}