import java.util.*;

public class bigEnough {
    public static void main(String[] args) {
        Employees employees = new Employees(2);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean finished = false;
        
        while (!finished) {
            System.out.print("Enter new employee ID: ");
            int id = sc1.nextInt();
            System.out.print("Enter employee's name: ");
            String name = sc2.nextLine();
            if (id == 0 || name.length() == 0) {
                finished = true;
            } else {
                employees.setId(id);
                employees.setName(name);
            }
        }

        for (int i = 0; i < employees.getSize(); i++) {
            if (employees.getId(i) % 2 == 0 || employees.getName(i).charAt(0) == 'S') {
                System.out.println(employees.getId(i) + ", " + employees.getName(i));
            }
        }
    }
}