package solutions.claudia.week3.example34;

import java.util.Scanner;

/*
Kleidergrößen

Konfektionsgrößen werden in verschiedenen Formaten angegeben, z.B. international mit S/M/L. Das Verkaufspersonal soll mit einem kleinen Programm unterstützt werden, um Herren- und Damenkonfektionsgrößen in dieses Format umzuwandeln.
Der Benutzer gibt zuerst ein, ob es sich um Damen- oder Herrengrößen handelt.
Lesen Sie dazu ein Zeichen (String) mit readString() ein (d für Damen, und h für Herren) und prüfen Sie dieses auf gültige Eingabe.
Lesen Sie solange einen Buchstaben vom Benutzer ein, bis die Eingabe gültig ist.

Lesen Sie danach eine ganze Zahl ein und geben Sie die entsprechende internationale Angabe aus. Verwenden Sie für Damen und Herren jeweils eine geeignete switch-case-Anweisung.

Geben Sie bei ungültiger Damen- bzw. Herrenauswahl ein Fragezeichen als Ergebnis aus.

Die möglichen Kleidergrößen sind wie folgt:
Herren 		Damen
44  S 	    32 	XXS
46  S 	    34 	XS
48  M 	    36 	S
50 	M 	    38 	M
52 	L 	    40 	L
54 	L 	    42 	XL
56 	XL 	    44 	XXL
58 	XL 	    46 	3XL
60 	XXL 	48 	4XL
62 	XXL 	50 	5XL
64 	3XL
66 	3XL
68 	4XL
70 	4XL

Hinweis: Nur die in den Tabellen angegebenen Werte gelten als gültig. 45 ist beispielsweise weder bei den Herren noch bei den Damen eine gültige Konfektionsgröße.

String to char:
char c= string.charAt(0);

Methode:
static String getSize(char gender, int sizeNumber)

Liefert die entsprechende internationale Größe (…/S/M/L/XL/…) für eine bestimmte Damen- oder Herrenkonfektionsgröße. Bei ungültigen Parameterwerten soll “?” das Ergebnis sein.

Beispielsdialog:
Konfektionsgrößen:
Damen (d) oder Herren (h)?: m
Damen (d) oder Herren (h)?: h
Konfektionsgröße: 30
Herren 30 -> ?
Beenden (j/n)? n
Damen (d) oder Herren (h)?: d
Konfektionsgröße: 30
Damen 30 -> ?
Beenden (j/n)? n
Damen (d) oder Herren (h)?: d
Konfektionsgröße: 40
Damen 40 -> L
Beenden (j/n)? n
Damen (d) oder Herren (h)?: h
Konfektionsgröße: 66
Herren 66 -> 3XL
Beenden (j/n)? j
Bye bye

 */
public class ConfectionSizes {
    public static void main(String[] args) {
        char gender = ' ';
        int sizeNumber = -1;
        Scanner scanner = new Scanner(System.in);

        /* Achtung, Abbrechen funktioniert noch nicht! */

        while ((gender != 'd') && (gender != 'h')) {
            System.out.print("Damen (d) oder Herren (h)? Abbrechen -> x ");
            gender = scanner.next().charAt(0);
        }
        System.out.print("Welche Konfektionsgröße? (Gib eine Zahl ein!) ");
        sizeNumber = scanner.nextInt();

        String size = getSize(gender, sizeNumber);
        printSize(gender, sizeNumber, size);

    }




    // Liefert die entsprechende internationale Größe (…/S/M/L/XL/…) für eine bestimmte Damen- oder Herrenkonfektionsgröße. Bei ungültigen Parameterwerten soll “?” das Ergebnis sein.
    static String getSize(char gender, int sizeNumber) {
        //Herren:
        if (gender == 'h') {
            switch ( sizeNumber ) {
                case 44:
                case 46:
                    return "S";
                case 48:
                case 50:
                    return "M";
                case 52:
                case 54:
                    return "L";
                case 56:
                case 58:
                    return "XL";
                case 60:
                case 62:
                    return "XXL";
                case 64:
                case 66:
                    return "3XL";
                case 68:
                case 70:
                    return "4XL";
                default:
                    return " ?";
            }
        } else {
            switch ( sizeNumber ) {
                case 32:
                    return "XXS";
                case 34:
                    return "XS";
                case 36:
                    return "S";
                case 38:
                    return "M";
                case 40:
                    return "L";
                case 42:
                    return "XL";
                case 44:
                    return "XXL";
                case 46:
                    return "3XL";
                case 48:
                    return "4XL";
                case 50:
                    return "5XL";
                default:
                    return " ?";
            }
        }
    }

    static void printSize(char gender, int sizeNumber, String size) {
        String sorte;
        if (gender == 'd') sorte = "Damen";
        else sorte = "Herren";

        System.out.println("Konfektionsgröße " + sizeNumber + " für " + sorte + " entspricht internationaler Größe " + size);
    }

}