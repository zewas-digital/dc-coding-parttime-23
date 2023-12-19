package saifedine.week15_objects.oliver;

/*
Aufgabe: Auto

1/ Erstelle eine Klasse welche die typischen Werte eines Autos speichern kann.

Marke
Modell
Baujahr
km-Stand

2/ Erstelle eine Instanz dieser Klasse (Objekt) in dieser Klasse Objekt_1_Auto

3/ Erstelle weiters eine toString() Methode und erstelle einen schönen String mit den gegebenen Werten das Auto.

4/ Gib das Auto in Objekt_1_Auto über die toString() Methode aus.
 */

public class Objekt_1_Auto {
    public static void main(String[] args) {
        Auto FordBronco = new Auto("Ford", "Bronco", 2023, 10000, 70);

        FordBronco.tankinhalt = 50;
        while (FordBronco.tankinhalt < FordBronco.getTankvolumen()) {
            FordBronco.tankinhalt++;
        }
        // umbau 80 Liter
        FordBronco = new Auto("Ford", "Bronco", 2023, 10000, 80);

        System.out.println("tankinhalt: "+ FordBronco.getFormatierterTankinhalt());
        FordBronco.tankinhalt += 10;
        System.out.println("tankinhalt: "+ FordBronco.getFormatierterTankinhalt());
        System.out.println(FordBronco.toString());
        System.out.println(FordBronco.kilometerstandFormatiert);


        Auto FiatPanda = new Auto("Fiat", "Panda", 2023, 5000, 30);
        System.out.println(FiatPanda.kilometerstandFormatiert);
        FiatPanda.setKilometerstand(FiatPanda.getKilometerstand() +1); // --> 5001
        //FiatPanda.kilometerstand++;
        int kilometer = FiatPanda.getKilometerstand(); // <-- 5001
        kilometer++;
        FiatPanda.setKilometerstand(kilometer); // --> 5002
        System.out.println("km Stand FP: (int)"+ FiatPanda.getKilometerstand() +" formatiert: "+ FiatPanda.kilometerstandFormatiert);
    }
}

















