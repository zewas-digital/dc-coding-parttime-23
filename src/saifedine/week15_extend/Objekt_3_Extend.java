package saifedine.week15_extend;

public class Objekt_3_Extend {
    public static void main(String[] args) {

        // für ein Klassenattribut ist keine Instanz nötig
        System.out.println("\nDas Auto hat "+ Auto.wheels +" Räder." + "\n");                                                                                           // Das Auto hat 4 Räder.

        // Objekt / Instanz meinAuto
        Auto meinAuto = new Auto("Mein Auto");

        // auf ein Instanzattribut kann nur über die mit new erstelle Instanz zugegriffen werden
        meinAuto.marke = "Ford";
        System.out.println("Das Auto hat die Marke "+ meinAuto.marke +"."+ "\n");                                                                                       // Das Auto hat die Marke Ford.

        System.out.println(meinAuto.getName() +" hat "+ meinAuto.wheels +" Räder."+ "\n");                                                                              // Mein Auto hat 4 Räder.
        System.out.println(meinAuto.getName() +" hat einen Literverbrauch von "+ Auto.calcLiterPerKilometer(meinAuto.mileage) +" pro Kilometer."+ "\n");                // Mein Auto hat einen Literverbrauch von 0.1 pro Kilometer.
        System.out.println(meinAuto+ "\n");                                                                                                                             // Mein Auto der Marke Ford verbraucht 10.0 Liter pro 100 km.

        // Objekt / Instanz meinRad
        Einrad meinRad = new Einrad("Mein 1Rad");

        System.out.println(meinRad.getName() +" hat "+ meinRad.wheels +" Rad."+ "\n");                                                                                  // Mein 1Rad hat 1 Rad.

        // Anonyme Implementierung der abstrakten Klasse Fahrzeug
        Fahrzeug A = new Fahrzeug("A") {
            @Override
            public void drive(int kilometer) {
                System.out.println("A drives anonymous."+ "\n");
            }
        };

        A.drive(100);                                                                                                                                           // A drives anonymous.

        System.out.println("Fahrzeugname ist: " + A.getName());                                                                                                         // Fahrzeugname ist: A
    }
}
