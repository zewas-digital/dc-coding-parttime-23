package Alpi.week23_Bank;

/*public class Schalter {
    private int id;
    private int geldvorrat;
    private boolean istFrei;
    private List<Kunde> kundenListe;
    private int gesamtbetrag;

    public Schalter(int id, int geldvorrat) {
        this.id = id;
        this.geldvorrat = geldvorrat;
        this.istFrei = true;
        kundenListe = new ArrayList<>();
        gesamtbetrag = 0;
    }

    public void bearbeiten(Kunde kunde) {
        kundenListe.add(kunde);
        if (kunde.getArt() == Einzahlung.EINZAHLUNG) {
            geldvorrat += kunde.getBetrag();
        } else {
            geldvorrat -= kunde.getBetrag();
        }
        gesamtbetrag += kunde.getBetrag();
        istFrei = false;
        // Simuliere die Bearbeitungszeit
        try {
            Thread.sleep(1000);
        } catch {

        }
        }

    }

