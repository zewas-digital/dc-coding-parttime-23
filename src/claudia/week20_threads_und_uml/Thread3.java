package claudia.week20_threads_und_uml;

import java.util.List;

public class Thread3 extends Thread {
    private String name;
    private List<String> list;

    public Thread3(String name, List<String> list) {
        this.name = name;
        this.list = list;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            list.add(this.name);
            System.out.println(this.name);
        }
    }
}
