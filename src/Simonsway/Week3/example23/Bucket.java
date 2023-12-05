package solutions.Simon.example23;

public class Bucket {
    public static void main(String[] args) {
        String StringA = "a";
        String StringB = "b";
        String StringC = "c";

        StringA = StringC;
        StringB = StringA;
        StringA = StringB;

        System.out.println(StringA);
        System.out.println(StringB);
    }
}
