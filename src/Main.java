import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Creazione oggetti base
        Autore autoreEsempio = new Autore("Umberto", "Eco", "Italiana");

        // Nota: Libro vuole l'autore come String nel costruttore secondo il diagramma
        Libro libroEsempio = new Libro("88452", "Il nome della rosa", "U. Eco", "Bompiani");

        CopiaFisica copiaEsempio = new CopiaFisica("INV001", "Nuovo");

        Socio socioEsempio = new Socio("T-123", "Mario", "Rossi", new Date());

        // 2. Preparazione per i metodi della Biblioteca
        Biblioteca miaBiblioteca = new Biblioteca("Milano", "Sormani");

        // Creazione della lista di prestiti richiesta dal metodo piuPrestato
        ArrayList<Prestito> listaPrestiti = new ArrayList<Prestito>();
        listaPrestiti.add(new Prestito(new Date(), new Date()));

        // 3. Chiamata ai metodi (Test compatibilità firme)
        int n = miaBiblioteca.numeroLibri(autoreEsempio);
        ArrayList<Libro> lista = miaBiblioteca.listaLibri(libroEsempio);
        Libro top = miaBiblioteca.piuPrestato(listaPrestiti);

        System.out.println("Main eseguito con successo!");
    }
}