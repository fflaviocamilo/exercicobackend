package com.cotamacae.order.exercicobackend;
import java.util.Locale;
import java.util.Scanner;

import com.cotamacae.order.entities.Order;
import com.cotamacae.order.services.OrderCalculationTotal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cotamacae.order"})
public class Program implements CommandLineRunner {

    private OrderCalculationTotal orderCalculationTotal;

    public Program(OrderCalculationTotal orderCalculationTotal) {
        this.orderCalculationTotal = orderCalculationTotal;
    }

    public static void main(String[] args) {
        SpringApplication.run(Program.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Pedido : ");
        double numeroPedido = sc.nextLong();

        System.out.print("Preco : ");
        double preco = sc.nextDouble();

        System.out.print("Desconto : ");
        double desconto = sc.nextDouble();


        Order order = new Order( (int) numeroPedido, preco, desconto);

        System.out.println(orderCalculationTotal.discountPrice(order) );

    }
}
