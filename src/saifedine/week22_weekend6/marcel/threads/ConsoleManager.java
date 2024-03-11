package marcelsimma.week22.threads;

import java.util.Scanner;

class ConsoleManager {
    private final Scanner scanner = new Scanner(System.in);

    public synchronized void print(String message) {
        System.out.println(message);
    }

    public void doSmth() {
        synchronized (this) {
            System.out.println("ausgabe");

        }
    }

    public int readInt(String message) {
        //System.out.println("Hallo");
        synchronized (this) {
            System.out.print(message);
            return scanner.nextInt();
        }
    }

    /*

    In Java wird das Schlüsselwort synchronized verwendet,
    um die Synchronisierung von Threads zu steuern und kritische Abschnitte des Codes zu definieren,
    die nur von einem Thread gleichzeitig ausgeführt werden können. Es wird verwendet,
    um Dateninkonsistenzen und Wettlaufbedingungen zu vermeiden, die auftreten können,
    wenn mehrere Threads gleichzeitig auf gemeinsame Ressourcen zugreifen.

    In Java können zwei synchronisierte Methoden, die auf demselben Objekt ausgeführt werden, nicht gleichzeitig von unterschiedlichen Threads ausgeführt werden.
    Das Schlüsselwort synchronized sorgt dafür, dass nur ein Thread zu einem bestimmten Zeitpunkt auf synchronisierte Methoden oder Blöcke zugreifen kann.

    Wenn ein Thread eine synchronisierte Methode ausführt, sperrt er das Monitor-Objekt des Objekts,
    dem die Methode gehört. Andere Threads, die versuchen, auf synchronisierte Methoden desselben Objekts zuzugreifen,
    müssen warten, bis der erste Thread den Zugriff freigibt, indem er die Methode beendet oder den synchronisierten Block verlässt.

    */
}
