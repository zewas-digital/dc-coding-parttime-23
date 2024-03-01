package MichaelReal.week22_CarsimultionExtended;

public class Engine {
    private boolean isFunctional;


    public Engine() {
        this.isFunctional = true;
    }

    public boolean isFunctional() {
        // Logik zur Überprüfung des Motors
        return isFunctional;
    }

    public void setFunctional(boolean functional) {
        isFunctional = functional;
    }
}
