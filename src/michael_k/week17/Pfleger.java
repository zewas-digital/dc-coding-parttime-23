package michael_k.week17;

import java.util.ArrayList;

public class Pfleger {

    public String name;
    public String lieblingstier;
    public ArrayList<Gehege> gehege = new ArrayList<Gehege> ();


    public Pfleger(String name, String lieblingstier){
        this.name = name;
        this.lieblingstier = lieblingstier;
    }
    public void gehegeHinzufuegen(Gehege gehege){
        this.gehege.add ( gehege );
    }
    public void resetGehege(){
        this.gehege.clear ();
    }

    public void kontrollgang(){

        if(!gehege.isEmpty ( )) {

            for (int i = 0; i < gehege.size (); i++) {

                System.out.println ( name + " geht zum Gehege " + gehege.get ( i ).name+"." );
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException ( e );
                }
                if(!gehege.get ( i ).gehegeKontrolliert){
                    System.out.println (name + " füttert die Tiere und säubert das Gehege." );
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException ( e );
                    }
                    System.out.println (name + " beobachtet wie " + gehege.get ( i ).zufallstier (this.lieblingstier) + " das Futter frisst und im Gehege herum läuft.\n"  );
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException ( e );
                    }
                    gehege.get ( i ).gehegeKontrolliert = true;
                }else{
                    System.out.println ("Das Gehege "+ gehege.get ( i ).name+ " wurde schon betreut. "+ name+ " macht sich wieder auf den Weg.\n" );
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException ( e );
                    }
                }

            }
        }else{
            System.out.println (name + " hat heute keine zugeteilten Gehege und erledigt den Futtereinkauf.\n" );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException ( e );
            }
        }

    }
}
