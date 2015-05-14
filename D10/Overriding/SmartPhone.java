public class SmartPhone extends MobilePhone {
    private String position;

    public SmartPhone() {
        position = "X10Y20";
    }

    public void browseWeb(String web) {
        System.out.println("Browsing website " + web + "...");
    }

    public void findPosition() {
        System.out.println(position);
    }

    @Override
    public void call(String number) {
        if (number.length() > 1 && number.substring(0, 2).equals("00")) {
            System.out.println("Calling " + number + " through the internet to save money");
            addLastNumber(number);
        } else {
            super.call(number);
        }
    }
}