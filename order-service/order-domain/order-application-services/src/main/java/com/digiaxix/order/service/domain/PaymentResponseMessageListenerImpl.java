package com.digiaxix.order.service.domain;

import com.digiaxix.order.service.domain.dto.message.PaymentResponse;
import com.digiaxix.order.service.domain.ports.input.message.listener.payment.PaymentResponseMessageListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Log4j2
@Validated
public class PaymentResponseMessageListenerImpl implements PaymentResponseMessageListener {
    @Override
    public void paymentCompleted(PaymentResponse paymentResponse) {

    }

    @Override
    public void paymentCancelled(PaymentResponse paymentResponse) {

    }
}
