package saifedine.week21.oliver_Zoo_Threads;

public class ThreadTier extends Thread {
    Tier tier;
    Gehege gehege;

    ThreadTier(Tier tier, Gehege gehege) {
        this.tier = tier;
        this.gehege = gehege;
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.print("T-"+ this.tier.getName().charAt(0)+"*|");
            this.tier.streunt(this.gehege);

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
