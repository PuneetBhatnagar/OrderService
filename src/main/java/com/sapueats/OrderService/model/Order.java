package com.sapueats.OrderService.model;

import org.apache.kafka.common.protocol.types.Field;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.springframework.data.mongodb.core.mapping.Document;


@Entity
@Table(name = "order_tbl")
public class Order {

    @Id
    private String orderId;
    private Integer orderAmount;
    private String userId;
    private String restaurantId;
    private String orderName;
    private String paymentId;
    private String paymentStatus;
    private String paymentType;
    private String paymentAccountNumber;
    private String paymentTimeStamp;

    public String order_info(){
        String order_info = getOrderId()+getOrderAmount()+getUserId()+getRestaurantId()+getOrderName()+getPaymentId()+getPaymentStatus()+getPaymentType()+getPaymentTimeStamp();
        return  order_info;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentAccountNumber() {
        return paymentAccountNumber;
    }

    public void setPaymentAccountNumber(String paymentAccountNumber) {
        this.paymentAccountNumber = paymentAccountNumber;
    }

    public String getPaymentTimeStamp() {
        return paymentTimeStamp;
    }

    public void setPaymentTimeStamp(String paymentTimeStamp) {
        this.paymentTimeStamp = paymentTimeStamp;
    }



}
