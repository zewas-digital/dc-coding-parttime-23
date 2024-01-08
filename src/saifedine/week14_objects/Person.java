package saifedine.week14_objects;

public class Person extends Object {
    // Attribute
    public String name = "unbekannt";
    public int age;
    public String alter;

    // Konstruktor wird beim Erzeugen der neuen Instanz mit new Person() aufgerufen
    public Person () {

    }
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        this.alter = age +" Jahre";
    }
}