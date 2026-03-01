void main(String[] args) {

        Materia matematica = new Materia("Matematica", "MAT");

        Studente studente = new Studente("Luca", "Rossi", "10/03/2005");
        Insegnante insegnante = new Insegnante("Maria", "Bianchi", "21/07/1980");

        insegnante.aggiungiMateria(matematica);

        Voto voto1 = new Voto("01/03/2026", matematica, 8.5);
        studente.aggiungiVoto(voto1);

        System.out.println(studente);
        studente.getVoti().forEach(System.out::println);

        System.out.println(insegnante);
        insegnante.getMaterie().forEach(System.out::println);
    }
