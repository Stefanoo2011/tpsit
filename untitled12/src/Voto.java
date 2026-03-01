public class Voto {

    private String data;   // ora è String
    private Materia materia;
    private double valore;

    public Voto(String data, Materia materia, double valore) {
        this.data = data;
        this.materia = materia;
        this.valore = valore;
    }

    public String getData() {
        return data;
    }

    public Materia getMateria() {
        return materia;
    }

    public double getValore() {
        return valore;
    }

    @Override
    public String toString() {
        return "Voto: " + valore + " in " + materia.getNome() + " del " + data;
    }
}