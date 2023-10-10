package solutions.michael_k.week3.example34;

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

        while (true) {
            int size = 0;
            char sex;

            Scanner inputKonsole = new Scanner ( System.in );

            System.out.print ("Geben sie das Geschlecht an (d/h):" );
            sex = inputKonsole.next().charAt (0);
            if (sex == 'h' || sex == 'd' ){

                if (sex == 'h') {
                    System.out.print ( "Geben sie die Größe an (44-70):" );
                    size = inputKonsole.nextInt ( );

                    if(size >=44 && size <=70 && size%2 == 0 ){
                        switch (size) {
                            case 44:
                            case 46:
                                System.out.println ( "S" );
                                break;
                            case 48:
                            case 50:
                                System.out.println ( "M" );
                                break;
                            case 52:
                            case 54:
                                System.out.println ( "L" );
                                break;
                            case 56:
                            case 58:
                                System.out.println ( "XL" );
                                break;
                            case 60:
                            case 62:
                                System.out.println ( "XXL" );
                                break;
                            case 64:
                            case 66:
                                System.out.println ( "3XL" );
                                break;
                            case 68:
                            case 70:
                                System.out.println ( "4XL" );
                                break;
                        }

                    }else {System.out.println ("Eingabe nicht gültig" );}


                }else {
                    System.out.print ( "Geben sie die Größe an (38-50):" );
                    size = inputKonsole.nextInt ( );

                    if (size >= 38 && size <= 50 && size % 2 == 0) {

                        switch (size) {
                            case 32:
                                System.out.println ( "XXS" );
                                break;
                            case 34:
                                System.out.println ( "XS" );
                                break;
                            case 36:
                                System.out.println ( "S" );
                                break;
                            case 38:
                                System.out.println ( "M" );
                                break;
                            case 40:
                                System.out.println ( "L" );
                                break;
                            case 42:
                                System.out.println ( "XL" );
                                break;
                            case 44:
                                System.out.println ( "XXL" );
                                break;
                            case 46:
                                System.out.println ( "3XL" );
                                break;
                            case 48:
                                System.out.println ( "4XL" );
                                break;
                            case 50:
                                System.out.println ( "5XL" );
                                break;
                        }

                    } else {System.out.println ( "Eingabe nicht gültig" );}
                }

            }else{System.out.println ("Eingabe nicht richtig" );}
        }
    }
}