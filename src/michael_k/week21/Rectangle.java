package michael_k.week21;

public class Rectangle extends Geometrie{

    private double length;
    private double width;
    public Rectangle (double length, double width){
        super();
        this.length = length;
        this.width = width;
        getArea ();
        getCircumference ();
    }
    public void getArea() {
        this.area = length * width;
    }
    public void getCircumference(){
        this.circumference = length*2 + width*2;
    }

}
