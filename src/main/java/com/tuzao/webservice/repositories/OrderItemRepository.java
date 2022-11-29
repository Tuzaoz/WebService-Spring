package com.tuzao.webservice.repositories;

import com.tuzao.webservice.entities.OrderItem;
import com.tuzao.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
