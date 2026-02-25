

public class Partita {

    private Squadra casa;
    private Squadra ospite;
    private int setCasa;
    private int setOspite;

    public Partita(Squadra casa, Squadra ospite, int setCasa, int setOspite) {
        this.casa = casa;
        this.ospite = ospite;
        this.setCasa = setCasa;
        this.setOspite = setOspite;
    }

    @Override
    public String toString() {
        return  " - " + casa.getNome() + " "
                + setCasa + " : "
                + setOspite + " " + ospite.getNome();
    }
}