package marcelsimma.week22.thisorsuper;

import marcelsimma.week22.thisorsuper.AbstractClass;

class SubClass extends AbstractClass {

    int x = 10;
    public SubClass() {

    }

    void print2() {
        this.printX();
        super.printX();
    }

    @Override
    void printX() {
        System.out.println(this.x); // Gibt 10 aus (Attribut der abgeleiteten Klasse)
        System.out.println(super.x); // Gibt 10 aus (Attribut der abgeleiteten Klasse)
    }
}
