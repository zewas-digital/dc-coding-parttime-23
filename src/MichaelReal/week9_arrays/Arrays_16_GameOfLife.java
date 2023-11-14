package MichaelReal.week9_arrays;

/*
Bonus-Aufgabe: Conways Game of life

In der Aufgabe soll Conways Spiel des Lebens implementiert werden.

1. Die Spielregeln findest du hier: https://de.wikipedia.org/wiki/Conways_Spiel_des_Lebens#Die_Spielregeln

2. Als Ausgangsfeld verwende folgende 2D-Arrays GLEITER und SEGLER aus der externen Klasse
2.1 oliver.week9_arrays.GameOfLife.GLEITER
2.2 oliver.week9_arrays.GameOfLife.SEGLER
2.3 Ein zufällig generiertes Array
 */

public class Arrays_16_GameOfLife {
        public static void main(String[] args) throws InterruptedException {
            int rows = 50; // Ändere die Größe des Spielfelds nach Bedarf
            int cols = 50;
            int[][] currentGeneration = generateRandomField(rows, cols);
            //int[][] currentGeneration = GLEITER;
            //int[][] currentGeneration = SEGLER;

            while (true) {
                printField(currentGeneration);
                currentGeneration = calculateNextGeneration(currentGeneration);
                Thread.sleep(850); // Fügen eine Verzögerung hinzu, um die Animation zu verlangsamen
            }
        }

        public static int[][] calculateNextGeneration(int[][] currentGeneration) {
            int rows = currentGeneration.length;
            int cols = currentGeneration[0].length;
            int[][] nextGeneration = new int[rows][cols];

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    int neighbors = countLiveNeighbors(currentGeneration, row, col);

                    if (currentGeneration[row][col] == 1) {
                        // Lebende Zelle
                        if (neighbors == 2 || neighbors == 3) {
                            nextGeneration[row][col] = 1;
                        } else {
                            nextGeneration[row][col] = 0;
                        }
                    } else {
                        // Tote Zelle
                        if (neighbors == 3) {
                            nextGeneration[row][col] = 1;
                        } else {
                            nextGeneration[row][col] = 0;
                        }
                    }
                }
            }

            return nextGeneration;
        }

        public static int countLiveNeighbors(int[][] field, int row, int col) {
            int count = 0;
            int rows = field.length;
            int cols = field[0].length;

            int[][] neighbors = {
                    {-1, -1}, {-1, 0}, {-1, 1},
                    {0, -1},           {0, 1},
                    {1, -1}, {1, 0}, {1, 1}
            };

            for (int[] neighbor : neighbors) {
                int r = row + neighbor[0];
                int c = col + neighbor[1];
                if (r >= 0 && r < rows && c >= 0 && c < cols && field[r][c] == 1) {
                    count++;
                }
            }

            return count;
        }

        public static void printField(int[][] field) {
            for (int[] row : field) {
                for (int cell : row) {
                    if (cell == 1) {
                        System.out.print("🍑 "); // Lebende Zelle
                    } else {
                        System.out.print("  "); // Tote Zelle
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        public static int[][] generateRandomField(int rows, int cols) {
            int[][] field = new int[rows][cols];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    field[row][col] = Math.random() < 0.5 ? 0 : 1;
                }
            }
            return field;
        }

    public static final int[][] GLEITER = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    public static final int[][] SEGLER = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };
    }














































   /*     public static void main(String[] args) {
            int[][] initialField = generateRandomField(10, 10); // Ändern Sie die Größe des Spielfelds nach Bedarf
            //int[][] initialField = GLEITER;
            //int[][] initialField = SEGLER;

            // Simuliere eine Anzahl an Generationen
            for (int generation = 0; generation < 30; generation++) {
                initialField = calculateNextGeneration(initialField);
                printField(initialField);
            }
        }

        public static int[][] calculateNextGeneration(int[][] currentGeneration) {
            int rows = currentGeneration.length;
            int cols = currentGeneration[0].length;
            int[][] nextGeneration = new int[rows][cols];

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    int neighbors = countLiveNeighbors(currentGeneration, row, col);

                    if (currentGeneration[row][col] == 1) {
                        // Lebende Zelle
                        if (neighbors == 2 || neighbors == 3) {
                            nextGeneration[row][col] = 1;
                        } else {
                            nextGeneration[row][col] = 0;
                        }
                    } else {
                        // Tote Zelle
                        if (neighbors == 3) {
                            nextGeneration[row][col] = 1;
                        } else {
                            nextGeneration[row][col] = 0;
                        }
                    }
                }
            }

            return nextGeneration;
        }

        public static int countLiveNeighbors(int[][] field, int row, int col) {
            // Zähle die lebenden Nachbarn einer Zelle
            int count = 0;
            int rows = field.length;
            int cols = field[0].length;

            int[][] neighbors = {
                    {-1, -1}, {-1, 0}, {-1, 1},
                    {0, -1},           {0, 1},
                    {1, -1}, {1, 0}, {1, 1}
            };

            for (int[] neighbor : neighbors) {
                int r = row + neighbor[0];
                int c = col + neighbor[1];
                if (r >= 0 && r < rows && c >= 0 && c < cols && field[r][c] == 1) {
                    count++;
                }
            }

            return count;
        }

        public static void printField(int[][] field) {
            for (int[] row : field) {
                for (int cell : row) {
                    if (cell == 1) {
                        System.out.print("■ "); // Lebende Zelle
                    } else {
                        System.out.print("□ "); // Tote Zelle
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        public static int[][] generateRandomField(int rows, int cols) {
            int[][] field = new int[rows][cols];
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    field[row][col] = Math.random() < 0.5 ? 0 : 1; // Zufällig lebende oder tote Zellen
                }
            }
            return field;
        }

    public static final int[][] GLEITER = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    public static final int[][] SEGLER = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };
    }*/