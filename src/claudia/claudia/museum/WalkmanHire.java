package claudia.claudia.museum;

import java.util.Timer;
import java.util.TimerTask;

public class WalkmanHire {
    static int pool;
    static int helpers;
    public static void main(String[] args) {


        Timer meinTimer = new Timer();
        meinTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\n\nDas Museum schließt jetzt, auf Wiedersehen!");
                meinTimer.cancel();
                System.exit(0); //beendet die main-Methode
            }
        }, 30000); //30 Sekunden



        if (args.length >= 1)
            pool = Integer.parseInt(args[0]);
        else pool = 50;

        Museum m = new Museum(pool);

        if (args.length >= 2)
            helpers = Integer.parseInt(args[1]);
        else helpers = 3;

        for (int i = 0; i < helpers; i++)
            new Counter(m, i).start();
    }
}
