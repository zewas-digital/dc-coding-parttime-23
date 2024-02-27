package claudia.week22_Geometry;

public class Circle extends Geometry {

    private double radius;


    public Circle(double radius){
        this.radius = radius;
        super.area = getArea();
        super.circumference = getCircumference();
        this.type = "Kreis";
    }

    public void setRadius(double radius) {
        this.radius = radius;
        super.circumference = getCircumference();
    }


    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }
}

