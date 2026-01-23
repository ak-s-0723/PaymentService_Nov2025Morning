package org.example.paymentservice_nov2025morning.services;

public interface IPaymentService {
    String getPaymentLink(Long amount, String orderId, String phoneNumber,String name,String email);
}
