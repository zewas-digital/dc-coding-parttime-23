
CREATE DATABASE datenbank;
USE datenbank;

CREATE TABLE Kunde(
    Kundennummer integer NOT NULL,
    Nachname varchar(20)
    Vorname varchar(20),
    Adresse varchar(20),
    Ort varchar(20),
    PLZ char (4)
    PRIMARY KEY (Kundennummer)
    );

CREATE TABLE Artikel(
    Artikelnummer integer NOT NULL,
    Artikel varchar(20),
    Einzelpreis float
    PRIMARY KEY (Artikelnummer)
);

CREATE TABLE Rechnung(
    Rechnungsnummer integer NOT NULL,
    Rechnungsdatum date,
    Kundennummer integer
    PRIMARY KEY(Rechnungsnummer)
    FOREIGN KEY(Kundennummer) REFERENCES Kunde(Kundennummer)
);

CREATE TABLE Bestellung(
    Rechnungsnummer integer NOT NULL,
    Position integer NOT NULL,
    Menge integer,
    Kaufpreis integer,
    Artikelnummer integer
    CONSTRAINT PK_Bestellung PRIMARY KEY(Rechnungsnummer,Position)
    FOREIGN KEY(Artikelnummer) REFERENCES Artikel(Artikelnummer)
    FOREIGN KEY(Rechnungsnummer) REFERENCES Rechnung(Rechnungsnummer)
);