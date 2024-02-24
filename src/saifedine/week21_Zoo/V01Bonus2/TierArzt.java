package saifedine.week21_Zoo.V01Bonus2;


public class TierArzt {

    Zoo zoo;

    // Attribute
    private String tierArztName;


    // Konstruktor
    public TierArzt(String tierArztName){ this.tierArztName = tierArztName;}

    // alle Methoden, wobei toString immer der erste sein soll
    @Override
    public String toString(){ return "Tierarzt: " + this.tierArztName;}

    public String getTierArztName(){ return "Tierarzt " + this.tierArztName;}


    public void zubehandelndesTier(Tiere tiere){




    }


}
