package claudia.week22_Carsimulation;

public class Werkstatt {
    private String werkstattName;

    public Werkstatt(String tsname){
        this.werkstattName = tsname;
    }
    public void motorTauschen(Auto a, Motor m){
        System.out.println("\n" + a + " erhält neuen " + m);
        a.setMotor(m);
    }
    public void tankTauschen(Auto a, Tank t){
        System.out.println("\n" + a + " erhält neuen " + t);
        a.setTank(t);
    }
    public void motorReparieren(Auto a){
        System.out.println("\n" + a.getMotor().toString() + " wird repariert.");
        a.getMotor().reparieren();
    }
    @Override
    public String toString(){
        return "Werkstatt " + this.werkstattName;
    }
}
