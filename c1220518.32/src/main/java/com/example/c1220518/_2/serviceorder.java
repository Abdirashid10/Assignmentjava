package com.example.c1220518._2;

import java.util.Collection;

public class serviceorder {


    public void updateStudent(com.example.c1220518._2.order std, int id) {
    }

    public void createStudent(com.example.c1220518._2.order std) {
    }

    public Collection<com.example.c1220518._2.order> getAllStudents() {
        return null;
    }

    public class order {
        private int orderId;
        private String orderName;
        private double price;

        // setter
        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public void setOrderName(String orderName) {
            this.orderName = orderName;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        //getters

        public int getOrderId() {
            return orderId;
        }

        public String getOrderName() {
            return orderName;
        }

        public double getPrice() {
            return price;
        }
    }
}
