package claudia.claudia.museum;

public class Counter extends Thread{
    Museum museum;
    int queue;
    Counter (Museum m, int q){
        museum = m;
        queue = q;
    }
    public void run(){
        while (true){
            int w = a(7);
            museum.hire(queue, w);
            new Visitors(museum, w).start();
            try{
                sleep(a(100));
            }
            catch(InterruptedException e){

            }
        }
    }
    static int a (int x){
        return (int) (Math.random() * x) + 1;
    }
}
