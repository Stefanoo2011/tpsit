 public class Giocatore {

        private String nome;
        private String cognome;
        private String sesso;

     public Giocatore(String nome, String cognome, String sesso) {
            setNome(nome);
            setCognome(cognome);
            setSesso(sesso);
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCognome(String cognome) {
            this.cognome=cognome;
        }

        public void setSesso(String sesso) {
            this.sesso=sesso;
        }



        public String getNome() {
            return nome;
        }

        public String getCognome() {
            return cognome;
        }

        public String getSesso() {
            return sesso;
        }

        @Override
        public String toString() {
            return nome + " " + cognome + " (" + sesso + ")";
        }
    }

