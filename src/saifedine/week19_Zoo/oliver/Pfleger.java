package saifedine.week19_Zoo.oliver;

import java.util.Vector;

public class Pfleger {
    private String name;

    public Vector<Gehege> zustaendigFuerGehege;

    public Pfleger(String name) {
        this.name = name;
        this.zustaendigFuerGehege = new Vector<>();
        System.out.println("pfleger hash "+ super.hashCode());
    }
    public String getId() {
        return Integer.toHexString(super.hashCode());
    }

    public String getName() {
        return name;
    }

    public void verantwortlichFuerGehege(Gehege gehege) {
        this.zustaendigFuerGehege.add(gehege);
    }
}










