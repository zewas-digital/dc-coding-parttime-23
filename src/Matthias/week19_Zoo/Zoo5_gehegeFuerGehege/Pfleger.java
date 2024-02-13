package Matthias.week19_Zoo.Zoo5_gehegeFuerGehege;
import java.util.Vector;

public class Pfleger {
    private String name;

    private Vector<Gehege> zustaendigFuerGehege;

    public Pfleger( String name){

        this.name=name;
        this.zustaendigFuerGehege=new Vector<>(  );
    }

    public Vector<Gehege> getZustaendigFuerGehege() {
        return this.zustaendigFuerGehege;
    }

    public String getName() {
        return name;
    }

    public void verantworlichFuerGehege( Gehege gehege ){
        this.zustaendigFuerGehege.add( gehege );
    }

}
