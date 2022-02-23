package com.bank.account_common.event;

import com.bank.cqrs_core.event.BaseEvent;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class AccountClosedEvent extends BaseEvent {

}
