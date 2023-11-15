CREATE TABLE subjects
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    name         VARCHAR(50)        NOT NULL,
    code         VARCHAR(50) UNIQUE NOT NULL,
    credit_hours INT                NOT NULL,
    shift        VARCHAR(15)        NOT NULL,
    teacher_id   BIGINT             NOT NULL,
    CONSTRAINT `fk_subjects_teachers`
        FOREIGN KEY (teacher_id) REFERENCES teachers (id)
);