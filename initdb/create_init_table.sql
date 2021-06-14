CREATE TABLE users(
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(500) NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE TABLE dental_clinics(
    clinic_number VARCHAR(36) NOT NULL PRIMARY KEY,
    clinic_name VARCHAR(20) NOT NULL
);
