public class Downcasting {
     public static void testPhone(Phone phone) {
         //phone.getBrand();
         phone.call("911");
    }
    
    public static void main(String[] args) {
        MobilePhone myPhone = new SmartPhone("Motorolla");
        myPhone.playGame("Mario");
        ((SmartPhone)myPhone).browseWeb("Mozilla");
        ((SmartPhone)myPhone).findPosition();
        myPhone.call("911");
    }
}