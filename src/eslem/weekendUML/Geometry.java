package eslem.weekendUML;
/*
Erstelle eine Abstrakte Klasse Geometry. Diese enthält folgende Methoden:

    * getCircumference() und gibt einen double zurück
    * getArea() und gibt einen double zurück

Erstelle nun einige Klassen die von Geometry erben (Circle, Square, Rectangle, Triangle,...).
Jede Klasse soll in ihrem Konstruktor die entsprechenden Werte erhalten.

Erstelle nun verschiedene Instanzen von Geometry, speichere diese in einer List. Erstelle eine Methode die den Gesamtumfang und die Gesamtfläche aller Geometry Objekte in der List ausgibt.
 */

abstract class Geometry implements Calculation {
   public double area;
   public double circumfence;
}