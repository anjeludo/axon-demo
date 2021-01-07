package com.anjeludo.axon.ecommerce.cart.stub;

import java.util.UUID;

import com.anjeludo.axon.ecomerce.cart.domain.CartId;

public class CartIdStub {
	
	public static CartId random() {
		return new CartId(UUID.randomUUID());
	}

}
