package michael_k.week22;

public class Gasstation {
    public String name;
    public Gasstation (String name){
        this.name = name;
    }

    public void tanken(Tank tank){
        tank.tanken ();
    }
}
