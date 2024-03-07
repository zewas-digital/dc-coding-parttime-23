package michael_k.week21;

public class Triangle extends Geometrie{

    private double length;
    public Triangle (double length){
        super();
        this.length = length;
        getArea ( );
        getCircumference ( );
    }
    public void getArea(){
        double h = Math.sqrt ( Math.pow ( length, 2 )-Math.pow ( length/2,2 ) );
        this.area = length*h/2;
    }
    public void getCircumference(){
        this.circumference = length*3;
    }
}
