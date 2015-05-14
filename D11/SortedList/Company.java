public class Company {
    public static void main(String[] args) {
        List<String> names = new List<String>();
        List<Integer> nic = new List<Integer>();
        names.add("Tom");
        names.add("Joe");
        names.add("John");
        names.add("Carla");
        nic.add(0);
        nic.add(1);
        nic.add(2);
        nic.add(3);

        names.printList();
        nic.printList();
        names.printListBackwards();
        nic.printListBackwards();
        System.out.println(names.Length());
        System.out.println();
        names.delete("Joe");
        names.delete("Carla");
        nic.delete(1);
        nic.delete(3);
        names.printList();
        nic.printList();
        names.printListBackwards();
        nic.printListBackwards();
        System.out.println(names.Length());
        System.out.println();
        names.delete("Tom");
        nic.delete(0);
        names.printList();
        nic.printList();
        names.printListBackwards();
        nic.printListBackwards();
        System.out.println(names.Length());
        System.out.println();

        names.add("Anthony");
        names.delete("Me");
        nic.add(4);
        nic.delete(99);
        names.printList();
        nic.printList();
        names.printListBackwards();
        nic.printListBackwards();
        System.out.println(names.Length());
        
        System.out.println();
    }
}