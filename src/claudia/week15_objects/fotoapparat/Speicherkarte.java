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
    private static double memoryTotal; // in GB
    private double memoryFree; // in GB
    private int numberOfPhotosTaken = 0;

    public Speicherkarte(int size) {
        memoryTotal = size;
        memoryFree = size;
    }

    public double getMemoryTotal() {
        return memoryTotal;
    }

    public double getMemoryFree() {
        return memoryFree;
    }

    public void setMemoryFree(double memoryFree) {
        this.memoryFree = memoryFree;
    }

    public int getNumberOfPhotosTaken() {
        return numberOfPhotosTaken;
    }

    public void setNumberOfPhotosTaken(int n) {
        numberOfPhotosTaken = n;
    }


}
