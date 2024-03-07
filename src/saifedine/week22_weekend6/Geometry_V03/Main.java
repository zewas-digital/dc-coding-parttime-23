package saifedine.week22_weekend6.Geometry_V03;
/*
Erstelle eine Abstrakte Klasse Geometry. Diese enthält folgende Methoden:
getCircumference() und gibt einen double zurück
getArea() und gibt einen double zurück
Erstelle nun einige Klassen die von Geometry erben (Circle, Square, Rectangle, Triangle,...). Jede Klasse soll in ihrem Konstruktor die entsprechenden Werte erhalten.
Erstelle nun verschiedene Instanzen von Geometry, speichere diese in einer List. Erstelle eine Methode die den Gesamtumfang und die Gesamtfläche aller Geometry Objekte in der List ausgibt. --> Main

Interface ist Zusatz, damit es wiederholt wird!!

*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Geometry> geometryObjects = new ArrayList<>();

        Square square1 = new Square(4);
        //System.out.println("\nFläche square1: " + square1.area + " " + "\nUmfang square1: " + square1.circumference);
        geometryObjects.add(square1);
        //System.out.println("\ngeometryObjects2 square1: " + geometryObjects.get(0).toString());
        System.out.println("\ngeometryObjects square1: " + geometryObjects.get(0).area + ", " + geometryObjects.get(0).circumference);


        Rectangle rectangle1 = new Rectangle(2,4);
        geometryObjects.add(rectangle1);
        //System.out.println("\ngeometryObjects rectangle1: " + geometryObjects.get(1).toString());
        System.out.println("\ngeometryObjects rectangle1: " + geometryObjects.get(1).area + ", " + geometryObjects.get(1).circumference);


        Circle circle1 = new Circle(4);
        geometryObjects.add(circle1);
        //System.out.println("\ngeometryObjects circle1: " + geometryObjects.get(2));
        System.out.println("\ngeometryObjects circle1: " + geometryObjects.get(2).area + ", " + geometryObjects.get(2).circumference);


        Triangle triangle1 = new Triangle(5);
        geometryObjects.add(triangle1);
        //System.out.println("\ngeometryObjects triangle1: " + geometryObjects.get(3));
        System.out.println("\ngeometryObjects triangle1: " + geometryObjects.get(3).area + ", " + geometryObjects.get(3).circumference);

        calculateTotalArea(geometryObjects);
        calculateTotalCircumference(geometryObjects);

        calculateTotal(geometryObjects);

    }
    public static double calculateTotalArea(ArrayList<Geometry> geometryObjects){

        double totalArea = 0;

        for (Geometry geometryObjectArea : geometryObjects) {
            totalArea += geometryObjectArea.getArea();
        }
        System.out.println("\nGesamtflächeninhalt aller Objekte in der ArrayList: " + totalArea);
        return totalArea;
    }

    public static double calculateTotalCircumference(ArrayList<Geometry> geometryObjects){

        double totalCircumference = 0;

        for (Geometry geometryObjectCircumference: geometryObjects){
            totalCircumference += geometryObjectCircumference.getCircumference();
        }
        System.out.println("\nGesamtumfang aller Objekte in der ArrayList: " + totalCircumference);
        return totalCircumference;
    }

    public static void calculateTotal(ArrayList<Geometry> geometryObjects){
        double total =  calculateTotalArea(geometryObjects) + calculateTotalCircumference(geometryObjects);
        System.out.println("\nGesamtflächeninhalt & Gesamtumfang aller Objekte in der ArrayList: " + total);
    }
}
