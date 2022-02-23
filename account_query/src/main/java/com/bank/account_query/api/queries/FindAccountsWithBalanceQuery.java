package com.bank.account_query.api.queries;

import com.bank.account_query.api.dto.EqualityType;
import com.bank.cqrs_core.queries.BaseQuery;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindAccountsWithBalanceQuery extends BaseQuery {
    private EqualityType equalityType;
    private double balance;
}
