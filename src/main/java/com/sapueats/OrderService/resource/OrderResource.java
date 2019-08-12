package com.sapueats.OrderService.resource;

import com.sapueats.OrderService.model.Order;
import com.sapueats.OrderService.repository.OrderRepository;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import sun.text.resources.cldr.ti.FormatData_ti_ER;

@RestController
@RequestMapping("/order")
public class OrderResource {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    KafkaTemplate<String, Order> kafkaTemplate;

    private String topicName = "new_order";
    private String msg;

    @PostMapping("/submit")
    public String submitOrder(@RequestBody final Order order) {
//          step1: Validation
        System.out.println("Order Details :-"
                            + "Order Id "+ order.getOrderId()
                            + "Order Id "+ order.getOrderName()
                            + "Order Id "+ order.getPaymentAccountNumber()
                            + "Order Id "+ order.getPaymentId()
                            + "Order Id "+ order.getPaymentStatus()
        );
//          step2: persist Order in DB
        System.out.println("Saving Order Data in DB");
            orderRepository.save(order);

//          step3: produce kafka topic
        System.out.println("Sending Kafka Message");
            sendKafkaMessage(order);

        return "Submit Order is successful";
    }

    public void sendKafkaMessage(Order msg) {
        kafkaTemplate.send(topicName, msg);
    }

}
