public abstract class LandAnimal extends Animal {
    public LandAnimal(String name) {
        super(name);
    }
    
    @Override   
    public void call() {
        System.out.println(getName() + " coming...");
    }
}

