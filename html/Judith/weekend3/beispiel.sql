CREATE DATABASE datenbank1;
USE datenbank1;

/*"NOT NULL" - Wert muss befüllt sein / varchar(4) kann maximal 4 Zeichen lang sein
Foreigin Key = Fremdschlüssel/ References - referenziert auf die Liste.../
CONSTRAINT - definiert Regeln innerhalb der Datenbank
DROP DATABASE datenbank1; - Löscht die Datenbank Namens "datenbank1"
*/

CREATE DATABASE datenbank1;
USE datenbank1;
CREATE TABLE Kunde (
    Kundennummer integer NOT NULL AUTO_INCREMENT,
    Nachname varchar (20),
    Vorname varchar (20),
    PLZ char (4),
    Ort varchar (20),
    Strasse varchar (20),
    PRIMARY KEY (Kundennummer)
);
CREATE TABLE Artikel (
    Artikelnummer integer NOT NULL,
    Artikelname varchar (20),
    Einzelpreis float,
    PRIMARY KEY (Artikelnummer)
);
CREATE TABLE Rechnung (
    Rechnungsnummer integer NOT NULL AUTO_INCREMENT,
    Datum date,
    Kundennummer integer,
    PRIMARY KEY (Rechnungsnummer),
    FOREIGN KEY (Kundennummer) REFERENCES Kunde(Kundennummer)
);
CREATE TABLE Bestellung (
    Rechnungsnummer integer NOT NULL,
    Position integer NOT NULL,
    Artikelnummer integer,
    Einzelpreis float,
    Anzahl integer,
    CONSTRAINT PK_Bestellung PRIMARY KEY (Rechnungsnummer, Position),
    FOREIGN KEY (Artikelnummer) REFERENCES Artikel(Artikelnummer),
    FOREIGN KEY (Rechnungsnummer) REFERENCES Rechnung(Rechnungsnummer)
);