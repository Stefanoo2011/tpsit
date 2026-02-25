import java.util.ArrayList;

public class Campionato {

    private ArrayList<Squadra> squadre = new ArrayList<>();;
    private ArrayList<Partita> partite = new ArrayList<>();;

    public void aggiungiSquadra(Squadra s) {
        squadre.add(s);
    }

    public void aggiungiPartita(Partita p) {
        partite.add(p);
    }

    public ArrayList<Squadra> getSquadre() {
        return squadre;
    }

    public ArrayList<Partita> getPartite() {
        return partite;
    }
}