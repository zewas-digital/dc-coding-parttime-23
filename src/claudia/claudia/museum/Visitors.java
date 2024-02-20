package claudia.claudia.museum;

public class Visitors extends Thread{
    Museum museum;
    int groupSize;
    Visitors(Museum m, int w){
        museum = m;
        groupSize = w;
    }
    public void run(){
        try{
            sleep((int) (Math.random() * 1000) + 1);
        }
        catch (InterruptedException e){

        }
        museum.replace(groupSize);
    }
}
