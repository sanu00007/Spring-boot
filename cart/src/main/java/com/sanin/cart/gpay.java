package com.sanin.cart;

import org.springframework.stereotype.Component;

@Component
public class gpay implements PaymentServices {
    @Override
    public void processpayment(double amount){
        System.out.println("Gpay Amount "+amount+" paid");
    }
}
