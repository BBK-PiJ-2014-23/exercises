public abstract class FlyingAnimal extends Animal {
    public FlyingAnimal(String name) {
        super(name);
    }
    
    @Override   
    public void call() {
        System.out.println(getName() + " now flying, will come later when tired...");
    }
}

