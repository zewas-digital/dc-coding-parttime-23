package saifedine.week16_weekend3_objects.week16.Wiederholung;

public class Wiederholung {


    public static void main(String args[]) {

        Engine v8 = new Engine(400);



        Auto VWPolo = new Auto("red", "VW", "Polo", "BDE492378459", v8);

        // aus einer abstrakten Klasse kann kein Objekt erzeugt werden
        //Fahrzeug Prototyp = new Fahrzeug("red", "RETE4543");

        System.out.println(VWPolo.getColor());
        System.out.println(v8.getLeistung());

        System.out.println(VWPolo.getEngine());





        // pickerl ohne static
        //VWPolo.pickerl; geht
        //Auto.pickerl: geht nicht

        //pickerl mit static
        //VWPolo.pickerl; geht nicht
        //Auto.pickerl;
/*
        Auto.setAbgasnorm("Euro7");
        System.out.println(Auto.getAbgasnorm());

        System.out.println(Auto.WHEELS);


        System.out.println(Prototyp.getColor());

 */
    }
}
