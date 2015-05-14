public class MobilePhone extends OldPhone {
    public String[] lastNumbers;

    public MobilePhone() {
        lastNumbers = new String[10];
    }

    public void ringAlarm(String alarm) {
        System.out.println("Ringing alarm " + alarm + "...");
    }

    public void playGame(String game) {
        System.out.println("Playing game " + game + "...");
    }

    public void printLastNumbers() {
        System.out.println("Last numbers dialed:");
        for (int i = 0; i < lastNumbers.length; i++) {
            System.out.print(lastNumbers[i] + ", ");
        }
        System.out.println();
    }
    
    @Override
    public void call(String number) {
        super.call(number);
        for (int i = lastNumbers.length - 1; i > 0; i--) {
                lastNumbers[i] = lastNumbers[i - 1];
        }
        lastNumbers[0] = number;
    }
}
