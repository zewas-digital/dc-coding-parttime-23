package Alpi.week17_Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo Zoo = new Zoo("Tiergarten Dornbirn ", 2022);

        /*
        Gehege Gehege = new Gehege ("Alpenwiese");
         */


        //Array erstellen

        String[] Gehege  = new String [3];

        // Array [] Gehege = {"Alpenwiese", "Ried", "Terrarium"}



        //Befülltes Array

        Gehege[0] = "Gehege: Alpenwiese";
        Gehege[1] = "Gehege: Ried";
        Gehege[2] = "Gehege: Terrarium";


        for (int i = 0; i < Gehege.length; i++) {
            System.out.println(Gehege[i]);
        }





    }




}
