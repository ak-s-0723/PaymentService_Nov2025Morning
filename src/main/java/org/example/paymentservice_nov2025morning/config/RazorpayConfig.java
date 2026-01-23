package org.example.paymentservice_nov2025morning.config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayConfig {

    @Value("${razorpay.key.id}")
    private String razorpayId;

    @Value("${razorpay.key.secret}")
    private String razorpaySecret;

    @Bean
    public RazorpayClient getRazorpayClient() {
        try {
            return new RazorpayClient(razorpayId, razorpaySecret);
        }catch (RazorpayException exception) {
            throw new RuntimeException(exception);
        }
    }
}
