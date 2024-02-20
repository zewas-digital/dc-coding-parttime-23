package claudia.claudia.museum;

public class WalkmanHire {
    static int pool;
    static int helpers;
    public static void main(String[] args) {
        if (args.length >= 1)
            pool = Integer.parseInt(args[0]);
        else pool = 50;

        Museum m = new Museum(pool);

        if (args.length >= 2)
            helpers = Integer.parseInt(args[1]);
        else helpers = 3;

        for (int i = 0; i < helpers; i++)
            new Counter(m, i).start();
    }
}
