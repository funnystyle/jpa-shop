package org.funnystyle.jpashop.repository;

import org.funnystyle.jpashop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
