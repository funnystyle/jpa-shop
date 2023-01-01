package org.funnystyle.jpashop.repository;

import org.funnystyle.jpashop.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
