package claudia.claudia.museum;

import java.util.Timer;
import java.util.TimerTask;

public class WalkmanHire {
    static int pool = 50;
    static int helpers = 3;
    public static void main(String[] args) {
        /*
        //Schließt das Museum nach 1 Minute (beendet main):
        Timer meinTimer = new Timer();
        meinTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\n\nDas Museum schließt jetzt, auf Wiedersehen!");
                meinTimer.cancel();
                System.exit(0); //beendet die main-Methode
            }
        }, 60000); //60 Sekunden
        */
        //Museum mit 50 Walkmen
        Museum m = new Museum(50);

        //erzeuge 3 Counter
        for (int i = 1; i <= 3; i++)
            new Counter(m, i).start();
    }
}
