package eslem.weekendUML;

public class Rectangle extends Geometry {
   private double length;
   private double width;

   public Rectangle(double length, double width){
       super();
       this.length = length;
       this.width = width;
       this.area = getArea();
       this.circumfence = getCircumference();
   }
    @Override
    public String toString(){
        return "Fläche: " + this.area + ", Umfang: " + this.circumfence;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
       this.area = this.length * this.width;
       return this.area;
    }
    public double getCircumference() {
       this.circumfence = 2 * this.length + 2 * this.width;
       return this.circumfence;
    }
}
