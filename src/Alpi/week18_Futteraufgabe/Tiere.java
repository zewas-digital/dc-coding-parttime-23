package Alpi.week18_Futteraufgabe;

public class Tiere {

    public String Name;
    public String Gattung;
    public Futterlager.futterarten futter;
    public float menge;


    public Tiere(String Name, String Gattung, Futterlager.futterarten futter, float menge) {

        this.Name = Name;
        this.Gattung = Gattung;
        this.futter = futter;
        this.menge = menge;

        //System.out.println("Name: " + this.Name + "Gattung: " + this.Gattung);


    }

    // setter changeFoodAmount
    public String toString () {return this.Name + " , " + this.Gattung;}
}



