package claudia.claudia.museum;

public class Museum {
    private static int totalNumberOfWalkmen;
    private static int cash;
    Museum (int totalNumber){
        totalNumberOfWalkmen = totalNumber;
        cash = 0;
    }
    synchronized void hire(int numberOfCounter, int numberOfWalkmenRequired){
        System.out.println("Counter " + numberOfCounter + " wants " + numberOfWalkmenRequired);
        while (totalNumberOfWalkmen < numberOfWalkmenRequired){
            try {
                wait();
            }
                catch (InterruptedException e){
                    throw new RuntimeException(e);
            }
        }
        totalNumberOfWalkmen -= numberOfWalkmenRequired;
        cash += numberOfWalkmenRequired;
        System.out.println("Counter " + numberOfCounter + " acquires " + numberOfWalkmenRequired);
        System.out.println("Pool status: " + "Deposits " + cash + " Total " + (totalNumberOfWalkmen +cash) + " Walkmen " + totalNumberOfWalkmen);
        notifyAll();
    }
    synchronized  void replace (int n){
        System.out.println("Replacing " + n);
        totalNumberOfWalkmen += n;
        cash -= n;
        notifyAll();
    }
}
