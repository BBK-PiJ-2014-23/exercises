public class Patient {
    private String name;
    private int age;
    private String illness;
    
    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getIllness() {
        return illness;
    }
}