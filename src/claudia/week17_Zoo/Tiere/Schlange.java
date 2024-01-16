package claudia.week17_Zoo.Tiere;

import java.util.ArrayList;

public class Schlange extends Landtiere {

        public Schlange(String name, double mengeInKilo, ArrayList<Tiere> liste){
            super("Boa Constrictor", name, 1, "Mäuse", mengeInKilo, liste);
        }

    @Override
        public void feed() {
        System.out.println("Ich bin eine " + super.getArt() + " und heiße " + this.getName() + ".");
        super.feed();
    }
    }

