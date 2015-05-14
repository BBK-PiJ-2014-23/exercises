public class DirectUpcasting {
    public static void main(String[] args) {
        MobilePhone myPhone = new SmartPhone("Motorolla");
        myPhone.playGame("Mario");
        //myPhone.browseWeb("Mozilla");
        //myPhone.findPosition();
        myPhone.call("911");
    }
}