package com.spring.professional.curso.di.service;

import com.spring.professional.curso.di.domain.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        return (order.getBasic() * (1-(order.getDiscount()/100))) + shippingService.shipment(order);
    }
}
