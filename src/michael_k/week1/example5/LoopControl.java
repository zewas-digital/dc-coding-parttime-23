package solutions.michael_k.week1.example5;

/*
Schreibe ein Programm das im Bereich von 1-100 Zahlen die durch zwei oder durch drei teilbar sind ausgeben.
Beende die Schleife, wenn 20 Zahlen ausgegeben wurden dann mit der break; Anweisung.

 */

import solutions.michael_k.week1.example6.WhileLoop;

public class LoopControl {
    public static void main(String[] args){
        int j = 0;
        for(int i = 1; i < 100; i ++) {
            if(j == 20){
                break;}
            else if(i % 2 == 0){
                System.out.println(i);
                j++;}
            else if(i % 3 == 0){
                System.out.println(i);
                j++;}

            }
        }
    }



