public class Consumer extends Thread {

    private Scatola scatola;

    public Consumer(Scatola scatola) {
        this.scatola = scatola;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            try {
                scatola.semaforoConsumatore.acquire();

                System.out.println(scatola.get());

                scatola.semaforoProduttore.release();
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
