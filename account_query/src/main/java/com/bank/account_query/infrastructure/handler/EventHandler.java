package com.bank.account_query.infrastructure.handler;

import com.bank.account_common.event.AccountClosedEvent;
import com.bank.account_common.event.AccountOpenedEvent;
import com.bank.account_common.event.FundsDepositedEvent;
import com.bank.account_common.event.FundsWithdrawnEvent;

public interface EventHandler {
    void on(AccountOpenedEvent event);
    void on(FundsDepositedEvent event);
    void on(FundsWithdrawnEvent event);
    void on(AccountClosedEvent event);
}
