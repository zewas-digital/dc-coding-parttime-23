package judith.week3.example34;

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

import com.sun.source.tree.CaseTree;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ConfectionSizes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("Geben sie Damen oder Herren an");
            String sex = scan.next();
            int size;
            if (sex.equals("d")) {
                System.out.println("Gib eine Größe zwischen 32 - 50 ein");
                size = scan.nextInt();
                String var = "?"; // muss nur verwendet werden wenn bei "case" zur Ausgabe die Variable verwendet wird.

                switch (size) {                 //Ein Switch Case in Java ersetzt mehrere if-Anweisungen durch einen Ausdruck.
                    case 32:
                        var = "XXS"; // entweder kann es mit dem String oben und dem "var" definiert werden oder mit System.out.println() dann ist aber das "String" oben überflüssig
                    case 34:
                        System.out.println("XS");
                        break;
                    case 36:
                        System.out.println("S");
                        break;
                    case 38:
                        System.out.println("M");
                        break;
                    case 40:
                        System.out.println("L");
                        break;
                    case 42:
                        System.out.println("XL");
                        break;
                    case 44:
                        System.out.println("XXL");
                        break;
                    case 46:
                        System.out.println("3XL");
                        break;
                    case 48:
                        System.out.println("4XL");
                        break;
                    case 50:
                        System.out.println("5XL");
                        break;
                    default:
                        System.out.println("?");


                }


                System.out.println("Damen " + size + " -> " + var);
                System.out.println("Beenden (j/n) ? ");
                String beenden = scan.next();
                if (beenden.equals("j")) {
                    break;
                }

            }
            if (sex.equals("h")) {
                System.out.println("Gib eine Größe zwischen 44 - 70 ein");
                size = scan.nextInt();

                if (size >= 44 && size <= 70 && size % 2 == 0) {
                    switch (size) {
                        case 44:                //Multiple Case Statement case kann entweder "Wert:" geschrieben werden oder in einer Reihe case 2011, 2012, 2013:
                        case 46:
                            System.out.println("S");
                            break;
                        case 48:
                        case 50:
                            System.out.println("M");
                            break;
                        case 52:
                        case 54:
                            System.out.println("L");
                            break;
                        case 56:
                        case 58:
                            System.out.println("XL");
                            break;
                        case 60:
                        case 62:
                            System.out.println("XXL");
                            break;
                        case 64:
                        case 66:
                            System.out.println("3XL ");
                            break;
                        case 68:
                        case 70:
                            System.out.println("4XL");
                            break;
                        default:
                            System.out.println("?");

                    }
                }

                System.out.println("Herren " + size);
                System.out.println("Beenden (j/n) ? ");
                String beenden = scan.next();
                if (beenden.equals("j")) {
                    break;

                }

            }

        }
    }
}



