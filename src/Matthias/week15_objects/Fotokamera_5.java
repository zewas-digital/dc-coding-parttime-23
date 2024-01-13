package Matthias.week15_objects;

public class Fotokamera_5 extends Object{

        //Festlegen der Attribute des Objektes
        private String hersteller;  // Herstellername der Kamera
        private String modell;      // Modelname der Kamera
        private int aufloesung;     // Auflösung der Kamera in MegaPixel

        public Objektiv_5 objektiv;

        public Speicherkarte_5 speicherkarte;

        //Definieren den Konstrukter -> dem Konstruktor werden die Attribute übergeben, die Inizial wichtig sind
        // diese beschreiben die Objekt instanz -> wird somit unterscheidbar
        // Es können verschiedene Konstruktoren, implementiert werden
        // im Konstruktor wird nur das Implementiert was für das Objekt WIRKLICH & INIZIAL RELEVANT IST!!!

        public Fotokamera_5( String Hersteller, String Modell, int aufloesung){
            this.hersteller =Hersteller;
            this.modell =Modell;
            this.aufloesung=aufloesung;
        }
        public void takePhoto(boolean Foto){
            if ( Foto ) {
                System.out.println( " ---------------------------------------------------------------\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        "|                                                           |\n" +
                        " ---------------------------------------------------------------\n" );
            }
        }

        //Getter und Setter der Instanzen

        //Getter 2: Holt sich die Aufloesung
        public int getAufloesung(){
            return this.aufloesung;
        }

        //Getter 3: Holt sich das Modell
        public String getModell(){
            return this.modell;
        }

        //Getter 4: HOlt sich den Hersteller
        public String getHersteller(){
            return this.hersteller;
        }

        //Setter 1: Setzt den Wert der Brennweite
        public void setHersteller(String hersteller){
            this.hersteller=hersteller;
        }

        //Setter 3: Setzt den Wert des Modelles
        public void setModell (String Modell){
            this.modell =Modell;
        }

        //Setter 4: setzt den Wert der Auflösung
        public void setAufloesung(int aufloesung){
            this.aufloesung=aufloesung;
        }

        //Setter 1: Setzt den Wert der Brennweite
         public void setObjektiv( Objektiv_5 Objektiv){

            this.objektiv=Objektiv;
        }

        public void setSpeicherkarte( Speicherkarte_5 Speicherkarte){
            this.speicherkarte=Speicherkarte;
        }


    //to String ist eine Rückgabe die für die Instanz einen unterscheidbaren Rückgabewert liefert
        @Override
        public String toString() {
            return "Foto { " + super.toString() + // super entspricht der erweiterten Object-Klasse
                    "\n Hersteller = " + hersteller +
                    ",\n Model = " + modell +
                    ",\n Auflösung = " + aufloesung +" in MegaPixel"+
                    ",\n Objektiv = " + objektiv.brennweite+" in mm"+
                    ",\n Speicherkarte = " + speicherkarte.megabyte+" in Megabyte"+
                    "\n}";
        }

    }
