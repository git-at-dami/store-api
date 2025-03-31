package com.protheolabs.common.events;

import java.util.UUID;

public interface OrdersSaga extends Saga{
    UUID orderId();
}
