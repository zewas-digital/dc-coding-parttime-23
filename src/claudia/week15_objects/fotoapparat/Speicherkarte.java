package claudia.week15_objects.fotoapparat;
/*
Erstelle Methoden um zu erfragen, wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.
1 GB = 1024 MB = 2^30 Byte
1 MB = 1024 KB = 2^20 Byte
1 KB = 1024 Byte = 2^10 Byte
Speicherkarte normal: 2 GB
Speicherkarte High-Capacity: 32 GB
Speicherkarte Extended-Capacity: 128 GB
        */
public class Speicherkarte {
    private int size; // in GB
    private int numberOfPhotos = 0;

    public Speicherkarte(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfPhotos() {
        return numberOfPhotos;
    }

    public void setNumberOfPhotos(int n) {
        numberOfPhotos = n;
    }


}
