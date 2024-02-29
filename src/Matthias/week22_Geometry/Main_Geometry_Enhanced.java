package Matthias.week22_Geometry;

/*
Aufgabe: Geometry Enhanced Version

Zeichne zuerst für die Aufgabe ein entsprechendes Klassendiagramm (kann wiederverwendet werden)

Erweitere das vorhergehende Beispiel um die Geometrische Form Stern und Haus vom Nikolaus. Verwende soviel Code wie möglich wieder.
 */



import java.util.ArrayList;

public class Main_Geometry_Enhanced {
    public static void main( String[] args ) {
        ArrayList<Geometry> objektSammlung= new ArrayList<>(  );

        Triangle dreieck=new Triangle( 2.0);
        Square viereck=new Square( 2 );
        System.out.println("Dreieck: " + dreieck + " Seitenlänge: "+dreieck.getLength());
        System.out.println("Viereck: " + viereck + " Seitenlänge: "+ viereck.getLength());
        Home OliverHome= new Home( viereck,dreieck );
        Star Stern=new Star( viereck,dreieck );

        objektSammlung.add( OliverHome );
        objektSammlung.add( Stern );

        double holeArea=0;
        double holeCircumference=0;
        for (Geometry g:objektSammlung) {
            System.out.println(g);
            holeArea=holeArea+g.getArea();
            holeCircumference=holeCircumference+g.getCircumference();
        }
        System.out.println( "Gesamt Flächeninhalt aller geometrie Objekte:" + holeArea);
        System.out.println( "Gesamt Umfang aller geometrie Objekte:" + holeCircumference);
    }

}
