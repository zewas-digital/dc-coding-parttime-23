package claudia.week21_Threads.Geometry;

public class Circle extends Geometry {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.circumference = getCircumference();
    }


    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2) * 0.5;
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }
}

