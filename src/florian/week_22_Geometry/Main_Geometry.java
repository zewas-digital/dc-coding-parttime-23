package florian.week_22_Geometry;

/* Erstelle eine Abstrakte Klasse Geometry. Diese enthält folgende Methoden:
 * getCircumference() und gibt einen double zurück
 * getArea() und gibt einen double zurück
 *
 * Erstelle nun einige Klassen die von Geometry erben (Circle, Square, Rectangle, Triangle...). Jede Klasse
 * soll in Ihrem Konstruktor die entsprechenden Werte erhalten.
 *
 * Erstelle nun verschiedene Instanzen von Geometry, speichere diese in einer List. Erstelle eine Methode
 * die den Gesamtumfang und die Gesamtfläche aller Geometry Objekte in der Liste ausgibt.*/

import java.util.ArrayList;

public class Main_Geometry {
    static ArrayList<Geometry> geometryObjects = new ArrayList<>();
    public static void main(String[] args) {



        Square square = new Square(10);
        geometryObjects.add(square);
        System.out.print("Square: " + square + "\n");

        Rectangle rectangle = new Rectangle(10, 10);
        geometryObjects.add(rectangle);
        System.out.print("Rectangle: " + rectangle + "\n");

        Circle circle = new Circle(10);
        geometryObjects.add(circle);
        System.out.print("Circle: " + circle + "\n");

        Triangle triangle = new Triangle(10);
        geometryObjects.add(triangle);
        System.out.print("Triangle: " + triangle + "\n");


        for (Geometry g : geometryObjects){
            System.out.println("Gesamtsummen: " + "\n" + g);
        }



    }









}
