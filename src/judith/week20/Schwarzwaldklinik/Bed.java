package judith.week20.Schwarzwaldklinik;

public class Bed {

    //Attribute

    public String bedNumber;

    public Bed(String bedNumber) {
        this.bedNumber = bedNumber;
    }


    public String toString() {
        return "Bed number: " + this.bedNumber;
    }

}
