package claudia.claudia.museum;

import java.util.Random;

public class Counter extends Thread{
    private Museum museum;
    private int sequentialNumberOfCounter;

    Counter (Museum m, int numberOfCounter){
        this.museum = m;
        this.sequentialNumberOfCounter = numberOfCounter;
    }
    public void run(){
       while (true){
            Random random = new Random();
            int numberOfWalkmenToBeHired = random.nextInt(7) + 1;

            museum.hire(sequentialNumberOfCounter, numberOfWalkmenToBeHired);

            new Visitors(museum, numberOfWalkmenToBeHired).start();

            try{

                sleep((int) (Math.random() * 10000) + 1);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}


