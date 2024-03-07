package Alpi.week22;

public class Main {

    public static void main(String[] args) {

        Geometry[] geometrieObjekte = {
                new Square(5),
                new Rectangle(4, 6),
                new Circle(3),
                new Triangle(7),
                new Stern (5),
                new House (1 , 3)
        };

        for (Geometry geometrieObjekt : geometrieObjekte) {
            System.out.println(geometrieObjekt.getClass().getSimpleName());
            System.out.println("Fläche: " + geometrieObjekt.getArea());
            System.out.println("Umfang: " + geometrieObjekt.getCircumference());
            System.out.println();
        }

    }

}
