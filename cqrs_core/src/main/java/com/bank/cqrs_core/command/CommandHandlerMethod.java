package com.bank.cqrs_core.command;

@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand>{
    void handle(T command);

}
