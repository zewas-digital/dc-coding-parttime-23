package saifedine.week14_objects;

public class Person extends Object {
    // Attribute
    public String name = "unbekannt";
    public int age;                                     // 0
    public String alter;                                // null

    // Konstruktor wird beim Erzeugen der neuen Instanz mit new Person() aufgerufen
    public Person () {

    }
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        this.alter = age +" Jahre";
    }
}