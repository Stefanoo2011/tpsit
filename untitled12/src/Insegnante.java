import java.util.HashSet;
import java.util.Set;

public class Insegnante extends Persona {

    private Set<Materia> materie = new HashSet<>();

    public Insegnante(String nome, String cognome, String dataDiNascita) {
        super(nome, cognome, dataDiNascita);
    }

    public void aggiungiMateria(Materia materia) {
        materie.add(materia);
    }

    public Set<Materia> getMaterie() {
        return materie;
    }
}