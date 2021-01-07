package com.anjeludo.axon.ecomerce.cart.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;

import com.anjeludo.axon.shared.valueobject.ValueObject;

import lombok.AllArgsConstructor;

@ValueObject
@AllArgsConstructor	
public final class CartId implements Serializable {
	private static final long serialVersionUID = 7474098782937793895L;
	
	@Column(columnDefinition = "binary(16)")
	private UUID id;
	
	public String asString() {
		return id.toString();
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	public static CartId fromString(String uuid) {
		return new CartId(UUID.fromString(uuid));
	}
}
