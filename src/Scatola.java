import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Scatola {

    Semaphore semaforoProduttore;
    Semaphore semaforoConsumatore;
    Queue<Integer> queue;

    public Scatola() {
        semaforoProduttore = new Semaphore(5);
        semaforoConsumatore = new Semaphore(0);
        queue = new LinkedList<>();
    }

    public synchronized void put(int valore) {
        queue.add(valore);
    }

    public synchronized int get() {
        return queue.remove();
    }
}
