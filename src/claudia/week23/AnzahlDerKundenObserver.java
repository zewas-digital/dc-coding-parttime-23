package claudia.week23;

public interface AnzahlDerKundenObserver {
    /*
    In Java können Sie eine Instanz einer Klasse beobachten, indem Sie das Observer Pattern verwenden. Dieses Muster ermöglicht es, Änderungen in einem Objekt zu verfolgen und andere Objekte darüber zu benachrichtigen. Hier ist, wie Sie es umsetzen können:

Das Observer Pattern:
Das Observer Pattern ist ein Verhaltensmuster, das eine one-to-many-Beziehung zwischen Objekten herstellt.
Ein Subject (das beobachtete Objekt) hält eine Liste von Observers (beobachtende Objekte) und benachrichtigt sie über Änderungen.
Die Observers registrieren sich beim Subject, um Benachrichtigungen zu erhalten.
Schritt-für-Schritt-Anleitung:
Erstellen Sie eine Klasse, die das zu beobachtende Attribut enthält (das Subject).
Erstellen Sie eine Schnittstelle oder eine abstrakte Klasse für die Observers.
Implementieren Sie die Observer-Klassen, die die Schnittstelle implementieren oder von der abstrakten Klasse erben.
Im Subject:
Halten Sie eine Liste der registrierten Observers.
Definieren Sie Methoden zum Hinzufügen, Entfernen und Benachrichtigen von Observers.
Bei Änderungen am Attribut rufen Sie die Benachrichtigungsmethode für alle registrierten Observers auf.
In den Observer-Klassen:
Implementieren Sie die Benachrichtigungsmethode, um auf Änderungen zu reagieren.
Beispiel: Angenommen, Sie haben eine Klasse StockMarket, die den Aktienkurs überwacht. Sie möchten, dass andere Klassen (z. B. Investor-Objekte) über Preisänderungen informiert werden:
Java

// Observer-Schnittstelle
interface StockObserver {
    void update(double price);
}

// StockMarket (Subject)
class StockMarket {
    private List<StockObserver> observers = new ArrayList<>();
    private double stockPrice;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void setStockPrice(double price) {
        stockPrice = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockPrice);
        }
    }
}

// Investor (Observer)
class Investor implements StockObserver {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " received update. Stock price: " + price);
    }
}

// Verwendung
public static void main(String[] args) {
    StockMarket market = new StockMarket();
    Investor investor1 = new Investor("Alice");
    Investor investor2 = new Investor("Bob");

    market.addObserver(investor1);
    market.addObserver(investor2);

    market.setStockPrice(100.0); // Änderung des Aktienkurses
}
KI-generierter Code. Überprüfen und sorgfältig verwenden. Weitere Informationen zu häufig gestellten Fragen.
Wenn der Aktienkurs geändert wird, werden sowohl Alice als auch Bob benachrichtigt.
     */
}
