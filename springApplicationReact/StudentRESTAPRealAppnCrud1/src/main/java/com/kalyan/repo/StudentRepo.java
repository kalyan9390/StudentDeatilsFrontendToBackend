package com.kalyan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalyan.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
