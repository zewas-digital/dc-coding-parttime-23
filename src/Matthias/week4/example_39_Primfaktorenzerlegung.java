package Matthias.week4;

/*
Primfaktorenzerlegung

Die Primfaktorzerlegung ist die Darstellung einer natürlichen Zahl n als Produkt aus Primzahlen, die dann als Primfaktoren von n bezeichnet werden.
Zum Beispiel kann 12 als 2*2*3 dargestellt werden, oder 16 als 2*2*2*2.

Zur Berechnung der Primfaktoren testet man, durch welche Primzahlen sich eine Zahl ohne Rest teilen lässt. Lässt die Zahl sich durch eine Primzahl ohne Rest teilen, so kann man mit dem Divisionsergebnis weiterrechnen, und das so lange, bis man als Divisionsergebnis eine Primzahl hat.
Beispielrechnung – Primfaktorzerlegung von 48:

    Zuerst testet man 48 auf Teilbarkeit durch 2.
    48 ist durch 2 teilbar, und 48/2=24.
    Auch 24 ist durch 2 teilbar, und 24/2=12,
    Auch 12 ist durch 2 teilbar, und 12/2=6,
    Auch 6 ist durch 2 teilbar, und 6/2=3,
    Da 3 eine Primzahl ist und 48 durch keine andere Zahl zwischen 3 und 48 mehr teilbar ist, kann man nun aufhören. Daraus ergeben sich für die Zahl 48 folgende Primfaktoren: 2, 2, 2, 2, 3.

Hinweis: Für die Berechnung ist es nicht unbedingt notwendig, Primzahlen zu kennen. Man beginnt einfach durch 2 zu teilen, solange bis bei der Division ein Rest übrigbleibt. Dann wiederholt man diesen Vorgang mit 3 sowie weiteren ungeraden Zahlen solange, bis bei der Division das Ergebnis 1 und Rest 0 rauskommt. Beispielrechnung – Primfaktorzerlegung von 1025:

Die Zahl 1025 ist ohne Rest nicht durch 2 oder 3 teilbar. Eine Division durch 5 ist ohne Rest möglich. Die Division ergibt 205. Auch 205 ist ohne Rest durch 5 möglich. Das Ergebnis ist 41. Die Zahl 41 ist schließlich weder durch 5, 7, 9, 11, … 39 teilbar. Die Division durch 41 ergibt schließlich das Ergebnis 1 mit Rest 0, d.h. 41 ist eine Primzahl. Damit haben wir die Primfaktoren 5, 5, 41. Schreiben sie ein Java-Programm, das alle Primfaktoren einer positiven ganzen Zahl berechnet und als Zeichenkette durch Stern getrennt zurückgibt. Für 41 soll somit das Ergebnis 41 sein. Das Ergebnis für 48 soll 2*2*2*2*3 sein.

Implementieren Sie folgende Methoden:

    public static String primeFactors(int number): liefert die Primfaktoren als String. zB 2*2*2*2*3 bei number=48.
    public static void printPrimeFactors(int number): gibt die Primfaktoren auf der Konsole aus, siehe Beispielausgabe. Fehlermeldung bei negativer Nummer.

Aufruf:
public static void automaticTest() {
    for (int i = 0; i <= 100; i++) printPrimeFactors(i);
    Out.println();
    printPrimeFactors(-96);
    printPrimeFactors(4);
    printPrimeFactors(96);
    printPrimeFactors(1024);
    printPrimeFactors(1025);
}

Ausgabe:
negative number 0
1 = 1
2 = 2
3 = 3
4 = 2*2
5 = 5
6 = 2*3
7 = 7
…
97 = 97
98 = 2*7*7
99 = 3*3*11
100 = 2*2*5*5
negative number -96
4 = 2*2
96 = 2*2*2*2*2*3
1024 = 2*2*2*2*2*2*2*2*2*2
1025 = 5*5*41






 */





public class example_39_Primfaktorenzerlegung {
}
