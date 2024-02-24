package claudia.claudia.museum;

public class Visitors extends Thread{
    Museum museum;
    int groupSize;
    Visitors(Museum m, int numberOfPeople){
        museum = m;
        groupSize = numberOfPeople;
    }
    public void run(){
        try{
            sleep((int) (Math.random() * 100000) + 1);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        museum.replace(groupSize);
    }
}
