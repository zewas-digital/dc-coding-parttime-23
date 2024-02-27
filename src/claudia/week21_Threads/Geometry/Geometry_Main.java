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
        Circle c2 = new Circle(5.0);
        Square s1 = new Square(3.0);
        Square s2 = new Square(0.1);
        Triangle t1 = new Triangle(1.0);
        Triangle t2 = new Triangle(1.5);

        ArrayList<Geometry> Forms = new ArrayList<>();

        Forms.add(r1);
        Forms.add(r2);
        Forms.add(c1);
        Forms.add(c2);
        Forms.add(s1);
        Forms.add(s2);
        Forms.add(t1);
        Forms.add(t2);

        System.out.println();

        double circumferenceTotal = 0;
        double areaTotal = 0;

        for (Geometry g : Forms) {
            System.out.printf("%-25s :%10s %10.4f  %10s %10.4f\n", g.type, "Fläche:", g.area, "Umfang:", g.circumference);
            circumferenceTotal += g.circumference;
            areaTotal += g.area;
        }
        System.out.println();
        System.out.println("Hier noch zwei sinnfreie Berechnungen laut Aufgabenstellung: ");
        System.out.println("Gesamtumfänge aller Formen: " + circumferenceTotal);
        System.out.println("Gesamtfläche aller Formen : " + areaTotal);
    }
}
