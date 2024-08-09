package com.spring.professional.curso.di.service;

import com.spring.professional.curso.di.domain.dto.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order) {
        if (order.getBasic() < 100) {
            return 20.0;
        }
        else if(order.getBasic() < 200) {
            return 12.00;
        }
        else {
            return 0.0;
        }
    }
}
