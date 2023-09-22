package solutions.florian.week2.example13;


/*


 */
public class PrintEmptySquare {
    public static void main(String[] args) {
        printEmptySquare('x',10);
        printEmptySquare('A',3);
    }
    static void printEmptySquare(char value,int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0) {
                    System.out.print(value);
                } else if (j == 0) {
                    System.out.print(value);
                } else if (i == size -1) {
                    System.out.print(value);
                } else if (j == size -1) {
                    System.out.print(value);
                } else {
                    System.out.print(" ");
                }
            } System.out.println();
        }


    }

}

