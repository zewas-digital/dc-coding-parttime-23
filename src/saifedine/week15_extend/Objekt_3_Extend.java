package saifedine.week15_extend;

public class Objekt_3_Extend {
    public static void main(String[] args) {
        // für ein Klassenattribut ist keine Instanz nötig
        System.out.println("Das Auto hat "+ Auto.wheels +" Räder.");

        // Objekt / Instanz meinAuto
        Auto meinAuto = new Auto("Mein Auto");
        meinAuto.marke = "Ford";
        // Objekt / Instanz meinRad
        Einrad meinRad = new Einrad("Mein 1Rad");

        // auf ein Instanzattribut kann nur über die mit new erstelle Instanz zugegriffen werden
        System.out.println("Das Auto hat die Marke "+ meinAuto.marke +".");

        System.out.println(meinAuto.getName() +" hat "+ meinAuto.wheels +" Räder.");
        System.out.println(meinAuto.getName() +" hat einen Literverbrauch von "+ Auto.calcLiterPerKilometer(meinAuto.mileage) +" pro Kilometer.");
        System.out.println(meinAuto);

        System.out.println(meinRad.getName() +" hat "+ meinRad.wheels +" Rad.");

        // Anonyme Implementierung der abstrakten Klasse Fahrzeug
        Fahrzeug A = new Fahrzeug("A") {
            @Override
            public void drive(int kilometer) {
                System.out.println("A drives anonymous.");
            }
        };
        A.drive(100);
    }
}
