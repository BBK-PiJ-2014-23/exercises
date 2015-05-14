import java.util.*;

public class AntiAircraftAim {
    public static void main(String[] args) {
        
        boolean playing = true;
        while (playing) {
            Target target = new Target(9, 9, 9);
            target.init();
            Scanner sc = new Scanner(System.in);
            System.out.println("Here they come! Try to bring the plane down!");

            boolean finished = false;
            while (!finished) {
                System.out.print("Enter a coordinate X: ");
                int x = Integer.parseInt(sc.next());
                System.out.print("Enter a coordinate Y: ");
                int y = Integer.parseInt(sc.next());
                System.out.print("Enter a coordinate Z: ");
                int z = Integer.parseInt(sc.next());

                switch (target.fire(x, y, z)) {
                    case HIT:
                    System.out.println("You hit it! Well done!");
                    finished = true;
                    break;
                    case FAIL_LEFT:
                    System.out.println("You missed! The target is to the right!");
                    break;
                    case FAIL_RIGHT:
                    System.out.println("You missed! The target is to the left!");
                    break;
                    case FAIL_LOW:
                    System.out.println("You missed! The target is higher!");
                    break;
                    case FAIL_HIGH:
                    System.out.println("You missed! The target is lower!");
                    break;
                    case FAIL_SHORT:
                    System.out.println("You missed! The target is farther!");
                    break;
                    case FAIL_LONG:
                    System.out.println("You missed! The target is closer!");
                    break;
                    case OUT_OF_RANGE:
                    System.out.println("The shot is way out of range. Try harder!");
                    break;
                }
            }
            System.out.print("Would you like to play again? ");
            String answer = sc.next();
            if (answer.equals("y")) {
                playing = true;
            } else {
                playing = false;
            }
        }
    }
}