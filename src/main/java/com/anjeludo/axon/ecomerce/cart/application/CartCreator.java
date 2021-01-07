package com.anjeludo.axon.ecomerce.cart.application;

import org.springframework.stereotype.Service;

import com.anjeludo.axon.ecomerce.cart.domain.CartId;
import com.anjeludo.axon.ecomerce.cart.infra.out.AxonCartRepository;
import com.anjeludo.axon.ecomerce.user.domain.UserId;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public final class CartCreator {

	
	//private EventSourcingRepository<AccountAggregate> accountAggregateEventSourcingRepository;
	private final AxonCartRepository repository;
	
	public void create(CartId id, UserId userId) throws Exception {
		repository.persist(id, userId);
	}
}
