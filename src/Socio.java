import java.util.Date;

class Socio {
    private String numeroTessera;
    private String nome;
    private String cognome;
    private Date dtIscrizione; // Nome esatto dal diagramma

    public Socio(String numeroTessera, String nome, String cognome, Date dtIscrizione) {
        this.numeroTessera = numeroTessera;
        this.nome = nome;
        this.cognome = cognome;
        this.dtIscrizione = dtIscrizione;
    }
}