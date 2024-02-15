package judith.week20.Schwarzwaldklinik;

public class Main {


    public static void main(String[] args) {


        Hospital schwKlinik = new Hospital("Schwarzwaldklinik");

        System.out.println("Hospital:" );
        System.out.println(schwKlinik.getHpName());

        Department ime = new Department("Innere Medizin");
        Department unf = new Department("Unfallchirurgie");
        Department nch = new Department("Neurochirurgie");

        System.out.println("  " + "Departments:");
        System.out.println(" ".repeat(4) + ime.departmentName);
        System.out.println(" ".repeat(4) + unf.departmentName);
        System.out.println(" ".repeat(4) + nch.departmentName);


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

        Room imezi1 = new Room("101");
        Room imezi2 = new Room("102");
        Room imezi3 = new Room("103");

        schwKlinik.addDepartment(ime);
        schwKlinik.addDepartment(unf);
        schwKlinik.addDepartment(nch);

        ime.addStation(ime1);
        ime.addStation(ime2);
        ime.addStation(ime3);

        ime1.addRoom(imezi1);
        ime2.addRoom(imezi2);
        ime3.addRoom(imezi3);


        System.out.println(schwKlinik);
        System.out.println(ime);
        System.out.println(ime1);
        System.out.println(imezi1);


        Bed bed1 = new Bed("10");
        Bed bed2 = new Bed("11");
        Bed bed3 = new Bed("12");


        imezi1.addBed(bed1);
        imezi2.addBed(bed2);
        imezi3.addBed(bed3);

        System.out.println(bed1);
        System.out.println(bed2);
        System.out.println(bed3);






    }
}
