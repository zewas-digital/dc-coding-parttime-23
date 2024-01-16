package saifedine.week14_objects;

public class Object_0_Person {
    public static void main(String[] args) {

        Person Roger = new Person();

        // da oben nur die Methode public Person () aufrufen, muss der Name "Roger" und 30 im Nachhinein hinzugefügt werden
        Roger.name = "Roger";
        Roger.age = 30;

        String text = "tst";
        System.out.println(text.length());                                                                              // 3
        String sub = text.substring(1,3);                                                                               // beginIndex (1 = t) und endIndex (3 = t)
        System.out.println(sub + "\n");                                                                                 // st - da beginIndex exkludiert ist und endIndex inkludiert ist.


        char[] charray = {'t','e','s','t'};
        String text1 = new String(charray);
        System.out.println(text1 + "\n");                                                                               // test

        Person Peter = new Person("Peter", 22);
        Person Dirk = new Person();

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Roger.toString()                                             // Neues Objekt für eine Person erstellt: saifedine.week14_objects.Person@34a245ab
                +"\nDer Name der Person ist "+ Roger.name +" "+ Roger.age+ "\n"                                         // Der Name der Person ist Roger 30
        );

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Peter                                                        // Neues Objekt für eine Person erstellt: saifedine.week14_objects.Person@66a29884
                        +"\nDer Name der Person ist "+ Peter.name +" "+ Peter.alter+ "\n"                               // Der Name der Person ist Peter 22 Jahre
        );

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Dirk                                                         // Neues Objekt für eine Person erstellt: saifedine.week14_objects.Person@49097b5d
                        +"\nDer Name der Person ist "+ Dirk.name +" "+ Dirk.age                                         // Der Name der Person ist unbekannt 0
        );
    }
}









