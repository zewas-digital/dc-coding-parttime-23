package saifedine.week22_weekend6.Geometry_Bonus;

/*
Aufgabe: Geometry Enhanced Version

Zeichne zuerst für die Aufgabe ein entsprechendes Klassendiagramm (kann wiederverwendet werden)

Erweitere das vorhergehende Beispiel um die Geometrische Form Stern und Haus vom Nikolaus. Verwende soviel Code wie möglich wieder.
 */


public class Main_Geometry_Enhanced {

    public static void main(String[] args) {

        Square square1 = new Square(5);
        System.out.println("\nFläche square1: " + square1.area + " " + "\nUmfang square1: " + square1.getCircumference());

        Triangle triangle1 = new Triangle(5);
        System.out.println("\nFläche triangle1: " + triangle1.getArea() + " " + "\nUmfang triangle1: " + triangle1.circumference);

        calculateAreaStar(square1,triangle1);
        calculateCircumferenceStar(square1,triangle1);

        calculateAreaNikolaus(square1,triangle1);
        calculateSircumferenceNikolaus(square1,triangle1);

    }

    public static void calculateAreaStar(Square square, Triangle triangle){
        double area = square.area + (4 * triangle.getArea()) ;
        System.out.println("\nFlächeninhalt vom Stern ist: " + area);
    }

    public static void calculateCircumferenceStar(Square square, Triangle triangle){
        double circumference = triangle.getLength() * 8;
        System.out.println("\nUmfang vom Stern ist: " + circumference);
    }

    public static  void calculateAreaNikolaus(Square square, Triangle triangle){
        double area = square.area + triangle.getArea();
        System.out.println("\nFlächeninhalt vom Nikolaus ist: " + area);
    }

    public static void calculateSircumferenceNikolaus(Square square, Triangle triangle){
        double circumference = square.getLength() * 3 + triangle.getLength() * 2;
        System.out.println("\nUmfang vom Nikolaus ist: " + circumference);
    }
}