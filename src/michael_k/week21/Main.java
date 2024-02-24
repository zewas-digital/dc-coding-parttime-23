package michael_k.week21;

public class Main {

    public static void main(String[] args) {

        Square geo1 = new Square ( 2 );
        System.out.println ("Fläche: " + geo1.area + " Umfang: "+ geo1.circumference );

        Rectangle geo2 = new Rectangle ( 4,2 );
        System.out.println ("Fläche: " + geo2.area + " Umfang: "+ geo2.circumference );

        Circle geo3 = new Circle ( 5 );
        System.out.println ("Fläche: " + geo3.area + " Umfang: "+ geo3.circumference );

        Triangle geo4 = new Triangle ( 5 );
        System.out.println ("Fläche: " + geo4.area + " Umfang: "+ geo4.circumference );
    }
}
