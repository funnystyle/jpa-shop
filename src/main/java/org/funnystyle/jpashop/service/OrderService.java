package org.funnystyle.jpashop.service;

import lombok.RequiredArgsConstructor;
import org.funnystyle.jpashop.dto.OrderDto;
import org.funnystyle.jpashop.entity.Item;
import org.funnystyle.jpashop.entity.Member;
import org.funnystyle.jpashop.entity.Order;
import org.funnystyle.jpashop.entity.OrderItem;
import org.funnystyle.jpashop.repository.ItemRepository;
import org.funnystyle.jpashop.repository.MemberRepository;
import org.funnystyle.jpashop.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class OrderService {

    private final ItemRepository itemRepository;
    private final MemberRepository memberRepository;
    private final OrderRepository orderRepository;

    public Long order(OrderDto orderDto, String email) {
        Item item = itemRepository.findById(orderDto.getItemId())
                .orElseThrow(EntityNotFoundException::new);
        Member member = memberRepository.findByEmail(email);

        List<OrderItem> orderItemList = new ArrayList<>();
        OrderItem orderItem = OrderItem.createOrderItem(item, orderDto.getCount());
        orderItemList.add(orderItem);

        Order order = Order.createOrder(member, orderItemList);
        orderRepository.save(order);

        return order.getId();
    }

}
