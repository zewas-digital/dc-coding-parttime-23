package Alpi.week23_Bank;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*public class Bank {

        private List<Schalter> schalterListe;
        private List<Kunde> kundenWarteschlange;
        public Bank() {
            schalterListe = new ArrayList<>();
            kundenWarteschlange = new ArrayList<>();
        }
        public void addSchalter(Schalter schalter) {
            schalterListe.add(schalter);
        }
        public void addKunde(Kunde kunde) {
            kundenWarteschlange.add(kunde);
        }
        public Kunde naechsterKunde() {
            return kundenWarteschlange.remove(0);
        }
}

