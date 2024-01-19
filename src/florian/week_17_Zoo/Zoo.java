package florian.week_17_Zoo;



import java.util.ArrayList;

public class Zoo {

    public String name;

    private final int gruendungsJahr;

    public Gehege gehege;

    public Tiere tiere;

    public Zoo(String name, int gruendungsJahr, Gehege gehege, Tiere tiere) {
        this.name = name;
        this.gruendungsJahr = gruendungsJahr;
        this.gehege = gehege;
        this.tiere = tiere;
    }

    public ArrayList<String> gehegeArrayList = new ArrayList<>();

    public void formatGehege() {


        for ( String s : gehegeArrayList) {
            System.out.println("│\t├── " + "Gehegename: " + s );
            for (Tiere t : gehege.getListeDerTiere()){
                System.out.println("│       ├── " + t);
            }

        }


    }


    public String toString() {


        return "├── Zoo: " + name +
                ", Gründungsjahr: " + gruendungsJahr +
                gehege +
                tiere;

    }

}
