package Simonsway.Week15;

public class Speicherkarte {

   private Kamera kamera;

   private Model model;

   private double speicherplatz;

   private int counter;

   public Speicherkarte(Kamera kamera) {
      this.kamera = kamera;
   }

   public void berechneSpeicherplatz() {
      double megapixel = model.getMegapixel();
      speicherplatz = megapixel * 0.3;
       System.out.println("Speicherplatz pro Bild: " + speicherplatz + " MB");
       System.out.println(megapixel);
   }

}
