package oliver.week14_objects;

public class Person extends Object {
    public String name = "unbekannt";

    // Konstruktor wird beim Erzeugen der neuen Instanz mit new Person() aufgerufen
    public Person () {

    }
    public Person (String name) {
        this.name = name;
    }

}