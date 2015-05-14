public class IndirectDirectUpcasting {
    public static void testPhone(Phone phone) {
        //phone.getBrand();
        phone.call("911");
    }
    
    public static void main(String[] args) {
        MobilePhone myPhone = new SmartPhone("Motorolla");
        testPhone(myPhone);
    }
}