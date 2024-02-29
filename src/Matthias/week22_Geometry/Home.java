package Matthias.week22_Geometry;

public class Home extends Geometry {
    private Square buildingFloorPlans;
    private Triangle roof;

    public Home( Square buildingFloorPlans, Triangle roof){
        super();
        this.buildingFloorPlans =buildingFloorPlans;
        this.roof = roof;
        this.area=getArea();
        this.circumference=getCircumference();
    }

    @Override
    public double getArea() {
        return this.roof.getArea()+ this.buildingFloorPlans.getArea();
    }

    @Override
    public double getCircumference() {
        return (this.buildingFloorPlans.getCircumference( )-this.buildingFloorPlans.getLength()) + ( this.roof.circumference - this.roof.getLength());
    }
}
