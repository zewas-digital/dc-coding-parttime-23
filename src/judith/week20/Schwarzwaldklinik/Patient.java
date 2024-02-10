package judith.week20.Schwarzwaldklinik;

public class Patient {

    //Attribute

    public String patName;
    public boolean prio1;
    public boolean genesen;
    public String diagnose;


    // Konstruktor
    public Patient(String patName, boolean prio1, boolean genesen, String diagnose) {
        this.patName = patName;
        this.prio1 = prio1;
        this.genesen = genesen;
        this.diagnose = diagnose;
    }


    // Methoden

    public void untersuchung(String patName){
        System.out.println("Patient " + patName + " wurde untersucht.");

    }

    public void behandeln(String patName){
        System.out.println("Patient " + patName + " wird behandelt.");

    }

    public void pflegen (String patName){
        System.out.println("Patient " + patName + "wird gepflegt");
    }

}
