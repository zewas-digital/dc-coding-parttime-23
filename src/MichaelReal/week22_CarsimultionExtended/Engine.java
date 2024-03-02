package MichaelReal.week22_CarsimultionExtended;

public class Engine {
    private boolean isFunctional;
    private int power;


    public Engine() {
        this.isFunctional = true;
        this.power = power;
    }


    public boolean isFunctional() {
        return isFunctional;
    }

    public void setFunctional(boolean functional) {
        isFunctional = functional;
    }

    public void repair() {
        this.isFunctional = true; // Setze den Zustand der Engine auf funktional
        System.out.println("Motor wurde repariert.");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
