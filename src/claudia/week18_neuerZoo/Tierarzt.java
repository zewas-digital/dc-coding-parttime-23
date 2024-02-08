package claudia.week18_neuerZoo;

import java.util.Random;

public class Tierarzt {
    private String name;
    public Tierarzt(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String toString(){
        return ("Tierarzt " + this.name);
    }

    public void heal(Tier tier){
        Random random = new Random();
        //Zufallszahl im Intervall [0.3, 1.0) - Achtung, 1.0 nicht enhalten, wird durch's Runden ausgeglichen!
        double healingPower = 0.3 + (1.0 - 0.3) * random.nextDouble();
        int healthBefore = tier.getHealthActual();
        int healthMax = tier.getHealthMax();
        int delta = healthMax - healthBefore;
        int healthAfter = (Math.min ( (int) Math.ceil(healthBefore + delta * healingPower), healthMax));
        System.out.println("\n" + this + " heilt " + tier.getName() + "; Gesundheit alt: " + healthBefore + ", neu: " + healthAfter );
        //System.out.println("Delta: " + delta + " Power: " + healingPower);
        tier.setHealthActual(healthAfter);


    }



}
