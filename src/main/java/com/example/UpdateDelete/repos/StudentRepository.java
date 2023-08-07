package com.example.UpdateDelete.repos;

import com.example.UpdateDelete.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
