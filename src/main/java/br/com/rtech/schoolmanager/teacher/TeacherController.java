package br.com.rtech.schoolmanager.teacher;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {
    @PersistenceContext
    private EntityManager entityManager;

    public TeacherController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @PostMapping("/teacher")
    public void createTeacher(@RequestBody @Valid NewTeacherRequest request) {
        System.out.println(request);
    }

}
