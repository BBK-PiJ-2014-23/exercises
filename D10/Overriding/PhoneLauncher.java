public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    public void launch() {
        // your code creating and using SmartPhone here...
        SmartPhone phone = new SmartPhone();
        phone.call("666");
        phone.ringAlarm("Bell");
        phone.playGame("Dark Souls");
        phone.call("1");
        phone.call("2");
        phone.call("3");
        phone.call("4");
        phone.call("5");
        phone.call("6");
        phone.call("7");
        phone.call("8");
        phone.call("9");
        phone.call("10");
        phone.call("11");
        phone.printLastNumbers();
        phone.browseWeb("Google");
        phone.findPosition();

        phone.call("007");
        phone.printLastNumbers();
    }
}