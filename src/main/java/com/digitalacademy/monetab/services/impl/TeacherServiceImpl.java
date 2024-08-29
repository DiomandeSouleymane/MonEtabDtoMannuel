package com.digitalacademy.monetab.services.impl;

import com.digitalacademy.monetab.models.Student;
import com.digitalacademy.monetab.models.Teacher;
import com.digitalacademy.monetab.repositories.StudentRepository;
import com.digitalacademy.monetab.repositories.TeachersRepository;
import com.digitalacademy.monetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeachersServiceImpl implements TeacherService {

    private static final Logger log = LoggerFactory.getLogger(TeachersServiceImpl.class);
    private final TeachersRepository repository;

    @Override
    public Teacher save(Teacher teacher) {

        log.debug("Saving student {}", teacher);
        return repository.save(teacher);
    }

    @Override
    public Optional<Teacher> update(Teacher teacher) {
        return Optional.empty();
    }

    @Override
    public Optional<Teacher> findById(Long id) {
        log.debug("Find teacher by id {}", id);
        return repository.findById(id);
    }

    @Override
    public Optional<Teacher> findOne(Long id) {
        log.debug("Find teacher by id {}", id);
        return repository.findById(id);
    }

    @Override
    public List<Teacher> findAll() {

        return (List<Teacher>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Delete teacher by id {}", id);
        repository.deleteById(id);

    }
}
