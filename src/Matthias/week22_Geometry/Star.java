package Matthias.week22_Geometry;

public class Star extends Geometry{
    private Square starBody;
    private Triangle top;

    public Star( Square starBody, Triangle top){
        super();
        this.starBody =starBody;
        this.top = top;
        this.area=getArea();
        this.circumference=getCircumference();
    }

    @Override
    public double getArea() {
        return ((this.top.getArea()*4)+ this.starBody.getArea());
    }

    @Override
    public double getCircumference() {
        return (this.top.getCircumference()*4)-(this.top.getLength()*4);
    }
}
