/*
Programmiere einen Rechner mit den nachfolgenden Operationen:
1. Addieren
2. Subtrahieren
3. Multiplizieren
4. Dividieren
5. Potenzieren

Der Nutzer kann eine der fünf Operationen auswählen und zwei Zahlen zur Berechnung eingeben.
Gib' den Rechenweg und das Ergebnis auf der Console aus. Zum Beispiel: 5 ^ 2 = 25
 */

package Matthias.week2_weekend_Scanner;

public class
example_33_Calculator {
    public static void main(String[] args) {

            // Erstellen der lokalen Variabeln
            int settedMenuNumber=0;
            double zahl1=0,  zahl2=0;

            // Erzeugen eines Arrays mit dem Inhalt von Zahl 1 und 2
            double[]Array_Numer1_2= new double[]{zahl1,zahl2};

            //Schritt 1: Drucken der Bentuzeranleitung
            printUnserInfo( );

            //Schritt 2: Zahl der Menu Option holen und überprüfen
            settedMenuNumber=getMenuValue( );

            //Schritt 3: Die Anzahl der zuholenden int Zahlen übergeben und die Zahlen,welche für die Berechnung gebraucht werden, werden zurückgegeben
            Array_Numer1_2=getValuesOfCalculation(Array_Numer1_2.length);

            //Schritt 4: Zahlen werden vom Int Array in lokalen Variabeln übergeben, damit mit ihnen im Hauptprogramm bearbeitet werden kann -> Sie werden zur Berechung benötigt
            zahl1=Array_Numer1_2[0];
            zahl2=Array_Numer1_2[1];

            //Schritt 5: Nachdem alle Zahlen eingelesen sind, kann die Berechnung, des jeweiligen Menüpunktes durchgeführt werden
            switch ( settedMenuNumber ){
                case 1:
                    System.out.println( "Addition: "+zahl1 + " + " + zahl2 + " = " + (zahl1+zahl2));
                    break;
                case 2:
                    System.out.println( "Subtraktion : "+zahl1 + " - " + zahl2 + " = " + (zahl1-zahl2));
                    break;
                case 3:
                    System.out.println( "Multiplikation: "+zahl1 + " * " + zahl2 + " = " + (zahl1*zahl2));
                    break;
                case 4:
                    double calc=zahl1/zahl2;
                    System.out.println( "Dividieren : "+zahl1 + " / " + zahl2 + " = " + calc);
                    break;
                case 5:
                    double calc2=Math.pow( zahl1,zahl2 );
                    System.out.println( "Potenzieren: "+zahl1 + " ^ " + zahl2 + " = " + (calc2));
                    break;
            }
    }
    //Methode 1: Drucken der Benutzer Info
    static public void printUnserInfo(){
        System.out.println("Programmiere einen Rechner mit den nachfolgenden Operationen:\n" +
                "1. Addieren\n" +
                "2. Subtrahieren\n" +
                "3. Multiplizieren\n" +
                "4. Dividieren\n" +
                "5. Potenzieren\n"+
                "Wählen Sie die die Zahlen 1-5  um die Menü zu wählen:");
    }

    //Methode 2: Menu Optionen holen ->Überprüfen -> zurückgeben
    static public int getMenuValue(){
        int settedMenuNumber=0;
        boolean status= false;
        while ( !status ){
            settedMenuNumber=example_25_ReadDatatype.getInt();//Menu Number overwrite to input of the User
            if (settedMenuNumber==0 || settedMenuNumber > 5) {
                System.out.println("WARNUNG: Geben Sie Bitte eine Zahl von 1-5 ein!" );
            }else {
                status=true;
            }
        }
        return settedMenuNumber;
    }

    //Methode 3: Die Methode holt soviel Zahlenwerte vom User, wie an NumberOfNumbersWantToGet benötigt werden und speichert diese Zahlen in einem Array
    public static double[] getValuesOfCalculation(int NumberOfNumbersWantToGet ) {
        double[]Array_Numer1_2= new double[NumberOfNumbersWantToGet];
        for (int i = 0; i < Array_Numer1_2.length; i++) {
            int zahl=i;
            System.out.println( "Geben Sie Zahl "+(zahl+1)+" ein: " );
            Array_Numer1_2[i]=example_25_ReadDatatype.getInt();
        }
        return Array_Numer1_2;
    }

}
