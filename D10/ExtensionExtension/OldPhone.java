/**
 * A phone makes calls
 */
public class OldPhone implements Phone {
    /**
     * Just print on the screen: "Calling <number>...".
     */
    @Override
    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }
}