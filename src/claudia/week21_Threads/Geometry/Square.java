package claudia.week21_Threads.Geometry;

public class Square extends Geometry{
    private double length;

    public Square(double length){
        this.length = length;
        super.area = getArea();
        super.circumference = getCircumference();
        this.type = "Quadrat";
    }

    public void setLength(double length) {
        this.length = length;
        super.area = getArea();
        super.circumference = getCircumference();
    }


    public double getArea(){
        return this.length * this.length;
    }
    public double getCircumference(){
        return 2 * (this.length + this.length);
    }
}
