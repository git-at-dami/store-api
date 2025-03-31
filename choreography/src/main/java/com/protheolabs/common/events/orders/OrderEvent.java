package com.protheolabs.common.events.orders;

import com.protheolabs.common.events.DomainEvent;
import com.protheolabs.common.events.OrdersSaga;

public interface OrderEvent extends DomainEvent,   OrdersSaga {
}
