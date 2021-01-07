package com.anjeludo.axon.ecomerce.cart.application;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Value;

@Value
public final class CreateCartCommand {
	@TargetAggregateIdentifier
	private String id;
	private String userId;
}
