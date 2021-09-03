
CREATE DATABASE Jaegers;	
	
\c jaegers;	
	
CREATE TABLE Jaegers (	
    id	      SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      CHAR(50),
    height    INTEGER,
    weight    INTEGER,
    status    CHAR(50),
    origin    TEXT,
    launch    DATA,
    kaijuKill INTEGER
    );
