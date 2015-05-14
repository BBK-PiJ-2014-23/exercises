public abstract class AquaticAnimal extends Animal {
    public AquaticAnimal(String name) {
        super(name);
    }
    
    @Override   
    public void call() {
        System.out.println(getName() + " will not come...");
    }
}

