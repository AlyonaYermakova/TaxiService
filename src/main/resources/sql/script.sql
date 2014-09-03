CREATE TABLE role (
    id   INT PRIMARY KEY,
    role VARCHAR (14) NOT NULL
);

INSERT INTO role VALUES (0, 'ADMIN');
INSERT INTO role VALUES (1, 'CLIENT');
INSERT INTO role VALUES (2, 'DISPATCHER');

CREATE TABLE gender (
    id   INT PRIMARY KEY,
    role VARCHAR (6) NOT NULL
);

INSERT INTO gender VALUES (0, 'MALE');
INSERT INTO gender VALUES (1, 'FEMALE');

CREATE TABLE user (
    id   INT PRIMARY KEY,
    uuid VARCHAR (36) NOT NULL,
    login VARCHAR (32) NOT NULL,
    password VARCHAR(32) NOT NULL,
    email VARCHAR(60) NOT NULL,
    name VARCHAR(40) NOT NULL,
    surname VARCHAR(40) NOT NULL,
    role INT NOT NULL,
    gender INT NOT NULL,
    UNIQUE (email),
    UNIQUE (login),
    FOREIGN KEY (role) REFERENCES role (id),
    FOREIGN KEY (gender) REFERENCES gender (id));

CREATE TABLE price (
    id   INT PRIMARY KEY,
    cityPart VARCHAR (30) NOT NULL,
    sum INT
);

CREATE TABLE street (
    id   INT PRIMARY KEY,
    street VARCHAR (30) NOT NULL,
    cityPart INT,
    FOREIGN KEY (cityPart) REFERENCES price (id)
);

CREATE TABLE color (
    id   INT PRIMARY KEY,
    color VARCHAR (30) NOT NULL
);

CREATE TABLE brand (
    id   INT PRIMARY KEY,
    brand VARCHAR (30) NOT NULL
);

CREATE TABLE car (
    id   INT PRIMARY KEY,
    number VARCHAR (7) NOT NULL,
    color INT,
    brand int,
    FOREIGN KEY (color) REFERENCES color (id),
    FOREIGN KEY (brand) REFERENCES brand (id),
);

CREATE TABLE client (
    id   INT PRIMARY KEY,
    user INT,
    street INT,
    house VARCHAR (10),
    flat VARCHAR (10),
    PRIMARY KEY (id),
    FOREIGN KEY (user) REFERENCES user (id),
    FOREIGN KEY (street) REFERENCES street (id));

CREATE TABLE order (
    id   INT PRIMARY KEY,
    car INT,
    client INT,
    note VARCHAR (255),
    sum INT,
    FOREIGN KEY (car) REFERENCES car (id),
    FOREIGN KEY (client) REFERENCES client (id),
    FOREIGN KEY (sum) REFERENCES price(sum)
);

CREATE TABLE dispatcher (
    id   INT PRIMARY KEY,
    user INT,
    order INT,
    FOREIGN KEY (user) REFERENCES user (id),
    FOREIGN KEY (order) REFERENCES order (id)
);