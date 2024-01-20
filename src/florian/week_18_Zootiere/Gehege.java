package florian.week_18_Zootiere;



import java.util.ArrayList;

public class Gehege {

    public String bezeichnung;

    public ArrayList<Tiere> tiereImGehege;


    public Gehege(String bezeichung) {

        this.bezeichnung = bezeichung;
        this.tiereImGehege  = new ArrayList<>();

       // System.out.println("Gehege: " + this.bezeichnung);


    }
    public void addTiere (Tiere tier ){
        this.tiereImGehege.add(tier);
    }

    public void removeTiere (Tiere tier){
        this.tiereImGehege.remove(tier);
    }

}


