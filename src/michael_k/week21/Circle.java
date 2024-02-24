package michael_k.week21;

public class Circle extends Geometrie{

    private double radius;
    public Circle (double radius){
        super();
        this.radius = radius;
        getArea ( );
        getCircumference ( );
    }
    public void getArea(){
        this.area = radius * radius * Math.PI;
    }
    public void getCircumference(){
        this.circumference = radius * Math.PI * 2 ;
    }

}
