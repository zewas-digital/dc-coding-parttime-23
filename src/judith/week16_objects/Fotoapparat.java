package judith.week16_objects;

import java.sql.SQLOutput;

public class Fotoapparat {

        private String hersteller;
        private String model;
        private float megapixel;
        private int brennweite;

        public int fotoCounter = 0;
        float restSpeicher;

    /*
    public Fotoapparat(String hersteller, String model, float megapixel, int brennweite){

        this.hersteller = hersteller;
        this.model = model;
        this.megapixel = megapixel;
        this.brennweite = brennweite;
    }
     */

        public void setHersteller(String hersteller){
            this.hersteller = hersteller;
        }
        public String getHersteller(){return this.hersteller;}

        public void setModel(String model){
            this.model = model;
        }
        public String getModel(){return this.model;}

        public void setMegapixel(float megapixel){
            this.megapixel = megapixel;
        }
        public float getMegapixel(){return this.megapixel;}

        public void setBrennweite(int brennweite){
            this.brennweite = brennweite;
        }
        public int getBrennweite(){return this.brennweite;}

        public String toString(){

            return "Fotoapparat { " + super.toString() +
                    "\n Hersteller: " + hersteller +
                    "\n Model: " + model +
                    "\n Megapixel: " + megapixel +
                    "\n Brennweite: " + brennweite +
                    "\n}";
        }

        public void takePhoto(){
            System.out.println("Click, ein Foto wurde erstellt");
            fotoCounter++;
            //System.out.println("Sie haben " + fotoCounter + " Fotos gemacht");
        }


        Objektiv objektiv;
        public void verbindeObjektiv(Objektiv objektiv) {
            this.objektiv = objektiv;
        }

        Speicherkarte speicherkarte;

        public void speicherkarteEinsetzen(Speicherkarte speicherkarte){
            this.speicherkarte = speicherkarte;
        }


    public void gemachteFotosUndRestspeicher(){
        System.out.println("\n" + "Sie haben " + this.fotoCounter + " Fotos gemacht");
        //System.out.println("Der Speicher ist: " + this.speicherkarte.speicher);
        //System.out.println("Megapixel: " + this.megapixel);

        this.restSpeicher = (float) (this.speicherkarte.speicherkarte - (this.fotoCounter * (this.megapixel * 0.3)));

        System.out.println("Der Restspeicher beträgt: " + this.restSpeicher);
    }


}







