CREATE TABLE grades
(
    id                      BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_two_months_grade  DOUBLE,
    second_two_months_grade DOUBLE,
    third_two_months_grade  DOUBLE,
    fourth_two_months_grade DOUBLE,
    approved                TINYINT(1) NOT NULL DEFAULT 0,
    student_id              BIGINT     NOT NULL,
    subject_id              BIGINT     NOT NULL,

    CONSTRAINT `fk_grades_students`
        FOREIGN KEY (student_id) REFERENCES teachers (id),

    CONSTRAINT `fk_grades_subjects`
        FOREIGN KEY (subject_id) REFERENCES subjects (id)
);