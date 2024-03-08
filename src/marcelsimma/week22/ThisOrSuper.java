package marcelsimma.week22;

public class ThisOrSuper {
    public static void main(String args[]) {
        SubClass subClass = new SubClass();
        subClass.printX();
    }
}


abstract class AbstractClass {
    int x = 5;
}

class SubClass extends AbstractClass {

    int x = 10;
    public SubClass() {

    }
    void printX() {
        System.out.println(this.x); // Gibt 10 aus (Attribut der abgeleiteten Klasse)
        System.out.println(super.x); // Gibt 10 aus (Attribut der abgeleiteten Klasse)

    }
}

/*
In Java wird das Schlüsselwort this verwendet, um auf Instanzvariablen und Methoden in der aktuellen Klasse zu verweisen,
während super verwendet wird, um auf Instanzvariablen und Methoden der übergeordneten Klasse (der Klasse, von der die aktuelle Klasse erbt) zu verweisen.

Wenn du eine Variable in einer abgeleiteten Klasse ansprechen willst,
gibt es keinen Unterschied zwischen this.variableName und super.variableName,
wenn keine Variable in der abgeleiteten Klasse die gleiche Bezeichnung hat wie eine Variable in der übergeordneten Klasse.
 */