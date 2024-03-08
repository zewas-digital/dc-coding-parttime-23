package Alpi.week22_carsimulation;

public class Tankstelle implements Tanken {

    private String tankstellenName;
    public Tankstelle(String tsName){
        this.tankstellenName = tsName;
    }

   public void ansteuern(Auto auto){
       System.out.println(auto + " fährt zu " + this + " zum Tanken.");
   }
    public void volltanken(Auto auto) {
        Antriebsarten art = auto.getMotor().antriebart;
        auto.getTank().tankfuellen();

        switch ( art ) {
            case STROM -> {
                System.out.println("\n" + auto + " wird vollgeladen.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            case DIESEL -> {
                System.out.println("\n" + auto + " wird vollgetankt.");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void tanken(Auto auto, double menge) {
        Antriebsarten art = auto.getMotor().antriebart;
        String einheit =
                (art == Antriebsarten.STROM) ? " %" : " Liter";
        System.out.println("Auftanken! Gewünschte Menge: " + menge + " " + einheit);

        if (menge > auto.getTank().getTankMax() - auto.getTank().getTankAktuell()) {
            System.out.println("Soviel passt nicht rein!");
            volltanken(auto);
        } else {
            auto.getTank().setTankAktuell(auto.getTank().getTankAktuell() + menge);
            switch ( art ) {
                case STROM -> {
                    System.out.println("\n" + auto + " wird geladen.");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                case DIESEL -> {
                    System.out.println("\n" + auto + " wird betankt.");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }


    }
    @Override
    public String toString(){
        return "Tankstelle " + this.tankstellenName;
    }
}
