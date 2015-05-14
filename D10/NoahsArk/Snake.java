public class Snake extends LandAnimal implements NonMammal {
    public Snake(String name) {
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
        System.out.println(getName() + " hisses...");
    }
}