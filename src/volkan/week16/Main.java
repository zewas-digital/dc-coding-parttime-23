package volkan.week16;

public class Main {
    public static void main(String[] args) {
        // Teste die Fotoapparat-Klasse
        Fotoapparat fotoapparat1 = new Fotoapparat(24, 120, "Canon EOS 5D", "Canon", 30);
        Fotoapparat fotoapparat2 = new Fotoapparat(18, 55, "Nikon D750", "Nikon", 24);

        // Teste die Getter und Setter
        fotoapparat1.setBrennweiteMin(28);
        fotoapparat2.setMegapixel(36);

        // Teste die takePhoto()-Methode
        fotoapparat1.takePhoto();
        fotoapparat2.takePhoto();

        // Teste die toString()-Methode
        System.out.println(fotoapparat1.toString());
        System.out.println(fotoapparat2.toString());
    }
}
