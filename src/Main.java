public class Main {
    public static void main(String[] args) {

        Scatola scatola = new Scatola();

        new Producer(scatola).start();
        new Consumer(scatola).start();
    }
}
