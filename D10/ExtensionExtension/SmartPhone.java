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
}