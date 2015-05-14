public class RestrictedSmartPhone extends SmartPhone {
    
    public RestrictedSmartPhone(String brand) {
        super(brand);
    }
    
    @Override
    public void playGame(String game) {
        System.out.println("He! You are not going to play " + game + "!");
    }
}