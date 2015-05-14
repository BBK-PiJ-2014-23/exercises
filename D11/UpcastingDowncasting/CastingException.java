public class CastingException {
     public static void testPhone(Phone phone) {
         //phone.getBran();
         phone.call("911");
    }
    
    public static void main(String[] args) {
        MobilePhone myPhone = new SmartPhone("Motorolla");
        testPhone(myPhone);
        myPhone.playGame("Mario");
        ((SmartPhone)myPhone).browseWeb("Mozilla");
        ((SmartPhone)myPhone).findPosition();
        myPhone.call("911");
    }
}