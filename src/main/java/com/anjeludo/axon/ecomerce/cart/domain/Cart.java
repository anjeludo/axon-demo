package com.anjeludo.axon.ecomerce.cart.domain;

import java.time.ZonedDateTime;

import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.modelling.command.AggregateVersion;
import org.axonframework.spring.stereotype.Aggregate;

import com.anjeludo.axon.ecomerce.user.domain.UserId;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Aggregate
public class Cart {
	
	public Cart() {
	}
	
	@Getter
	@Setter(value = AccessLevel.PRIVATE)
	@AggregateIdentifier
	private CartId id;
	
	@Getter
	@Setter(value = AccessLevel.PRIVATE)
	private UserId userId;

	//	@Setter(value = AccessLevel.PRIVATE)
//	private CartItems cartItems = new HashMap<>();

	@Setter(value = AccessLevel.PRIVATE)
	private boolean checkout = false;
//	
//	@AggregateVersion 
//	private long version;
	
	@EventSourcingHandler
	public void on(CartCreatedEvent event) {
		this.id = CartId .fromString(event.aggregateId());
	    this.userId = UserId.fromString(event.getUserId());
	}
	
	public static void create(CartId id, UserId userId) {
		AggregateLifecycle.apply(new CartCreatedEvent(id.asString(), ZonedDateTime.now(), userId.asString()));
	}
	
}
