package com.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datajpa.domain.Student;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long> {

}
