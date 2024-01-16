package claudia.week17_Zoo;

import claudia.week17_Zoo.Tiere.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Zoobesuch {


    public static void main(String[] args) {
        Zoo meinZoo = new Zoo("Premiumzoo Dornbirn", 2024);
        erstelleZoo(meinZoo);

        System.out.println("\nDer Zoo " + meinZoo.getName() + " öffnet!");

        Timer meinTimer = new Timer();
        //Timer meinTimer2 = new Timer();
        meinTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\n\nDer Zoo schließt jetzt, auf Wiedersehen!");
                meinTimer.cancel();
                System.exit(0); //beendet die main-Methode
            }
        }, 30000); //30 Sekunden
/*
        meinTimer2.schedule(new TimerTask() {
            @Override
            public void run() {
                meinZoo.alleFuettern();
                meinTimer2.cancel();
            }
        }, 8000);
*/

        System.out.println();
        String auswahl = "0";
        //String gehege = "x";
        Scanner sc = new Scanner(System.in);

        while (!auswahl.equals("N")){
            System.out.print("\n(P)lan, (G)ehege, (F)üttern, (N)achHause? ");
            auswahl = sc.next();

            switch (auswahl){
                case "P": meinZoo.printStructure(meinZoo.getListeDerGehege());
                    break;
                case "G":
                    System.out.println("Welches Gehege anschauen?  ");
                    int index = menu(meinZoo.getListeDerGehege());
                    //System.out.println(index - 1);
                    System.out.println(meinZoo.getListeDerGehege().get(index - 1));
                    System.out.println("Folgende Tiere befinden sich hier: ");
                    System.out.println(meinZoo.getListeDerGehege().get(index - 1).getListeDerTiere());
                    break;
                case "F" :
                    //TODO Auf einzelne Tiere zugreifen!
                    //System.out.println("Welches Tier füttern? ");
                    //int index2 = 1;
                    //for (Gehege g : meinZoo.getListeDerGehege()) {
                        //System.out.println("\n...");
                        //for (Tiere t : g.getListeDerTiere())  {
                            //System.out.print("(" + index2 + "): " + t.getName() + "\n");
                            //index2++;
                       // }
                    //}
                    meinZoo.alleFuettern();

                    break;
                case "N":
                    System.out.println("\nGuten Heimweg und auf Wiedersehen! ");
                    System.exit(0);
                    //break;
                default:
                    System.out.println("Treffen Sie eine Auswahl! ");

            }

        }

    }


public static int menu(ArrayList<Gehege> list){
        Scanner sc = new Scanner(System.in);
        int index = 1;
        for (Gehege eintrag : list){
            System.out.print("(" + index + "): " + eintrag.getName() + "\n");
            index++;
        }
        return sc.nextInt();
}

    public static void erstelleZoo(Zoo meinZoo) {

        Gehege Alpenwiese = new Gehege(10234, "Alpenwiese", meinZoo.getListeDerGehege());
        Gehege Ried = new Gehege(373, "Ried", meinZoo.getListeDerGehege());
        Gehege TerrariumWarm = new Gehege(80, "Terrarium (warm)", meinZoo.getListeDerGehege());

        Landtiere Storch1 = new Storch("Adebar1", 1, Ried.getListeDerTiere());

        Landtiere Storch2 = new Storch("Adebar2", 0.5, Ried.getListeDerTiere());

        Landtiere Murmel1 = new Murmeltier("Murmel1", 0.78, Alpenwiese.getListeDerTiere());

        Landtiere Boa1 = new Schlange("Boa1", 2.2, TerrariumWarm.getListeDerTiere());
        Landtiere Boa2 = new Schlange("Boa2", 5.1, TerrariumWarm.getListeDerTiere());
        Landtiere Boa3 = new Schlange("Boa3", 0.1, TerrariumWarm.getListeDerTiere());

        Gehege Aquarium = new Gehege(2000000, "Aquarium", meinZoo.getListeDerGehege());
        Wassertiere Wal1 = new Wal("Wal1", 235465, Aquarium.getListeDerTiere());

    }
}
      /* try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/