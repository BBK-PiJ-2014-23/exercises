public class Salmon extends AquaticAnimal implements NonMammal {
    public Salmon(String name) {
        super(name);
    }
    
    @Override
    public void reproduce(){ 
        layEggs();
    }
    
    @Override
    public void layEggs(){
        System.out.println(getName() + " lays eggs...");
    }
    
    @Override
    public void makeSound(){
        System.out.println(getName() + " shuts up...");
    }
}