class Libro {
    private String ISBN;
    private String titolo;
    private String autore; // Nel diagramma è String
    private String editore;

    public Libro(String ISBN, String titolo, String autore, String editore) {
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.autore = autore;
        this.editore = editore;
    }
}