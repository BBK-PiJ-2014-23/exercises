/**
 * A phone makes calls
 */
public class OldPhone implements Phone {
    private String brand = null;
    
    public OldPhone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    /**
     * Just print on the screen: "Calling <number>...".
     */
    @Override
    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }
}