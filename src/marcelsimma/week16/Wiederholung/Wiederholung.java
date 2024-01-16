package marcelsimma.week16.Wiederholung;

import java.util.ArrayList;

public class Wiederholung {


    public static void main(String args[]) {

        Engine v8 = new Engine(400);

        Auto VWPolo = new Auto("red", "VW", "Polo", "BDE492378459", new Engine(400));


        ArrayList<Move> objekte = new ArrayList<>();

        Flugzeug Boeing737Max = new Flugzeug(objekte);



        objekte.add(VWPolo);
        //objekte.add(Boeing737Max);

        for (int i = 0; i < 10; i++) {
            new Flugzeug(objekte);
        }

        // objekte.forEach(o -> o.move());

        for (Move o : objekte) {
            o.move();
        }




        // aus einer abstrakten Klasse kann kein Objekt erzeugt werden
        //Fahrzeug Prototyp = new Fahrzeug("red", "RETE4543");





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
