package com.bankapi.account_bank.api.command;

import com.bank.cqrs_core.command.BaseCommand;


public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
