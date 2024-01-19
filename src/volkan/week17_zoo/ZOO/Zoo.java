package volkan.week17_zoo.ZOO;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String name;
    private int gruendungsjahr;
    private List<Gehege> gehege;

    public Zoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.gehege = new ArrayList<>();
    }

    public void addGehege(Gehege gehege) {
        this.gehege.add(gehege);
    }

    public void removeGehege(Gehege gehege) {
        this.gehege.remove(gehege);
    }

    @Override
    public String toString() {
        return "├── Zoo: " + this.name + ", gegründet " + this.gruendungsjahr + "\n" +
                "│   ├── Gehege: " + this.gehege.get(0).getName() + "\n" +
                "│   ├── Gehege: " + this.gehege.get(1).getName() + "\n" +
                "│   └── Gehege: " + this.gehege.get(2).getName();
    }
}
