package claudia.week22_Geometry;

/*
Aufgabe: Geometry Enhanced Version

Zeichne zuerst für die Aufgabe ein entsprechendes Klassendiagramm (kann wiederverwendet werden)

Erweitere das vorhergehende Beispiel um die Geometrische Form Stern und Haus vom Nikolaus. Verwende soviel Code wie möglich wieder.
 */

import java.util.ArrayList;

public class Main_Geometry_Enhanced {
    public static void main(String[] args) {
        House h1 = new House(1.0);
        House h2 = new House(2.0);
        Star s1 = new Star(1.0);
        Star s2 = new Star(2.0);

        ArrayList<Geometry> newForms = new ArrayList<>();

        newForms.add(h1);
        newForms.add(h2);
        newForms.add(s1);
        newForms.add(s2);

        System.out.println();
        for (Geometry g : newForms) {
            System.out.printf("%-10s :%10s %10.4f  %10s %10.4f\n", g.type, "Fläche:", g.area, "Umfang:", g.circumference);
           }
        System.out.println();
    }

}
