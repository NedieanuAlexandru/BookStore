package com.bookstore.ecommerce.service;

import com.bookstore.ecommerce.dto.PaymentInfo;
import com.bookstore.ecommerce.dto.Purchase;
import com.bookstore.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
