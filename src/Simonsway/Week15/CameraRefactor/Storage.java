package Simonsway.Week15.CameraRefactor;

import Simonsway.Week15.Model;

public class Storage {

    Photo photo = new Photo();
    private int sdCard;
    public void setSdCard(int sdCard) {
        this.sdCard = sdCard;
    }
    public int getSdCard() {
        return sdCard;
    }


    public void calcStorage(double megaPixel, int photoCount) {
        double photoSize = megaPixel * 0.3;
        double totalPhotoCountSize = photoSize * photoCount;
        double sdCardSize = sdCard - totalPhotoCountSize;
        System.out.println("SD Card Space Left: " + sdCardSize);
    }

    public void calcSdCard() {
        if (sdCard == 32) {
            this.sdCard = 32000;
        } else if (sdCard == 64) {
            this.sdCard = 64000;
        } else if (sdCard == 128) {
            this.sdCard = 128000;
        }
    }

}
