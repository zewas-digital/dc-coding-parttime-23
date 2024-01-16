package michael_k.week15;

public class Fotoapparat2 extends Object {

    Objektiv objektiv;
    Speicherkarte speicherkarte;
    public int megapixel;
    public int iso = 0;
    public String marke;
    public String model;


    public Fotoapparat2(String marke, String model, int megapixel){

        this.marke = marke;
        this.model = model;
        this.megapixel = megapixel;

    }

    public void objektivAufsetzen(Objektiv objektiv){
        this.objektiv = objektiv;
    }

    public void objektivEntfernen(){
        this.objektiv = null;
    }
    public void speicherkarteeinsetzen(Speicherkarte speicherkarte){
        this.speicherkarte = speicherkarte;
    }

    public void speicherkarteentfernen(){
        this.speicherkarte = null;
    }
    public void takePhoto(){
        if(speicherkarte != null && objektiv != null) {
            System.out.println ( "________________________________________" );
            System.out.println ( "_____#______#____#______#____#__________" );
            System.out.println ( "_____#______#___________#____#__________" );
            System.out.println ( "_____#______#____#______#____#__________" );
            System.out.println ( "_____########____#______#____#__________" );
            System.out.println ( "_____#______#____#______#____#__________" );
            System.out.println ( "_____#______#____#______________________" );
            System.out.println ( "_____#______#____#______#____#__________" );
            System.out.println ( "________________________________________" );

            speicherkarte.speicherBelegt = speicherkarte.speicherBelegt +5;
            speicherkarte.speicherFrei = speicherkarte.speicherFrei -5;

        }else{
            if(speicherkarte == null){ System.out.println ("Speicherkarte einlegen" );}
            if(objektiv == null){ System.out.println ("Objektiv aufsetzen" );}
        }
    }
    public String toString(){
        return "Akteelle Kamaradaten\n" +
        "Marke: " + marke +"\n" +
        "Model: " + model +"\n" +
        "Brennweite: " + objektiv.brennweite +"\n" +
        "Megapixel: " + megapixel +"\n" +
        "Blende: " + objektiv.blende +"\n" +
        "Iso-Wert: " + iso +"\n" +
        "Speicherplatz frei: " + speicherkarte.speicherFrei +"MB";
    }
    public int getBrennweite(){
        return objektiv.brennweite;
    }
    public void setBrennweite(int brennweite){
        this.objektiv.brennweite = brennweite;
    }
    public int getMegapixel(){
        return megapixel;
    }
    public int getIso(){
        return iso;
    }
    public void setIso(int iso){
        this.iso = iso;
    }
    public float getBlende(){
        return objektiv.blende;
    }
    public void setBlende(float blende){
        this.objektiv.blende = blende;
    }
    public String getMarke(){
        return marke;
    }
    public String getModel(){
        return model;
    }
}
