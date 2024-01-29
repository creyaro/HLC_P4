package com.hlc.subjectsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SubjectsImpl implements Subjects {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    @GetMapping("/subjects")
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    @DeleteMapping("/subjects/{id}")
    public void deleteById(@PathVariable String id) {
        // Implementa la lógica para eliminar por ID
    }

    @Override
    @PostMapping("/subjects")
    public ResponseEntity<Subject> save(@RequestBody Subject subject) {
        // Implementa la lógica para guardar el nuevo objeto Subject
        Subject savedSubject = subjectRepository.save(subject);
        return ResponseEntity.ok(savedSubject);
    }

    @Override
    @GetMapping("/subjects/{id}")
    public ResponseEntity<Subject> findById(@PathVariable String id) {
        // Implementa la lógica para buscar por ID
        Optional<Subject> optionalSubject = subjectRepository.findById(id);
        return optionalSubject.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public boolean update(Subject subject) {
        boolean editado = true;
        try {
            deleteById(subject.getId());
            save(subject);
        } catch (Exception e) {
            editado = false;
        }
        return editado;
    }
}