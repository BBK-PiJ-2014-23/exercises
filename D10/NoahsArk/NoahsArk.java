public class NoahsArk {
    public static void main(String[] args) {
        Animal bear = new Bear("Barbara the bear");
        bear.call();
        bear.reproduce();
        bear.makeSound();
        Animal snake = new Snake("Sirius the snake");
        snake.call();
        snake.reproduce();
        snake.makeSound();
        Animal dolphin = new Dolphin("Doddo the dolphin");
        dolphin.call();
        dolphin.reproduce();
        dolphin.makeSound();
        Animal salmon = new Salmon("Sarah the salmon");
        salmon.call();
        salmon.reproduce();
        salmon.makeSound();
        Animal eagle = new Eagle("Erving the eagle");
        eagle.call();
        eagle.reproduce();
        eagle.makeSound();
    }
}