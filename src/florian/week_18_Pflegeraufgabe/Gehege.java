package florian.week_18_Pflegeraufgabe;



import java.util.ArrayList;

public class Gehege {

    private String gehegeBezeichnung;

    private ArrayList<Tiere> tiereImGehege;


    public Gehege(String bezeichung) {

        this.gehegeBezeichnung = bezeichung;
        this.tiereImGehege  = new ArrayList<>();

    }

    public String getBezeichnung() {
        return gehegeBezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.gehegeBezeichnung = bezeichnung;
    }

    public ArrayList<Tiere> getTiereImGehege() {
        return tiereImGehege;
    }

    public void setTiereImGehege(ArrayList<Tiere> tiereImGehege) {
        this.tiereImGehege = tiereImGehege;
    }
    public void addTiere (Tiere tier ){
        this.tiereImGehege.add(tier);
    }

    public void removeTiere (Tiere tier){
        this.tiereImGehege.remove(tier);
    }


    @Override
    public String toString() {
        return "" + this.gehegeBezeichnung + this.tiereImGehege;
    }
}


