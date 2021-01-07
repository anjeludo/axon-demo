package com.anjeludo.axon.ecommerce.cart.stub;

import com.anjeludo.axon.ecomerce.cart.application.CreateCartCommand;
import com.anjeludo.axon.ecommerce.user.stub.UserIdStub;

public class CreateCartCommandStub {
	
	public static CreateCartCommand random() {
		return new CreateCartCommand(CartIdStub.random().asString(), UserIdStub.random().asString());
	}

}
