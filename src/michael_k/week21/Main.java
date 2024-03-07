package michael_k.week21;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Geometrie> geometrien = new ArrayList<Geometrie> ();

    public static void main(String[] args) {

        /*Square geo1 = new Square ( 2 );
        geometrien.add ( geo1 );
        System.out.println ("Fläche: " + geo1.area + " Umfang: "+ geo1.circumference );

        Rectangle geo2 = new Rectangle ( 4,2 );
        geometrien.add ( geo2 );
        System.out.println ("Fläche: " + geo2.area + " Umfang: "+ geo2.circumference );

        Circle geo3 = new Circle ( 5 );
        geometrien.add ( geo3 );
        System.out.println ("Fläche: " + geo3.area + " Umfang: "+ geo3.circumference );

        Triangle geo4 = new Triangle ( 5 );
        geometrien.add ( geo4 );
        System.out.println ("Fläche: " + geo4.area + " Umfang: "+ geo4.circumference );

         */

        createCircle ( 5 );
        createSquare ( 5 );
        createRectangle ( 5,3 );
        createTriangle ( 5 );
        createHausVomNikolaus ( 5 );
        createStern ( 5 );

        totalAreaCircumference (  );
    }

    private static void createSquare(double length){
        Geometrie geo = new Square ( length );
        System.out.println ("Fläche: " + geo.area+ " Umfang: "+ geo.circumference );
        geometrien.add ( geo );

    }
    private static void createRectangle(double length, double width){
        Geometrie geo = new Rectangle ( length, width );
        System.out.println ("Fläche: " + geo.area+ " Umfang: "+ geo.circumference );
        geometrien.add ( geo );
    }
    private static void createCircle(double radius){
        Geometrie geo = new Circle ( radius );
        System.out.println ("Fläche: " + geo.area+ " Umfang: "+ geo.circumference );
        geometrien.add ( geo );
    }
    private static void createTriangle(double length){
        Geometrie geo = new Triangle ( length );
        System.out.println ("Fläche: " + geo.area+ " Umfang: "+ geo.circumference );
        geometrien.add ( geo );
    }
    private static void createHausVomNikolaus(double length){
        Geometrie geo = new HausVomNikolaus ( length );
        System.out.println ("Fläche: " + geo.area+ " Umfang: "+ geo.circumference );
        geometrien.add ( geo );
    }
    private static void createStern(double length){
        Geometrie geo = new Stern ( length );
        System.out.println ("Fläche: " + geo.area+ " Umfang: "+ geo.circumference );
        geometrien.add ( geo );
    }
    private static void totalAreaCircumference(){
        double area= 0;
        double circumference= 0;
        for (Geometrie geo: geometrien) {
            area = area + geo.area;
            circumference = circumference + geo.circumference;

        }
        System.out.println ("Fläche gesamt: " + area + " Umfang gesamt: "+ circumference );

    }

}

