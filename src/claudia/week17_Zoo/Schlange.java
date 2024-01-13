package claudia.week17_Zoo;

public class Schlange extends Tier {

        public Schlange(String name, double mengeInKilo){
            super("Boa Constrictor", name, 1, "Mäuse", mengeInKilo);
        }

    @Override
        public void feed() {
        System.out.println("Ich bin eine " + super.getArt() + " und heiße " + this.getName() + ".");
        super.feed();
    }
    }

