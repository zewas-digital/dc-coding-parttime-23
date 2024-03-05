package Alpi.week18_PfelgeraufgabeNeu.week18_Zoo;

public class Tiere {

    public String Name;
    public String Gattung;
    public Futter futter;


    public Tiere(String Name, String Gattung, Futter futter) {

        this.Name = Name;
        this.Gattung = Gattung;
        this.futter = futter;

        //System.out.println("Name: " + this.Name + "Gattung: " + this.Gattung);


    }

    // setter changeFoodAmount
    public String toString () {return this.Name + " , " + this.Gattung;}
}



