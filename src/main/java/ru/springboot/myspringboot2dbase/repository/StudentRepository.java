package ru.springboot.myspringboot2dbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.springboot.myspringboot2dbase.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
