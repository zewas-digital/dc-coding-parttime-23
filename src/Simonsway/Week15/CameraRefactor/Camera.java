package Simonsway.Week15.CameraRefactor;

public class Camera {
    public static void main(String[] args) {

        Model model1 = new Model();
        Storage storage1 = new Storage();
        Photo photo1 = new Photo();


        model1.setBrand("Nikon");
        model1.setModel(1);
        storage1.setSdCard(64);
        photo1.setPhotoCount(15);

        model1.calcModelMegaPixel();
        storage1.calcSdCard();

        System.out.println("Brand: " + model1.getBrand());
        System.out.println("Model: " + model1.getModel());
        System.out.println("Megapixel: " + model1.getMegapixel());
        System.out.println("SD Card MB: " + storage1.getSdCard());
        System.out.println("Photo Count: " + photo1.getPhotoCount());

        storage1.calcStorage(model1.getMegapixel(), photo1.getPhotoCount());

    }
}
