package claudia.week22_Geometry;

public class House extends Geometry{
    private double length;
    private Square square;
    private Triangle triangle;
    public House(double length){
        this.length = length;
        this.type = "Haus";
        this.square = new Square(this.length);
        this.triangle = new Triangle(this.length);
        super.area = getArea();
        super.circumference = getCircumference();

    }
    public double getArea(){
        return this.square.getArea() + this.triangle.getArea();
    }
    public double getCircumference(){
        return this.square.getCircumference() + this.triangle.getCircumference() - 2 * this.length;

    }

}
