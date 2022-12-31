package org.funnystyle.jpashop.repository;

import org.funnystyle.jpashop.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
