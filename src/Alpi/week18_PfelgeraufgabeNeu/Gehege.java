package Alpi.week18_PfelgeraufgabeNeu;



import java.util.ArrayList;

public class Gehege {

    private String gehegeBezeichnung;

    private ArrayList<Tiere> tiereImGehege;

    public String name;
    private Boolean bearbeitet;


    public Gehege(String bezeichung, String name) {

        this.gehegeBezeichnung = bezeichung;
        this.tiereImGehege = new ArrayList<>();
        this.name = name;
        this.bearbeitet = false;

    }

    public boolean istbearbeitet(){
        return  bearbeitet;
    }

    public void setBearbeitet(boolean bearbeitet){
        this.bearbeitet = bearbeitet;
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

    public void addTiere(Tiere tier) {
        this.tiereImGehege.add(tier);
    }

    public void removeTiere(Tiere tier) {
        this.tiereImGehege.remove(tier);
    }


    @Override
    public String toString() {
        return "" + this.gehegeBezeichnung + this.tiereImGehege;
    }

    public String getName() {
        return getName();
    }

}



