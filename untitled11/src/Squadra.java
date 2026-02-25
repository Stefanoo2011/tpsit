import java.util.ArrayList;

public class Squadra {

    private int id;
    private String nome;
    private ArrayList<Giocatore> giocatori = new ArrayList<>();

    public Squadra(int id, String nome) {
        setId(id);
        setNome(nome);
    }

    public void aggiungiGiocatore(Giocatore g) {
        giocatori.add(g);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Giocatore> getGiocatori() {
        return giocatori;
    }

    @Override
    public String toString() {
        return "Squadra " + nome + " (ID: " + id + ")";
    }
}