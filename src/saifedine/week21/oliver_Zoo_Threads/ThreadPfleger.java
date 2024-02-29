package saifedine.week21.oliver_Zoo_Threads;

public class ThreadPfleger extends Thread {
    Pfleger pfleger;

    ThreadPfleger(Pfleger pfleger) {
        this.pfleger = pfleger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("P-"+ this.pfleger.getName().charAt(0)+".|");
            //TODO Pfleger führt eine Tätigkeit aus

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
