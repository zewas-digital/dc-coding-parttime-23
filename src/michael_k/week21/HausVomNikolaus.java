package michael_k.week21;

public class HausVomNikolaus extends Geometrie{

    private double length;

    public HausVomNikolaus (double length){
        super();
        this.length = length;
        getArea ( );
        getCircumference ( );
    }

    public void getArea(){
        double h = Math.sqrt ( Math.pow ( length, 2 )-Math.pow ( length/2,2 ) );
        this.area = length*h/2;
        this.area = this.area+  length*length;
    }
    public void getCircumference(){
        this.circumference = length*5;
    }
}
