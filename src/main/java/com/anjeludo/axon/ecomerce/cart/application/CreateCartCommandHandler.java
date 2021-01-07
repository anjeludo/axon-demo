package com.anjeludo.axon.ecomerce.cart.application;

import org.axonframework.commandhandling.CommandHandler;
import org.springframework.stereotype.Service;

import com.anjeludo.axon.ecomerce.cart.domain.CartId;
import com.anjeludo.axon.ecomerce.user.domain.UserId;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateCartCommandHandler {
	
	private final CartCreator creator;
	
	
	@CommandHandler
	public void on(CreateCartCommand command) throws Exception {
		creator.create(CartId.fromString(command.getId()), UserId.fromString(command.getUserId()));
	}

}
