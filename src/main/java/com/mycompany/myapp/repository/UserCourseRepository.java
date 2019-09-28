package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Course;
import com.mycompany.myapp.domain.UserCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCourseRepository extends JpaRepository<UserCourse, Long>{
    Optional<UserCourse> findUserCourseByCourse(Course course);
}
