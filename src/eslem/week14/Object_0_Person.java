package eslem.week14;

public class Object_0_Person {
    public static void main(String[] args) {

        Person Nico = new Person();
        Nico.name = "Nico";
        Nico.age = 21;

        Person Lisa = new Person("Lisa", 19);
        Person Anna = new Person();

        System.out.println("Neues Objekt:" + Nico + "\nDie Person heißt " + Nico.name + " " + Nico.age);
        System.out.println("Neues Objekt:" + Lisa + "\nDie Person heißt " + Lisa.name + " " + Lisa.alter);
        System.out.println("Neues Objekt:" + Anna + "\nDie Person heißt " + Anna.name + " " + Anna.age);
    }
}









