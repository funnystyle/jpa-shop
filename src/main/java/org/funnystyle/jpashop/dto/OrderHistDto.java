package org.funnystyle.jpashop.dto;

import lombok.Getter;
import lombok.Setter;
import org.funnystyle.jpashop.constant.OrderStatus;
import org.funnystyle.jpashop.entity.Order;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class OrderHistDto {

    private Long orderId; //주문아이디

    private String orderDate; //주문날짜

    private OrderStatus orderStatus; // 주문 상태

    private List<OrderItemDto> orderItemDtoList = new ArrayList<>();

    public OrderHistDto(Order order) {
        this.orderId = order.getId();
        this.orderDate = order.getOrderDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        this.orderStatus = order.getOrderStatus();
    }

    public void addOrderItemDto(OrderItemDto orderItemDto) {
        orderItemDtoList.add(orderItemDto);
    }

}
