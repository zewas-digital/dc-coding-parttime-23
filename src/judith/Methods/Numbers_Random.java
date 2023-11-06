package judith.Methods;

import java.util.Random;

public class Numbers_Random {

    public static Random rand = new Random();

    public static int[][] createRandom2dArray(int xLength, int yLength) {
        int[][] numbers = new int[xLength][yLength];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rand.nextInt(100);
            }
        }


        return numbers;
    }
}

