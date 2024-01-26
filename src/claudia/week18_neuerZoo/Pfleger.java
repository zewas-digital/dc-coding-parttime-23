package claudia.week18_neuerZoo;

import claudia.BasicFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pfleger {
    private String name;
    private ArrayList<Gehege> ListeDerBetreutenGehege = new ArrayList<Gehege>();

    private String lieblingsArt = "";

    public Pfleger(String name, ArrayList<Pfleger> ListeDerPfleger, ArrayList<Gehege> ListeAllerGehege, boolean abfrage) {//, HashMap<Pfleger, Gehege> zustaendig){
        this.name = name;
        this.zustaendigkeiten(ListeAllerGehege, abfrage);
        ListeDerPfleger.add(this);
    }


    public void zustaendigkeiten(ArrayList<Gehege> ListeAllerGehege, boolean abfrage) {
        if (abfrage) {
            System.out.println("\nNeuer Pfleger " + this.name + " eingestellt!");
            System.out.println("Für welche Gehege ist er zuständig?  ");

            Scanner sc = new Scanner(System.in);

            for (Gehege g : ListeAllerGehege) {
                System.out.print(g.getName() + "? 1 -> JA, 0 -> NEIN: ");
                if (sc.nextInt() == 1) {
                    if (this.ListeDerBetreutenGehege != null) this.ListeDerBetreutenGehege.add(g);
                    else this.ListeDerBetreutenGehege.add(0, g);
                    //TODO: ???
                    //zustaendig.put(this, g);
                }
            }
        } else {
            int[] vector = BasicFunctions.createRandom1DArray(ListeAllerGehege.size(), 0, 3);
            //BasicFunctions.print1DArray(vector);
            int i = 0;
            for (Gehege g : ListeAllerGehege) {
                if (vector[i] != 0) this.ListeDerBetreutenGehege.add(g);
                i++;
            }
        }
    }



    public void gehegeHinzufuegen(Gehege gehege){
        this.ListeDerBetreutenGehege.add(gehege);
    }

    public void gehegeLoeschen(Gehege gehege){
        this.ListeDerBetreutenGehege.remove(gehege);
    }
    public ArrayList<Gehege> getListeDerBetreutenGehege() {
        return ListeDerBetreutenGehege;
    }

    public String getName() {
        return name;
    }
    public String getID(){
        return super.toString();
    }
    @Override
    public String toString(){
        return ("Pfleger " + this.name);
    }

    public String getLieblingsArt() {
        return lieblingsArt;
    }

    public void setLieblingsArt(String name) {
        this.lieblingsArt = name;
    }
    public void endDay(){
        System.out.println("Pfleger " + this.getName() + " beendet seinen Arbeitstag. ");
    }
    public void startDay(){
        System.out.println("\nPfleger " + this.getName() + " beginnt seinen Arbeitstag.");
    }


}
