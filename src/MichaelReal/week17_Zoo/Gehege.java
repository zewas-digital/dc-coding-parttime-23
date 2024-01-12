package MichaelReal.week17_Zoo;

public class Gehege {
    private String name;
    private String habitat;

    public Gehege(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Gehege" +
                "\n Name" + name +
                "\n Habitat" + habitat;
    }

    public void add(Gehege gehege) {
    }
}
