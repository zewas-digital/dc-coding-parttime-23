DROP DATABASE sportverein2;
CREATE DATABASE sportverein2;
USE sportverein2;
CREATE TABLE Sportarten (
    sportID INT AUTO_INCREMENT,
    sportname VARCHAR(255) NOT NULL,
    PRIMARY KEY (sportID)
);
CREATE TABLE Sportgeraete (
    geraeteID INT AUTO_INCREMENT,
    geraetename VARCHAR(255) NOT NULL,
    anzahl INT NOT NULL,
    PRIMARY KEY (geraeteID)
);
CREATE TABLE Person (
    PersonID INT AUTO_INCREMENT,
    Vorname VARCHAR(255) NOT NULL,
    Adresse VARCHAR(255) NOT NULL,
    Email VARCHAR(255) NOT NULL,
    PRIMARY KEY (PersonID)
);
CREATE TABLE Kurs (
    KursID INT AUTO_INCREMENT,
    Kursname VARCHAR(255) NOT NULL,
    fk_sportarten_sportID INT NOT NULL,
    PRIMARY KEY (KursID),
    FOREIGN KEY (fk_sportarten_sportID) REFERENCES Sportarten(sportID)
);
CREATE TABLE Kursteilnahmen (
    fk_kurs_kursid INTEGER NOT NULL,
    fk_person_personenID INT NOT NULL,
    Status VARCHAR(255) NOT NULL,
    PRIMARY KEY (fk_kurs_kursid, fk_person_personenID)
);
CREATE TABLE Pruefen (
    fk_person_personenID INTEGER,
    fk_sportarten_sportID INTEGER,
    geprüft VARCHAR(255),
    PRIMARY KEY (fk_person_personenID, fk_sportarten_sportID)
);

CREATE TABLE Ausleihtabelle (
    fk_person_personenID INTEGER,
    id INTEGER AUTO_INCREMENT,
    fk_sportgeraete_geraeteID INTEGER,
    Ausgegeben date,
    Rueckgabedatum date,
    PRIMARY KEY (id),
    FOREIGN KEY (fk_person_personenID) REFERENCES Person(PersonID)
);

INSERT INTO Sportarten (sportname) VALUES ('Fußball');
INSERT INTO Sportarten (sportname) VALUES ('Volleyball');
INSERT INTO Person (Vorname, Adresse, Email) VALUES ('Sandra', 'Faerbergasse10', 'sandra@gmx.com');
INSERT INTO Person (Vorname, Adresse, Email) VALUES ('Alex', 'Faerberhof11', 'alex.a@gmx.com');
INSERT INTO Sportgeraete (geraetename, anzahl) VALUES ('Fahrrad', '2');
INSERT INTO Sportgeraete (geraetename, anzahl) VALUES ('Roller', '5');