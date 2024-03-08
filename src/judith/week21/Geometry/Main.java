package judith.week21.Geometry;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {


    public static void main(String[] argv) {

        ArrayList<Geometry> geometryObjects = new ArrayList<>();

        Square sq1 = new Square(5.0);
        Square sq2 = new Square(11.5);

        Rectangle re1 = new Rectangle(2.0, 3.0);
        Rectangle re2 = new Rectangle(5.0, 8.0);

        Circle ci1 = new Circle(10.0);
        Circle ci2 =new Circle(5.0);

        Triangle tr1 = new Triangle(4.0);
        Triangle tr2 = new Triangle(6.0);

        geometryObjects.add(sq1);
        geometryObjects.add(sq2);

        geometryObjects.add(re1);
        geometryObjects.add(re2);

        geometryObjects.add(ci1);
        geometryObjects.add(ci2);

        geometryObjects.add(tr1);
        geometryObjects.add(tr2);












    }


}
