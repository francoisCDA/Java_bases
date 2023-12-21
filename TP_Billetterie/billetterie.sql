/********************************
		TP Billetterie
********************************/

DROP DATABASE IF EXISTS billetterie;

CREATE DATABASE IF NOT EXISTS billetterie;

USE billetterie;


CREATE TABLE lieu(
	id_lieu INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    adresse VARCHAR(200),
    capacite INT UNSIGNED
);

CREATE TABLE event(
	id_event INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    date_event DATETIME,
    lieu int REFERENCES lieu(id_lieu),
	prix DOUBLE
);

CREATE TABLE client(
	id_client INT AUTO_INCREMENT PRIMARY KEY,
    first VARCHAR(50),
    last VARCHAR(50),
    email VARCHAR(100) UNIQUE
);

CREATE TABLE billet(
	id_billet INT AUTO_INCREMENT PRIMARY KEY,
    event_id INT REFERENCES event(id_event),
    client_id INT REFERENCES client(id_client),
    cancel BOOLEAN DEFAULT FALSE
);

SELECT * FROM lieu;



