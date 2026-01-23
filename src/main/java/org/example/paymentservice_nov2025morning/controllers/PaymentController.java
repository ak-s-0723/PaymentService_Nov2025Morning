package org.example.paymentservice_nov2025morning.controllers;


import org.example.paymentservice_nov2025morning.dtos.PaymentRequestDto;
import org.example.paymentservice_nov2025morning.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/payment")
@RestController
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody PaymentRequestDto paymentRequestDto) {
        return paymentService.getPaymentLink(paymentRequestDto.getAmount(),
                paymentRequestDto.getOrderId(),paymentRequestDto.getPhoneNumber(),
                paymentRequestDto.getName(),paymentRequestDto.getEmail());
    }
}
