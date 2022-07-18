package com.arab.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arab.sample.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
