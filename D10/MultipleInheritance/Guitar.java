public class Guitar extends WoodenObject implements MusicalInstrument {

    public Guitar() {
        name = "guitar";
    }

    public void play() {
        System.out.println("ROCKING OUT");
    }

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();
        guitar.burn();
    }
}