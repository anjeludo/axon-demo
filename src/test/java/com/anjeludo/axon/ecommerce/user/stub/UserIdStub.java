package com.anjeludo.axon.ecommerce.user.stub;

import java.util.UUID;

import com.anjeludo.axon.ecomerce.user.domain.UserId;

public class UserIdStub {

	public static UserId random() {
		return new UserId(UUID.randomUUID());
	}

}
