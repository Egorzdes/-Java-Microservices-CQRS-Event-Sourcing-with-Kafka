package com.bankapi.account_bank.api.command;

import com.bank.cqrs_core.command.BaseCommand;
import lombok.Data;

@Data
public class DepositFundsCommand extends BaseCommand {
    private double amount;
}
