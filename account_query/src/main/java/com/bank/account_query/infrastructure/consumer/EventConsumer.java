package com.bank.account_query.infrastructure.consumer;

import com.bank.account_common.event.AccountClosedEvent;
import com.bank.account_common.event.AccountOpenedEvent;
import com.bank.account_common.event.FundsDepositedEvent;
import com.bank.account_common.event.FundsWithdrawnEvent;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;

public interface EventConsumer {
    void consume(@Payload AccountOpenedEvent event, Acknowledgment ack);
    void consume(@Payload FundsDepositedEvent event, Acknowledgment ack);
    void consume(@Payload FundsWithdrawnEvent event, Acknowledgment ack);
    void consume(@Payload AccountClosedEvent event, Acknowledgment ack);
}
