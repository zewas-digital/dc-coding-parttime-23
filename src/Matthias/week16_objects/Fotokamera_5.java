package Matthias.week16_objects;

public class Fotokamera_5 extends Object{

        //Festlegen der Attribute des Objektes
        private String hersteller;  // Herstellername der Kamera
        private String modell;      // Modelname der Kamera
        private int aufloesung;     // Auflösung der Kamera in MegaPixel
        private double sizeFoto;    // groeße eines Fotos
         private Objektiv_5 objektiv;  // Datentype Objektiv_5 -> deklarier das objektiv

        public Speicherkarte_5 speicherkarte;

        //Definieren den Konstrukter -> dem Konstruktor werden die Attribute übergeben, die Inizial wichtig sind
        // diese beschreiben die Objekt instanz -> wird somit unterscheidbar
        // Es können verschiedene Konstruktoren, implementiert werden
        // im Konstruktor wird nur das Implementiert was für das Objekt WIRKLICH & INIZIAL RELEVANT IST!!!

        public Fotokamera_5( String Hersteller, String Modell, int aufloesung){
            this.hersteller =Hersteller;
            this.modell =Modell;
            this.aufloesung=aufloesung;
            this.sizeFoto=this.aufloesung*0.3;
        }

        public void takePhoto(boolean Foto){
            if ( Foto ) {
                if (this.speicherkarte.getSpeicherplatzStatus() + sizeFoto < speicherkarte.SpeicherplatzMax) {
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
                this.speicherkarte.setSpeicherplatzStatus( this.speicherkarte.getSpeicherplatzStatus()+ sizeFoto );
                this.speicherkarte.setAnzahlderFotos( this.speicherkarte.getAnzahlderFotos()+1 );
                }else {
                    System.out.println("Speicherplatz voll!!!!" );
                }

            }
        }

        //Getter und Setter der Instanzen

        //Getter 1: Holt sich die Aufloesung
        public int getAufloesung(){
            return this.aufloesung;
        }

        //Getter 2: Holt sich das Modell
        public String getModell(){
            return this.modell;
        }

        //Getter 3: Holt sich den Hersteller
        public String getHersteller(){
            return this.hersteller;
        }

        //Setter 1: Setzt den Wert der Brennweite
        public void setHersteller(String hersteller){
            this.hersteller=hersteller;
        }

        //Setter 2: Setzt den Wert des Modelles
        public void setModell (String Modell){
            this.modell =Modell;
        }

        //Setter 3: Setzt den Wert der Auflösung
        public void setAufloesung(int aufloesung){
            this.aufloesung=aufloesung;
        }

        // Setter 4: Übergibt das Objektiv der Fotokamera
         public void setObjektiv( Objektiv_5 Objektiv){

            this.objektiv=Objektiv;
        }
        public Objektiv_5 getObjektiv() {
            return objektiv;
        }

        public Speicherkarte_5 getSpeicherkarte() {
            return speicherkarte;
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
                    ",\n Speicherkarte = " + speicherkarte.SpeicherplatzMax +" in Megabyte"+
                    "\n}";
        }

    }
