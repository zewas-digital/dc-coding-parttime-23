package judith.week20.Schwarzwaldklinik;

public class Main {


    public static void main(String[] args) {

        //Krankenhaus anlage
        Hospital schwKlinik = new Hospital("Schwarzwaldklinik");

        System.out.println("Hospital:" );
        System.out.println(schwKlinik.getHpName());

        //Abteilungsanlage

        Department ime = new Department("Innere Medizin");
        Department unf = new Department("Unfallchirurgie");
        Department nch = new Department("Neurochirurgie");

        System.out.println("  " + "Departments:");
        System.out.println(" ".repeat(4) + ime.departmentName);
        System.out.println(" ".repeat(4) + unf.departmentName);
        System.out.println(" ".repeat(4) + nch.departmentName);

        //Abteilung dem KH zuordnen
        schwKlinik.addDepartment(ime);
        schwKlinik.addDepartment(unf);
        schwKlinik.addDepartment(nch);

        //Stationen anlegen
        Station ime1 = new Station("Innere Medizin", "Innere Medizin 1");
        Station ime2 = new Station("Innere Medizin", "Innere Medizin 2");
        Station ime3 = new Station("Innere Medizin", "Innere Medizin 3");

        Station unf1 = new Station("Unfallchirurgie", "Unfall 1");
        Station unf2 = new Station("Unfallchirurgie", "Unfall 2");

        Station nch1 = new Station("Neurochirurgie", "Nechir 1");
        Station nch2 = new Station("Neurochirurgie", "Nechir 2");


        System.out.println("  " + "Stations:");
        System.out.println(" ".repeat(8) + ime1.getStationName());
        System.out.println(" ".repeat(8) + ime2.getStationName());
        System.out.println(" ".repeat(8) + ime3.getStationName());
        System.out.println(" ".repeat(8) + unf1.getStationName());
        System.out.println(" ".repeat(8) + unf2.getStationName());
        System.out.println(" ".repeat(8) + nch1.getStationName());
        System.out.println(" ".repeat(8) + nch2.getStationName());

        //Stationen den Abteilungen zuordnen
        ime.addStation(ime1);
        ime.addStation(ime2);
        ime.addStation(ime3);

        unf.addStation(unf1);
        unf.addStation(unf2);

        nch.addStation(nch1);
        nch.addStation(nch2);


        //Zimmer anlegen
        Room imeZi1 = new Room("101");
        Room imeZi2 = new Room("102");
        Room imeZi3 = new Room("103");


        Room unfZi1 = new Room("101");
        Room unfZi2 = new Room("102");
        Room unfZi3 = new Room("103");

        Room nchZi1 = new Room("101");
        Room nchZi2 = new Room("102");
        Room nchZi3 = new Room("103");


        //Zimmer einer Station zuordnen
        ime1.addRoom(imeZi1);
        ime2.addRoom(imeZi2);
        ime3.addRoom(imeZi3);

        unf1.addRoom(unfZi1);
        unf2.addRoom(unfZi2);
        unf2.addRoom(unfZi3);

        nch1.addRoom(nchZi1);
        nch1.addRoom(nchZi2);
        nch2.addRoom(nchZi3);


        //Betten anlegen
        Bed imeBed1 = new Bed("10");
        Bed imeBed2 = new Bed("11");
        Bed imeBed3 = new Bed("12");

        Bed unfBed1 = new Bed("10");
        Bed unfBed2 = new Bed("11");
        Bed unfBed3 = new Bed("12");

        Bed nchBed1 = new Bed("10");
        Bed nchBed2 = new Bed("11");
        Bed nchBed3 = new Bed("12");



        // Bett einem Zimmer zuordnen
        imeZi1.addBed(imeBed1);
        imeZi2.addBed(imeBed2);
        imeZi3.addBed(imeBed3);

        unfZi1.addBed(unfBed1);
        unfZi2.addBed(unfBed2);
        unfZi3.addBed(unfBed3);

        nchZi1.addBed(nchBed1);
        nchZi2.addBed(nchBed2);
        nchZi3.addBed(nchBed3);

        //Ambulanzen angelegt
        Ambulance ambIme1 = new Ambulance("Innere Medizin", "Innere Ambulanz 1", "09 - 12 Uhr");
        Ambulance ambIme2 = new Ambulance("Innere Medizin", "Innere Ambulanz 2", "06 - 18 Uhr");
        Ambulance ambIme3 = new Ambulance("Innere Medizin", "Innere Ambulanz 2", "15 - 20 Uhr");


        Ambulance ambUnf1 = new Ambulance("Unfallchirurgie", "Unfall Ambulanz 1","06 - 22 Uhr ");
        Ambulance ambUnf2 = new Ambulance("Unfallchirurgie", "Unfall Ambulanz 2","09- 18 Uhr");

        Ambulance ambNch1 = new Ambulance("Neurochirurgie", "Neurochir. Ambulanz 1", "08 - 14 Uhr");
        Ambulance ambNch2 = new Ambulance("Neurochirurgie", "Neurochir. Ambulanz 2", "16 - 20 Uhr ");



        //Ambulanzen den Abteilungen zugeordnet

        ime1.addAmbulance(ambIme1);
        ime2.addAmbulance(ambIme2);
        ime3.addAmbulance(ambIme3);

        unf1.addAmbulance(ambUnf1);
        unf2.addAmbulance(ambUnf2);

        nch1.addAmbulance(ambNch1);
        nch2.addAmbulance(ambNch2);

        System.out.println(nch);







    }
}
