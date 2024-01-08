package claudia.week14_objects;

public class Person {//extends Object { //TODO wirklich notwendig "extends Object" zu schreiben?
    //Oliver behauptet ja, IntelliJ behauptet nein...
    public String name = "unbekannt";
    public int age; //Standardwert wenn ohne Belegung = 0
    public String alter;

    // Konstruktor wird beim Erzeugen der neuen Instanz mit new Person() aufgerufen
    public Person () {

    }
    public Person (String name) {
        this.name = name;
    }
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        //Konstruktor kann auch bereits Berechnungen vornehmen:
        this.alter = age + " Jahre";
    }

}