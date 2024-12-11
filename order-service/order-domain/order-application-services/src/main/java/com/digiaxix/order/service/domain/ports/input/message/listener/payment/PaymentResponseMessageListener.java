package com.digiaxix.order.service.domain.ports.input.message.listener.payment;

import com.digiaxix.order.service.domain.dto.message.PaymentResponse;

public interface PaymentResponseMessageListener {
    void paymentComplete(PaymentResponse paymentResponse);
    void paymentCanceled(PaymentResponse paymentResponse);
}
