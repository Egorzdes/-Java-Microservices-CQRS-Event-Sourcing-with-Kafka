package com.bankapi.account_bank.api.command;

import com.bank.account_common.dto.AccountType;
import com.bank.cqrs_core.command.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
