package com.sanin.cart;


public class paypal implements PaymentServices {
    @Override
    public void processpayment(double amount){
        System.out.println("PayPal Amount "+amount+" paid");
    }
}
