package com.anjeludo.axon.ecomerce.cart.infra.out;

import org.axonframework.common.caching.Cache;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.Snapshotter;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.modelling.command.Repository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anjeludo.axon.ecomerce.cart.domain.Cart;

@Configuration
public class CartRepositoryConfiguration {
	

//    @Bean
//    public AggregateFactory<Cart> cartAggregateFactory() {
//       return new SpringPrototypeAggregateFactory<Cart>(Cart.class.getName().toLowerCase());     
//    }

    @Bean
    public Repository<Cart> cartRepository(Snapshotter snapshotter,
                            EventStore eventStore,
                            Cache cache){
            return  EventSourcingRepository
            		.builder(Cart.class)
            		//.aggregateFactory(cartAggregateFactory())
            		.eventStore(eventStore)
            		.cache(cache)
            		.build();
    }
}

