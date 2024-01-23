package Matthias.week18_Zoo.Zoo4_Personal;
import java.util.ArrayList;

public class Pfleger {
    private String name;

    private ArrayList<Gehege> zustaendigFuerGehege;

    public Pfleger( String name){

        this.name=name;
        this.zustaendigFuerGehege=new ArrayList<>(  );
    }

    public ArrayList<Gehege> getZustaendigFuerGehege() {
        return zustaendigFuerGehege;
    }

    public String getName() {
        return name;
    }

    public void verantworlichFuerGehege( Gehege gehege ){
        this.zustaendigFuerGehege.add( gehege );
    }
}
