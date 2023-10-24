CREATE TABLE teachers
(
    id                BIGINT AUTO_INCREMENT PRIMARY KEY,
    name              VARCHAR(50) NOT NULL,
    birth_date        DATE        NOT NULL,
    cpf               CHAR(11) UNIQUE,
    rg                VARCHAR(10) UNIQUE,
    gender            CHAR(1)     NOT NULL,
    area_of_expertise VARCHAR(50) NOT NULL

);