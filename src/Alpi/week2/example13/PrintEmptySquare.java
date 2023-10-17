package Alpi.week2.example13;


/*


 */
public class PrintEmptySquare {


    public static void main(String[] args) {

        printEmptySquare('x', 10);
        System.out.println();
        System.out.println();
        printEmptySquare('A', 3);
    }

    static void printEmptySquare(char value, int size) {

        for (int i = 0; i < size; i++) {
            System.out.print(value);
        }
        System.out.println();

        for (int i = 0; i < size - 2 ; i++) {
            for (int j = 0; j < size; j++) {

                if (j == 0){
                    System.out.print(value);
                } else if (j == size - 1) {
                    System.out.print(value);
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }


        for (int i = 0; i < size; i++) {
            System.out.print(value);
        }
    }
}
