public class Bear extends LandAnimal implements Mammal {
    public Bear(String name) {
        super(name);
    }
    
    @Override
    public void reproduce(){ 
        giveBirth();
    }
    
    @Override
    public void giveBirth(){
        System.out.println(getName() + " gives birth...");
    }
    
    @Override
    public void makeSound(){
        System.out.println(getName() + " growls...");
    }
}