package com.bankapi.account_bank.api.command;

public interface CommandHandler {
    void handle(OpenAccountCommand command);

    void handle(DepositFundsCommand command);

    void handle(WithdrawFundsCommand command);

    void handle(CloseAccountCommand command);

    void handle(RestoreReadDbCommand command);
}
