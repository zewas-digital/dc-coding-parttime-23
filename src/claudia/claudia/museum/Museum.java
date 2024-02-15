package claudia.claudia.museum;

public class Museum {
    private static int walkmen;
    private static int cash;
    Museum (int w){
        walkmen = w;
        cash = 0;
    }
    synchronized void hire(int c, int n){
        System.out.println("Counter " + c + " wants " + n);
        while (walkmen < n){
            try {
                wait();
            }
                catch (InterruptedException e){
            }
        }
        walkmen -= n;
        cash += n;
        System.out.println("Counter " + c + " acquires " + n);
        System.out.println("Pool status: " + "Deposits " + cash + " Total " + (walkmen+cash) + " Walkmen " + walkmen);
        notifyAll();
    }
    synchronized  void replace (int n){
        System.out.println("Replacing " + n);
        walkmen += n;
        cash -= n;
        notifyAll();
    }
}
