package com.viniciusbe.course.repositories;

import com.viniciusbe.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
