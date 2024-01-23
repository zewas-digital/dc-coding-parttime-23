package volkan.week17_zoo.ZOO;

public class Main {public static void main(String[] args) {

    // Initialisiere den Zoo
    Zoo zoo = new Zoo("Tiergarten Dornbirn", 2022);

    // Initialisiere die Gehege
    Gehege alpenwiese = new Gehege("Alpenwiese");
    Gehege ried = new Gehege("Ried");
    Gehege terrariumWarm = new Gehege("Terrarium (warm)");
    zoo.addGehege(alpenwiese);
    zoo.addGehege(ried);
    zoo.addGehege(terrariumWarm);

    // Gib den Zoo aus
    System.out.println(zoo.toString());
}
}
