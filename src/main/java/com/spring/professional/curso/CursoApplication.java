package com.spring.professional.curso;

import com.spring.professional.curso.di.domain.dto.Order;
import com.spring.professional.curso.di.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoApplication implements CommandLineRunner {

	@Autowired
	public OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.0, 20.0);
		Double total = orderService.total(order);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f\n", total);
	}
}
