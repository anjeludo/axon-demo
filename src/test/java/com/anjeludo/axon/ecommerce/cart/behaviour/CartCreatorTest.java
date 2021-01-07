package com.anjeludo.axon.ecommerce.cart.behaviour;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.ZonedDateTime;

import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.test.aggregate.AggregateTestFixture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.anjeludo.axon.ecomerce.cart.application.CartCreator;
import com.anjeludo.axon.ecomerce.cart.application.CreateCartCommand;
import com.anjeludo.axon.ecomerce.cart.application.CreateCartCommandHandler;
import com.anjeludo.axon.ecomerce.cart.domain.Cart;
import com.anjeludo.axon.ecomerce.cart.domain.CartCreatedEvent;
import com.anjeludo.axon.ecomerce.cart.domain.CartId;
import com.anjeludo.axon.ecomerce.cart.infra.out.AxonCartRepository;
import com.anjeludo.axon.ecomerce.user.domain.UserId;
import com.anjeludo.axon.ecommerce.cart.stub.CartCreatedEventStub;
import com.anjeludo.axon.ecommerce.cart.stub.CreateCartCommandStub;

class CartCreatorTest {
	
	private AggregateTestFixture<Cart> fixture = new AggregateTestFixture<Cart>(Cart.class);
	private AxonCartRepository repository = new AxonCartRepository(fixture.getRepository());
	private CartCreator service = new CartCreator(repository);
	private CreateCartCommandHandler handler = new CreateCartCommandHandler(service);
	
	@BeforeEach
	public void setUp() {
		fixture.registerAnnotatedCommandHandler(handler);
	}
	
	@Test
	void it_should_crerate_a_cart() {
		CreateCartCommand command = CreateCartCommandStub.random();
		CartCreatedEvent expectedEvent = CartCreatedEventStub.random(command.getId(), ZonedDateTime.now(), command.getUserId());
		
		fixture.givenNoPriorActivity()
			.when(command)
			.expectSuccessfulHandlerExecution()
			.expectEvents(expectedEvent);
		
//		fixture.givenNoPriorActivity()
//		.when(command).expectState( aggregate -> {
//			AggregateLifecycle.apply(expectedEvent);
//			assertEquals(CartId.fromString(command.getId()), aggregate.getId());
//			assertEquals(UserId.fromString(command.getUserId()), aggregate.getUserId());
//        });
	}	

}
