package solutions.alpi.week1.weekend1.example26;

import java.util.Scanner;

public class Refactor{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Zahl2 = scanner.nextInt();
            Refactor('x', Zahl2);
        System.out.print("a1 Gib eine Ganzzahl (int) ein:  ");
        int intValue = scanner.nextInt();

        }
        static void Refactor (char value, int size) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(value);
                }
                System.out.println();
            }
        }

    }


