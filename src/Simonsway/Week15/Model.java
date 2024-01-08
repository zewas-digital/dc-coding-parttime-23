package Simonsway.Week15;

public class Model {

    String model;

    int MegaPixel;

    private Kamera kamera;

    public Model(Kamera kamera){
        this.kamera = kamera;
    }

    public void nikonD750(){
        MegaPixel = 24;
    }

    public void nikonD850(){
        MegaPixel = 24;
    }

    public double getMegapixel() {
        return MegaPixel;
    }
}
