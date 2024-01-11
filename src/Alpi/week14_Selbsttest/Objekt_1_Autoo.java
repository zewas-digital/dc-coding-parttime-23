package Alpi.week14_Selbsttest;

public class Objekt_1_Autoo {

    public static void main(String[] args) {



        Auto1 Bmw = new Auto1();
        Bmw.marke = "BMW";
        Bmw.modell = "Alpina 550";
        Bmw.baujahr = 2022;
        Bmw.kilometerstand = 12500;




        Auto1 Opel = new Auto1("opel" , 2018 , "Vectra" , 25850);


        System.out.print(Opel.marke + " " + Opel.modell + " " + Opel.baujahr + " " + Opel.kilometerstand);

        System.out.println(Bmw.marke + " " + Bmw.modell + " " + Bmw.baujahr + " " + Bmw.kilometerstand);




    }


}
