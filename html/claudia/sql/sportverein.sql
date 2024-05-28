DROP DATABASE sportverein; /*löscht Datenbank*/
CREATE DATABASE sportverein;
USE sportverein;

CREATE TABLE Person (
    PersonID INTEGER NOT NULL AUTO_INCREMENT, /*IDENTITY(1,1),*/
    PersonName varchar (20),
    PRIMARY KEY (PersonID)
);

CREATE TABLE Geraet (
    GeraetID integer NOT NULL AUTO_INCREMENT,
    GeraetName varchar (20),
    PRIMARY KEY (GeraetID)
);

CREATE TABLE Sportart (
    SportartID integer NOT NULL AUTO_INCREMENT,
    SportartName varchar(20),
    PRIMARY KEY(SportartID)
);

CREATE TABLE Kurs (
    KursID integer NOT NULL AUTO_INCREMENT,
    SportartID integer NOT NULL,
    Datum date,
    PRIMARY KEY (KursID),
    FOREIGN KEY (SportartID) REFERENCES Sportart(SportartID)
   );


CREATE TABLE Ausleihe (
    AusleiheID integer NOT NULL AUTO_INCREMENT,
    PersonID integer NOT NULL,
    GeraetID integer NOT NULL,
    DatumVon date,
    DatumBis date,
    PRIMARY KEY (AusleiheID),
    FOREIGN KEY (PersonID) REFERENCES Person(PersonID),
    FOREIGN KEY (GeraetID) REFERENCES Geraet(GeraetID)
);

CREATE TABLE Trainer (
    PersonID integer NOT NULL,
    SportartID integer NOT NULL,
    CONSTRAINT PK_Trainer PRIMARY KEY (PersonID, SportartID),
    FOREIGN KEY(PersonID) REFERENCES Person(PersonID),
    FOREIGN KEY (SportartID) REFERENCES Sportart(SportartID)
);

CREATE TABLE Teilnehmer (
    KursID integer NOT NULL,
    PersonID integer NOT NULL,
    Rolle varchar(20) NOT NULL,
    FOREIGN KEY (KursID) REFERENCES Kurs(KursID),
    FOREIGN KEY(PersonID) REFERENCES Person(PersonID),
    CONSTRAINT PK_Teilnehmer PRIMARY KEY (KursID, PersonID)
);

INSERT INTO Person (PersonName) VALUES ("Hansi");
INSERT INTO Person (PersonName) VALUES ("Olga");