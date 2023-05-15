package com.viniciusbe.course.repositories;

import com.viniciusbe.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
