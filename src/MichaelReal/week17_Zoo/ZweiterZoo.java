package MichaelReal.week17_Zoo;


public class ZweiterZoo extends ZooZoo {

    public ZweiterZoo(String name, int foundingYear) {
        super(name, foundingYear);
    }

    public static void main(String[] args) {
        ZweiterZoo zoo = new ZweiterZoo("Tiergarten Dornbirn", 2022);

            GehegeGehege gehege1 = new GehegeGehege("Alpenwiese");
            GehegeGehege gehege2 = new GehegeGehege("Ried");
            GehegeGehege gehege3 = new GehegeGehege("Terrarium (warm)");

                zoo.gehegeHizufuegen(gehege1);
                zoo.gehegeHizufuegen(gehege2);
                zoo.gehegeHizufuegen(gehege3);

            TierTier tier1 = new TierTier("Löwe");
            TierTier tier2 = new TierTier("Elefant");
            TierTier tier3 = new TierTier("Schlange");

                zoo.tierDemGehegeZuweisen(tier1,gehege1);
                zoo.tierDemGehegeZuweisen(tier2,gehege2);
                zoo.tierDemGehegeZuweisen(tier3,gehege3);

                zoo.futterZuweisen(tier1,"Fleisch");
                zoo.futterZuweisen(tier2,"Gras");
                zoo.futterZuweisen(tier3,"Mäuse");

                zoo.sauberAusgeben();
        }
    }



