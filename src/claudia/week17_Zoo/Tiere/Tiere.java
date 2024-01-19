package claudia.week17_Zoo.Tiere;

import claudia.week17_Zoo.Futter;

public interface Tiere {
    public void feed();

    String getName();
    String getArt();
    Futter getFutter();
    double getMengeInEinheit();
}
