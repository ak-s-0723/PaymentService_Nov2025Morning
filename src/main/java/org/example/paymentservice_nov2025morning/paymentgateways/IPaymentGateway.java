package org.example.paymentservice_nov2025morning.paymentgateways;

public interface IPaymentGateway {

    String getPaymentLink(Long amount, String orderId, String phoneNumber,String name,String email);
}
