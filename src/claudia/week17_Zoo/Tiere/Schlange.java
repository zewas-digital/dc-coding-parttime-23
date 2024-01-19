package claudia.week17_Zoo.Tiere;

import claudia.week17_Zoo.Futter;

import java.util.ArrayList;

public class Schlange extends Landtiere {

        public Schlange(String name, Futter futter, double mengeInKilo, ArrayList<Tiere> liste){
            super("Schlange", name, 1, futter, mengeInKilo, liste);
        }
    public double preisinEinheit = this.getFutter().getPreisProEinheit();
    @Override
        public void feed() {
        System.out.println("Ich bin eine " + super.getArt() + " und heiße " + this.getName() + ".");
        super.feed();
    }
    }

