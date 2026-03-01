import java.util.HashSet;
import java.util.Set;

public class Studente extends Persona {

    private Set<Voto> voti = new HashSet<>();

    public Studente(String nome, String cognome, String dataDiNascita) {
        super(nome, cognome, dataDiNascita);
    }

    public void aggiungiVoto(Voto voto) {
        voti.add(voto);
    }

    public Set<Voto> getVoti() {
        return voti;
    }
}