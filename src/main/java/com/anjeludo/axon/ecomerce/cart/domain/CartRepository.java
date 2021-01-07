package com.anjeludo.axon.ecomerce.cart.domain;

import com.anjeludo.axon.ecomerce.user.domain.UserId;

public interface CartRepository {
	public void persist(CartId id, UserId userId) throws Exception;
	public Cart search(CartId id);

}
