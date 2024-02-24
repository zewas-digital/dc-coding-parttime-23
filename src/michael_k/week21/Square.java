package michael_k.week21;

public class Square extends Geometrie{

    private double length;
    public Square (double length){
        //super();
        this.length = length;
        getArea ( );
        getCircumference ( );
    }

    public void getArea(){
        this.area = length*length;
    }
    public void getCircumference(){
        this.circumference = length*4;
    }
}
