/*
Diese Aufgabe orientiert sich an der Onlineoberfläche für Abfragen aus dem zentralen Vereinsregister des BMI.
Die Website kann hier abgerufen werden: https://citizen.bmi.gv.at/at.gv.bmi.fnsweb-p/zvn/public/Registerauszug

Das besondere ist, dass eine Abfrage auf zwei Art und Weisen möglich ist:
1. Eingabe einer gültigen ZVR Nummer zwischen 100000000 und 999999999.
2. Eingabe des Vereinsnamens UND des Vereinssitzes.

Der Nutzer wird nacheinander aufgefordert die drei Werte einzugeben. Möchte er keinen angeben, kann er den Input -1 geben.

Nachdem alle drei Werte erhoben sind, soll geprüft werden, ob eine der beiden Bedingungen erfüllt wurde.
Wenn ja, soll ausgegeben werden "Abfrage erfolgreich!". Wenn nicht, soll ausgegeben werden "Kein Verein gefunden."


 */

package Matthias.week2_weekend_Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example_31_ZVR {

        public static void main(String[] args) {
            // Gültigkeitsbereich des Clientenbereich

            int iMinClientnumber = 100000000;
            int iMaxClientnumber = 999999999;
            int UserClientnumber=0;
            //Speicher für String Verreinsname und Verreinsitz
            String Vereinsname, Vereinssitz;
            //Array zum Speichern der Verreinsname und Verreinssitz -> zwei Wörter
            String[] StorageVN_VS=new String[2];

            //Allgemein 1:: Einlesen der Bentuzerdaten//

            //1.Schritt: Clientnummer Einlesen und prüfen, durch den vorgegbenen Clientbereich
            UserClientnumber=getClientnumber( iMinClientnumber, iMaxClientnumber);

            //2.Schritt: Vereinsname und Verreinsitz einlesen und in einen String Array Speichern, damit beide Namen übergeben werden können
            StorageVN_VS=getVereinsnameANDVereinssitz();

            //3.Schritt: Übergabe der Strings ins Hauptprogramm
            Vereinsname=StorageVN_VS[0];
            Vereinssitz=StorageVN_VS[1];
            if ( (Vereinsname.equals( "-1" )&&Vereinssitz.equals( "-1" ))||UserClientnumber==-1  ) {
                System.out.println("Kein Verrein gefunden"  );
            }else {
                //4. Schritt: Drucken der eingelesenen Benutzerinputs
                System.out.println( "Clientennummer:"+ UserClientnumber );
                System.out.println( "Vereinsname: " + Vereinsname +"\nVereinssitz: " + Vereinssitz );
                System.out.println( "Abfrage war erfolgreich!" );
            }
            }

        //Methode1: Einlesen des Clientennummer, vorgabe durch einen Range an Clientenminimalanzahl
         public static int getClientnumber (int iMinClientRange , int iMaxClienRange)throws InputMismatchException {
            Scanner scanner=new Scanner( System.in );
            while ( true ){
                try {
                    System.out.print( "Geben Sie die Clientnummer ein: " );
                    int UserClientNumber=scanner.nextInt();
                    if (UserClientNumber==-1 || ((UserClientNumber>=iMinClientRange) && (UserClientNumber<iMaxClienRange+1))) {
                        return UserClientNumber;
                    }
                }catch (Exception InputMismatchException){
                    // Code, der ausgeführt wird, wenn eine Ausnahme geworfen wird
                    System.out.println( "Die Eingabe ist kein Ganzzahlinger Wert" );
                    // Erklärung siehe: https://www.java-forum.org/thema/bedeutung-von-xxx-nextline.175453/
                    //Löscht Line Space vom InputStream und setzt den Zeiger in eine neue Zeile
                    scanner.nextLine( );
                }
            }
         }

        //Methode 2: Verreinsname und Verreinsitz wird eingelesen -> überprüft-> in einen String Array gespeichert
        public static  String[] getVereinsnameANDVereinssitz() {
            Scanner scanner=new Scanner( System.in );
            String[] StorageVN_VS=new String[2];
         while ( true ) {
             try {
                 System.out.println( "Geben Sie den Vereinsname ein: " );
                 StorageVN_VS[0]=readString();
                 System.out.println( "Geben Sie den Vereinsitz ein: " );
                 StorageVN_VS[1]=readString();
                 if (StorageVN_VS[1].isEmpty()) {
                    System.out.println("Input cannot be empty");
                 }
                 return StorageVN_VS;
             } catch (Exception NoSuchElementException) {
                 System.out.println("An error occurred: " + NoSuchElementException.getMessage());
             }
         }
        }

        //Methode 3: String einlsen und überprüfen, ob er leer ist
        public static String readString() throws Exception {
                Scanner scanner=new Scanner( System.in );
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    throw new Exception("Input cannot be empty");
                }
                return input;
            }

}

