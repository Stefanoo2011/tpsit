import java.util.Random;

public class Producer extends Thread {

    private Scatola scatola;
    private Random random;

    public Producer(Scatola scatola) {
        this.scatola = scatola;
        this.random = new Random();
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            try {
                scatola.semaforoProduttore.acquire();

                scatola.put(random.nextInt(100));

                scatola.semaforoConsumatore.release();

                sleep(1000);
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
