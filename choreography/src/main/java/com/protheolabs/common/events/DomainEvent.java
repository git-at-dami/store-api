package com.protheolabs.common.events;

import java.time.Instant;

public interface DomainEvent {
    Instant createdAt();
}
