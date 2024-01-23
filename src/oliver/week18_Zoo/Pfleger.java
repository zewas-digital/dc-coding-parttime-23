package oliver.week18_Zoo;

import java.util.Vector;

public class Pfleger {
    private String name;

    public Vector<Gehege> zustaendigFuerGehege;

    public Pfleger(String name) {
        this.name = name;
        this.zustaendigFuerGehege = new Vector<>();
    }

    public void verantwortlichFuerGehege(Gehege gehege) {
        this.zustaendigFuerGehege.add(gehege);
    }
}










