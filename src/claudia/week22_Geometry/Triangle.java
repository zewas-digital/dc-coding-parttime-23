package claudia.week22_Geometry;

public class Triangle extends Geometry {
    //gleichseitiges Dreieck, Fläche: sqrt(3) * 0.25 * länge^2

    private double length;

    public Triangle(double length){
        this.length = length;
        super.area = getArea();
        super.circumference = getCircumference();
        this.type = "gleichseitiges Dreieck";
    }

    public void setLength(double length) {
        this.length = length;
        super.area = getArea();
        super.circumference = getCircumference();
    }


    public double getArea(){
        return this.length * this.length * 0.25 * Math.sqrt(3);
    }
    public double getCircumference(){
        return 3 * this.length;
    }
}
