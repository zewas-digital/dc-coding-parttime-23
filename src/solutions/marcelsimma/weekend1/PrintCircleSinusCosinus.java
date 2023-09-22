package solutions.marcelsimma.weekend1;

public class PrintCircleSinusCosinus {
    public static void main(String[] args) {
        int size = 25;
        int center = size/2;

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (Math.pow(((x-center)*(x-center)+(y-center)*(y-center)), 0.5) == center ) {
                    System.out.print("***");

                } else {
                    System.out.print("---");
                }
            }
            System.out.println();
        }
    }
}
