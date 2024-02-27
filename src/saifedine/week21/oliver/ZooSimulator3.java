package saifedine.week21.oliver;

public class ZooSimulator3 {
    Zoo zoo;

    public ZooSimulator3(Zoo zoo) {
        this.zoo = zoo;
    }

    public void tagesSimulation(int anzahlTage) {
        for (int i = 1; i <= anzahlTage; i++) {
            System.out.println("\n+– Tag " + i + " " + "–".repeat(52) + "\n|");

            // alle Tiere beissen
            tiereBeissen();
            // alle Ärzte heilen
            aerzteHeilen();
        }
    }

    private void tiereBeissen() {
        for (Gehege gehege : this.zoo.gehege) {
            System.out.println("+– Gehege "+ gehege.bezeichnung +" "+ "–".repeat(10));

            for (Tier tier : gehege.getTiere()) {
                if (!tier.istLebendig())
                    continue;

                tier.streunt(gehege); // und beisst eventuell
            }
        }
    }

    private void aerzteHeilen() {
        //TODO
    }
}
