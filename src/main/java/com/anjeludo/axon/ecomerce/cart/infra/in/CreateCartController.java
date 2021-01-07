package com.anjeludo.axon.ecomerce.cart.infra.in;

import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.Valid;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anjeludo.axon.ecomerce.cart.application.CreateCartCommand;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public final class CreateCartController {
	
	private final CommandGateway commandGateway;
	
	@PostMapping(value = "/ecommerce/cart")
	public ResponseEntity<String> create(@RequestBody @Valid CreateCartRestRequest request) throws URISyntaxException {
		commandGateway.sendAndWait(new CreateCartCommand(request.getId().toString(), request.getUserId().toString()));
		return ResponseEntity.created(new URI("/ecommerce/cart/" + request.getId())).build();
	}

}
