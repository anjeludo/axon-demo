package com.anjeludo.axon.shared.domainevent;

import java.time.ZonedDateTime;

public interface DomainEvent {
	public String aggregateId();
	public ZonedDateTime ocurredOn();

}
