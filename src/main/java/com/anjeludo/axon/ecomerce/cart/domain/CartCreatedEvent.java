package com.anjeludo.axon.ecomerce.cart.domain;

import java.time.ZonedDateTime;

import com.anjeludo.axon.shared.domainevent.DomainEvent;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@EqualsAndHashCode
public class CartCreatedEvent implements DomainEvent {
	private String aggregateId;
	@EqualsAndHashCode.Exclude
	private ZonedDateTime ocurredOn;
	@Getter
	private String userId;

	@Override
	public String aggregateId() {
		return aggregateId;
	}

	@Override
	public ZonedDateTime ocurredOn() {
		return ocurredOn;
	}

}
