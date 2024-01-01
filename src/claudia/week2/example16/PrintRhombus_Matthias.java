package claudia.week2.example16;

public class PrintRhombus_Matthias {
        public static void main(String[] args){
            printRhombus('a', 8);// Aufruf zur Überprüfung, ob die Benutzer überprüfung überhaupt funktioniert
            printRhombus('a', 7);
        }
        static void printRhombus(char buchstabe, int höhedesrohmbus) {
            //Überprüfung ob die Eingabe des Benutzers überhaubt gültig für einen Rohmbus ist, ein Rohmbus
            if (höhedesrohmbus % 2==0){
                System.out.println("Fehler, Höhe muss ungerade sein!");
                return; // geht aus der Bendiung aus
            }
            System.out.println("Start");

            //Habe Zeile aus der Doppelschleife rausgenommen -> nur einmal berechnen anstatt in jedem Durchgang neu. C.
            //Berechnung der Zeilenmitte
            int Zeilenmitte=((höhedesrohmbus-1)/2); //Zeilenmitte = Spaltenmitte! C.

            for (int i = 0; i <= Zeilenmitte; i++) { //obere Hälfte. C.
                // Drucken der Höhe des Rohmbus
                System.out.print("Zeile = Höhe des Rohmbus: " + i );
                //Drucken der Breite des Rohmbus
                for (int j = 0; j < höhedesrohmbus; j++) {
                    // i enspricht der Zeile, sodass bei Zeile 0 und der letzen Zeile in der Zeilenmitte j ein Buchstabe gedruckt wird
                    /* //auskommentiert! C.
                    if ( i == 0 && j == Zeilenmitte) { //obere Ecke. C.
                        System.out.print( buchstabe );
                    }else if ((j==0||j==höhedesrohmbus-1) && i==Zeilenmitte){ //Ecken links und rechts. C.
                        System.out.print( buchstabe );
                    }
                    */ //C.
                    //Hier ist die allgemeine Formel; sie erfasst die Ecken oben, links und rechts mit: C.
                    if (j == Zeilenmitte - i || j == Zeilenmitte + i){
                        System.out.print(buchstabe);
                    }
                    else {
                        System.out.print( "_" );
                    }
                }
                System.out.println(  );
            }
            //Hier die Formel für die untere Hälfte ergänzen! C.
            for (int i = Zeilenmitte + 1; i < höhedesrohmbus; i++) {
                System.out.print("Zeile = Höhe des Rohmbus: " + i );
                for (int j = 0; j < höhedesrohmbus; j++){
                    if ((i == höhedesrohmbus - 1) && j == Zeilenmitte){
                        System.out.print(buchstabe);
                        }
                    else {
                        System.out.print( "_" );
                    }
                }
                System.out.println();
        }
    }
}

