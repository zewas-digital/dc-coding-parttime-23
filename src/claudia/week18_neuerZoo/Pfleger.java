package claudia.week18_neuerZoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pfleger{
    private String name;
    private ArrayList<Gehege> ListeDerBetreutenGehege = new ArrayList<Gehege>();
    //2-D Array mit ArrayLists Zuordnung Gehege <-> Pfleger, 1:1-Beziehung

    public ArrayList<Gehege> getListeDerBetreutenGehege() {
        return ListeDerBetreutenGehege;
    }


    public Pfleger(String name, ArrayList<Gehege> ListeAllerGehege, HashMap<Pfleger, Gehege> zustaendig){
        this.name = name;
        System.out.println("\nNeuer Pfleger " + this.name + " eingestellt!");
        Scanner sc = new Scanner(System.in);
        //int[] indizes = new int[ListeAllerGehege.size()];
        //int i = 0;
        System.out.println("Für welche Gehege ist er zuständig?  ");
        for (Gehege g: ListeAllerGehege) {
            System.out.print(g.getName() + "? 1 -> JA, 0 -> NEIN: ");
            if (sc.nextInt() == 1) {
                if(ListeDerBetreutenGehege != null) ListeDerBetreutenGehege.add(g);
                else ListeDerBetreutenGehege.add(0, g);
                zustaendig.put(this, g);
            }
            //indizes[i] = sc.nextInt();
            //i++;
        }



    }

}
