package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

// No need implementation, just one interface, and you have CRUD, thanks Spring Data!
public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByStudentNumber(long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpaDesc();

}