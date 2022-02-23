package com.bank.cqrs_core.producers;

import com.bank.cqrs_core.event.BaseEvent;

public interface EventProducer {
    void produce(String topic, BaseEvent event);
}
