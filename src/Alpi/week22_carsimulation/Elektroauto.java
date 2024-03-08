package Alpi.week22_carsimulation;

public class Elektroauto extends Auto {

    public Elektroauto(String hersteller, String modell, double kmStand, String tankname, double verbrauch, String motorname) {
        //Verbrauch in Prozent Ladung pro 100 km
        super(hersteller, modell, kmStand, new Akku(tankname), new Motor(verbrauch, Antriebsarten.STROM, motorname));
   }

  public double fahren(double strecke, char x)  {
      double restlicheStrecke = strecke;
      boolean counter = true;
      //double streckeProProzent = 100 / super.getMotor().getVerbrauch();

      System.out.println("\nDas Auto ("+ x +") " + super.getHersteller() + " " + super.getModell() + " muss " + strecke + " km fahren.");
      //System.out.println("Aktuelle Akkuladung " + getTankAktuellFormatiert());

      while (restlicheStrecke > 0  && super.getTank().getTankAktuell() > 0) {

          super.setKmStand(super.getKmStand() + 1);
          super.getTank().setTankAktuell(super.getTank().getTankAktuell() - this.getMotor().getVerbrauch()/100.0);
          restlicheStrecke -= 1;
          counter = !counter;
          if (counter) {System.out.print(x + " ");
          try {
              Thread.sleep(120);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }}

      }

      if (super.getTank().getTankAktuell() < 5)
          System.out.println("\nAchtung - Tank fast leer! Rest: " + getTankAktuellFormatiert() + "\n");
      if (restlicheStrecke > 0) System.out.println("Nicht genug Treibstoff für die restlichen " + restlicheStrecke + " km.");
      return restlicheStrecke;
  }


    @Override
    public String toString() {
        return "Elektroauto " + super.getHersteller() + " " + super.getModell();

    }
    public String getTankAktuellFormatiert() { //fragt aktuellen Wert ab und gibt ihn formatiert zurück
        return super.getTank().getTankAktuell() + " %";
    }

}
