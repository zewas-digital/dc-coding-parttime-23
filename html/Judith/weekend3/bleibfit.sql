CREATE DATABASE bleibfit;
USE bleibfit;
CREATE TABLE Sportart (
    Sportnummer integer NOT NULL,
    Sportname varchar (20),
    Beschreibung varchar (40),
    PRIMARY KEY (Sportnummer)
);
CREATE TABLE Geprueft (
    geprüft date  ,
    Personnummer integer,
    Sportnummer integer,
    PRIMARY KEY (Personnummer, Sportnummer)
);
CREATE TABLE Kurse (
    Kursnummer integer NOT NULL,
    Kursname varchar (20),
    Sportnummer integer,
    PRIMARY KEY (Kursnummer)
);
CREATE TABLE Person (
    Personnummer integer NOT NULL,
    Name varchar (20),
    Adresse varchar(40),
    PRIMARY KEY (Personnummer)
);
CREATE TABLE Sportgeraet (
    Sportgeraetenummer integer NOT NULL,
    Sportgeraetename varchar (20),
    Anzahl integer,
    PRIMARY KEY (Sportgeraetenummer)
);
CREATE TABLE Ausleihtabelle (
    Personnummer integer NOT NULL,
    Ausgbedatum date,
    Eingangsdatum date,
    Sportgeraetenummer integer,
    ID integer,
    PRIMARY KEY (Kursnummer)
);


