package saifedine.week14_objects;

public class Object_0_Person {
    public static void main(String[] args) {

        Person Roger = new Person();

        // da oben nur die Methode public Person () aufrufen, muss der Name "Roger" und 30 im nachhinein hinzugefügt werden
        Roger.name = "Roger";
        Roger.age = 30;

        // int number = 7;
        String text = "tst";
        String sub = text.substring(1,3);
        char[] charray = {'t','e','s','t'};

        String text1 = new String(charray);
        System.out.println(text1);

        Person Peter = new Person("Peter", 22);
        Person Dirk = new Person();

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Roger.toString()
                +"\nDer Name der Person ist "+ Roger.name +" "+ Roger.age
        );

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Peter
                        +"\nDer Name der Person ist "+ Peter.name +" "+ Peter.alter
        );

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Dirk
                        +"\nDer Name der Person ist "+ Dirk.name +" "+ Dirk.age
        );
    }
}









