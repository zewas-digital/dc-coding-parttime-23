package florian.week_18_Futteraufgabe;

public class Futter {

        public String name;
        public int menge;

        public Futter (String name, int menge){
            this.name = name;
            this.menge= menge;
        }
    @Override
        public String toString(){
            return "Futter: " + this.name;
        }




}
