public abstract class Persona {

    private String nome;
    private String cognome;
    private String dataDiNascita; // ora è String

    public Persona(String nome, String cognome, String dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " (" + dataDiNascita + ")";
    }
}