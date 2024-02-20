package claudia.week20_threads_und_uml;

import claudia.week19_Zoo.BiteThread;

import java.util.List;
import java.util.Vector;

public class Multithreading3 {
    public static void main(String[] args) throws InterruptedException {
        Vector<String> list = new Vector<>(); //Thread safe

        Thread3 a = new Thread3("eins",  list);
        Thread3 b = new Thread3("zwei", list);
        Thread3 c = new Thread3("drei", list);

        a.start();
        b.start();
        c.start();

        a.join();
        b.join();
        c.join();

        System.out.println("Liste: " + list);

    }
}
