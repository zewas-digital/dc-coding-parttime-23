package michael_k.week15;

public class Speicherkarte extends Object{

    public int speichergroesse;
    public int speicherBelegt=0;
    public int speicherFrei;

    public Speicherkarte(int groesse){

        this.speichergroesse = groesse;
        this.speicherFrei = groesse;
    }

}
