package claudia.week21_Threads.Geometry;
/*
Erstelle eine Abstrakte Klasse Geometry. Diese enthält folgende Methoden:
getCircumference() und gibt einen double zurück
getArea() und gibt einen double zurück
Erstelle nun einige Klassen die von Geometry erben (Circle, Square, Rectangle, Triangle,...).
Jede Klasse soll in ihrem Konstruktor die entsprechenden Werte erhalten.
Erstelle nun verschiedene Instanzen von Geometry, speichere diese in einer List.
Erstelle eine Methode die den Gesamtumfang und die Gesamtfläche aller Geometry Objekte in der List ausgibt.
 */


import java.util.ArrayList;

public class Geometry_Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.0, 2.3);
        Rectangle r2 = new Rectangle(3.2, 0.5);
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(2.0);

        ArrayList<Geometry> Formen = new ArrayList<>();

        Formen.add(r1);
        Formen.add(r2);
        Formen.add(c1);
        Formen.add(c2);


        for (Geometry g : Formen) {
            System.out.println("Fläche: " + g.getCircumference() + " Umfang " + g.getCircumference());

        }
    }
}
