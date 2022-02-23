package com.bank.cqrs_core.infrastructure;

import com.bank.cqrs_core.domain.BaseEntity;
import com.bank.cqrs_core.queries.BaseQuery;
import com.bank.cqrs_core.queries.QueryHandlerMethod;

import java.util.List;

public interface QueryDispatcher {
    <T extends BaseQuery> void registerHandler(Class<T> type, QueryHandlerMethod<T> handler);
    <U extends BaseEntity>List<U> send(BaseQuery query);
}
