package com.hlc.subjectsservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface Subjects {

    @GetMapping("/subjects")
    List<Subject> getAllSubjects();

    @DeleteMapping("/subjects/{id}")
    void deleteById(@PathVariable String id);

    @PostMapping("/subjects")
    ResponseEntity<Subject> save(@RequestBody Subject subject);

    @GetMapping("/subjects/{id}")
    ResponseEntity<Subject> findById(@PathVariable String id);

    boolean update(Subject subject);
}
