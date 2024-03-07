package michael_k.week22;

abstract class Tank {

    public double tankinhalt;
    public double tankvolumen;

    public Tank(){}


    public void tanken(){
        tankinhalt = tankvolumen;
    }
}
