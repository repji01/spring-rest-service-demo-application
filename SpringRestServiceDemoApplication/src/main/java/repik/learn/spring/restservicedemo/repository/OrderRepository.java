package repik.learn.spring.restservicedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import repik.learn.spring.restservicedemo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
