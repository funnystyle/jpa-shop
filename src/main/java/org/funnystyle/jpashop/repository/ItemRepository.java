package org.funnystyle.jpashop.repository;

import org.funnystyle.jpashop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
