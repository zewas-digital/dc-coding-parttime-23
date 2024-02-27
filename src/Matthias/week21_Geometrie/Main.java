package Matthias.week21_Geometrie;

import java.util.ArrayList;

public class Main {
    public static void main( String[] args ) {
        ArrayList<Geometry> objektSammlung= new ArrayList<>(  );

        Triangle dreieck=new Triangle( 2.0);
        Square viereck=new Square( 2 );
        Rectangle recheck= new Rectangle( 2,3 );
        Cirlcle kreis=new Cirlcle(2.5);
        objektSammlung.add( dreieck );
        objektSammlung.add( viereck );
        objektSammlung.add( recheck );
        objektSammlung.add( kreis );
        double holeArea=0;
        double holeCircumference=0;
        for (Geometry g: objektSammlung) {
            holeArea=holeArea+g.getArea();
            holeCircumference=holeCircumference+g.getCircumference();
        }
        System.out.println( "Gesamt Flächeninhalt aller geometrie Objekte:" + holeArea);
        System.out.println( "Gesamt Umfang aller geometrie Objekte:" + holeCircumference);
    }
}
