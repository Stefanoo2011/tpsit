import java.time.LocalDate;
void main() {

        Campionato campionato = new Campionato();

        Squadra s1 = new Squadra(1, "Falchi");
        Squadra s2 = new Squadra(2, "Leoni");

        s1.aggiungiGiocatore(new Giocatore("Mario", "Rossi", "M"));
        s1.aggiungiGiocatore(new Giocatore("Luca", "Bianchi", "M"));

        s2.aggiungiGiocatore(new Giocatore("Anna", "Verdi", "F"));
        s2.aggiungiGiocatore(new Giocatore("Sara", "Neri", "F"));

        campionato.aggiungiSquadra(s1);
        campionato.aggiungiSquadra(s2);

        Partita p = new Partita(s1, s2, 3, 1);

        campionato.aggiungiPartita(p);

        System.out.println(p);
    }
