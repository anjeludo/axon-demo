package com.anjeludo.axon.ecomerce.cart.infra.in;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public final class CreateCartRestRequest {
	@NotNull
	private UUID id;

	@NotNull
	private UUID userId;
}
