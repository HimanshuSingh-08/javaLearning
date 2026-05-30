package com.himanshu.store.repositories;

import com.himanshu.store.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Long> {
}
