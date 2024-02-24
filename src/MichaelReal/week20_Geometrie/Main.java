package MichaelReal.week20_Geometrie;

import java.util.ArrayList;

public class Main {
    private ArrayList<Geometry> geometryObjects = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.createGeometryObjects();
        main.printTotalAreaAndCircumference();
    }

    public void createGeometryObjects() {
        geometryObjects.add(new Circle(5)); // Radius 5
        geometryObjects.add(new Square(10)); // Seitenlänge 10
        geometryObjects.add(new Rectangle(5, 7)); // Länge 5, Breite 7
        geometryObjects.add(new Triangle(3, 4, 5)); // Seitenlängen 3, 4, 5
    }

    public void printTotalAreaAndCircumference() {
        double totalArea = 0;
        double totalCircumference = 0;

        for (Geometry geom : geometryObjects) {
            totalArea += geom.getArea();
            totalCircumference += geom.getCircumference();
        }

        System.out.println("Gesamtfläche: " + totalArea + " cm²");
        System.out.println("Gesamtumfang: " + totalCircumference + " cm");
    }

    public void addGeometryObject(Geometry object) {
        geometryObjects.add(object);
    }

    public void removeGeometryObject(Geometry object) {
        geometryObjects.remove(object);
    }

    public double calculateTotalArea() {
        double totalArea = 0;
        for (Geometry object : geometryObjects) {
            totalArea += object.getArea();
        }
        return totalArea;
    }

    public double calculateTotalCircumference() {
        double totalCircumference = 0;
        for (Geometry object : geometryObjects) {
            totalCircumference += object.getCircumference();
        }
        return totalCircumference;
    }


}


