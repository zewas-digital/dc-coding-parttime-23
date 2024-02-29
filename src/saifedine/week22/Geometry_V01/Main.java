package saifedine.week22.Geometry_V01;
/*
Erstelle eine Abstrakte Klasse Geometry. Diese enthält folgende Methoden:
getCircumference() und gibt einen double zurück
getArea() und gibt einen double zurück
Erstelle nun einige Klassen die von Geometry erben (Circle, Square, Rectangle, Triangle,...). Jede Klasse soll in ihrem Konstruktor die entsprechenden Werte erhalten.
Erstelle nun verschiedene Instanzen von Geometry, speichere diese in einer List. Erstelle eine Methode die den Gesamtumfang und die Gesamtfläche aller Geometry Objekte in der List ausgibt.
*/

import java.util.ArrayList;

public class Main {

    static ArrayList<Geometry> geometryObjects = new ArrayList<>();

    public static void main(String[] args) {


        Square square1 = new Square(4);
        System.out.println("Fläche square1: " + square1.area + " " + "\nUmfang square1: " + square1.circumference);
        geometryObjects.add(square1);
        System.out.println("geometryObjects1 square1: " + geometryObjects.get(0).area + ", " + geometryObjects.get(0).circumference);
        System.out.println("geometryObjects2 square1: " + geometryObjects.get(0).toString());

        Rectangle rectangle1 = new Rectangle(2,4);
        System.out.println("\nFläche rectangle1: " + rectangle1.area + " " + "\nUmfang rectangle1: " + rectangle1.circumference);
        geometryObjects.add(rectangle1);
        System.out.println("geometryObjects rectangle1: " + geometryObjects.get(1).toString());

        Circle circle1 = new Circle(2);
        geometryObjects.add(circle1);
        System.out.println("\ngeometryObjects circle1: " + geometryObjects.get(2).toString());

        // Klasse Triangle anschauen!!!!!!!!!!!!!!!!!!!
        Triangle triangle1 = new Triangle(5);
        geometryObjects.add(triangle1);
        System.out.println("\ngeometryObjects triangle1: " + geometryObjects.get(3).toString());


    }
}
