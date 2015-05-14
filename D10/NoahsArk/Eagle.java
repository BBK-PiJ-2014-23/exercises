public class Eagle extends FlyingAnimal implements NonMammal {
    public Eagle(String name) {
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
        System.out.println(getName() + " screams...");
    }
}