package com.anjeludo.axon.ecommerce.cart.stub;

import java.time.ZonedDateTime;

import com.anjeludo.axon.ecomerce.cart.domain.CartCreatedEvent;
import com.anjeludo.axon.ecommerce.user.stub.UserIdStub;

public class CartCreatedEventStub {
	
	public static CartCreatedEvent random() {
		return random(CartIdStub.random().asString(), ZonedDateTime.now(), UserIdStub.random().asString());
	}
	
	public static CartCreatedEvent random(String id, ZonedDateTime ocurredOn, String userId) {
		return new CartCreatedEvent(id, ocurredOn, userId);
	}

}
