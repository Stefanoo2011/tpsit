import java.util.ArrayList;

class Biblioteca {
    private String citta;
    private String nome;

    public Biblioteca(String citta, String nome) {
        this.citta = citta;
        this.nome = nome;
    }

    // Metodi con le firme esatte del diagramma
    public int numeroLibri(Autore autore) { return 0; }
    public ArrayList<Libro> listaLibri(Libro libro) { return new ArrayList<Libro>(); }
    public Libro piuPrestato(ArrayList<Prestito> prestito) { return null; }
}