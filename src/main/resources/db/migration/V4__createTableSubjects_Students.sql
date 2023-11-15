CREATE TABLE subjects_students
(
    subject_id BIGINT NOT NULL,
    student_id BIGINT NOT NULL,
    PRIMARY KEY (subject_id, student_id),
    FOREIGN KEY (subject_id) REFERENCES subjects (id),
    FOREIGN KEY (student_id) REFERENCES students (id)
);