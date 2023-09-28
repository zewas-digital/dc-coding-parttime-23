/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

package solutions.michael_k.weekend1.example22;

public class SumOfDigits {
    public static void main(String[] args) {
        int wert1=203;
        int wert2=215;
        int faktor = 1;
        int zehner = 10;
        int ziffernsumme =0;
        int digits=1;
        int zwischenwerte=wert1;
        int x=0;
        int nummbersize;
        int wertxy =zwischenwerte;
        
        
       for (int i = 0; i < wert2-wert1+1; i++) {

           for (int k = 0; x < 1; k++) {                         //____________________________
               if (zwischenwerte / zehner != 0) {
                   digits++;
                   zehner = zehner * 10;                         //  in dieser Schleife wird die
               } else {                                          //  Anzahl der Stellen der Zahl ermittelt
                   x = 1;
               }                                                 //_____________________________
           }

           for (int j = 0; j < digits; j++) {                    // Hier der Faktor so viel mal mit 10 multipliziert
               faktor = faktor * 10;                             // wie die Zahl stellen hat bei einer 3 stelligen zahl( 1*10*10*10)

           }
           for (int j = digits; j > -1; j--) {                  // __________________________________________________
               for (int k = 0; k < 1; k++) {                    //
                   nummbersize = wertxy / faktor;
                   ziffernsumme = ziffernsumme + nummbersize;   // Hier wird die Höhe der Stelle ermittelt
                   wertxy = wertxy - faktor * nummbersize;      // und gleichzeitig addiert
               }
               faktor = faktor / 10;
           }                                                    //__________________________________________________
           System.out.println(ziffernsumme);
           zwischenwerte = zwischenwerte+1;
           zehner = 10;
           faktor =1;
           ziffernsumme=0;
           digits=1;
           x=0;
           nummbersize=0;
           wertxy =zwischenwerte;

       }











    }

}
