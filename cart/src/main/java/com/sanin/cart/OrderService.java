package com.sanin.cart;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private  PaymentServices paymentServices;
    public OrderService(PaymentServices paymentService){
        this.paymentServices = paymentService;
    }

    public void payprocess(){
        
        paymentServices.processpayment(10);
    }

    
   
}
