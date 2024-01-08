package Simonsway.Week15.CameraRefactor;

public class Model {

    private int model;
    private String brand;
    private double megapixel;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {return brand;}
    public void setModel(int model) {
        this.model = model;
    }
    public int getModel() { return model; }
    public void setMegapixel(double megapixel) {
        this.megapixel = megapixel;
    }
    public double getMegapixel() {
        return megapixel;
    }

   public void calcModelMegaPixel() {
       if (model == 1){
           this.megapixel = 24.3;
       } else if (model == 2) {
           this.megapixel = 20.2;
       } else if (model == 3) {
           this.megapixel = 15.2;
       }
   }

}