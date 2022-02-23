package com.bank.cqrs_core.infrastructure;

import com.bank.cqrs_core.command.BaseCommand;
import com.bank.cqrs_core.command.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);

    void send(BaseCommand command);

}
