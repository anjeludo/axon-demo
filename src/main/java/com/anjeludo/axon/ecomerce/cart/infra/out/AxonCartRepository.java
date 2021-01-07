package com.anjeludo.axon.ecomerce.cart.infra.out;

import org.axonframework.modelling.command.AggregateNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.function.Function;

import org.axonframework.modelling.command.Aggregate;
import com.anjeludo.axon.ecomerce.cart.domain.Cart;
import com.anjeludo.axon.ecomerce.cart.domain.CartId;
import com.anjeludo.axon.ecomerce.cart.domain.CartRepository;
import com.anjeludo.axon.ecomerce.user.domain.UserId;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class AxonCartRepository implements CartRepository {
	
//	@Autowired
//	@Qualifier("cartRepository")
	private final org.axonframework.modelling.command.Repository<Cart> cartRepository;
	
	public void persist(CartId id, UserId userId) throws Exception {
		cartRepository.newInstance(() -> {
		    	Cart.create(id, userId);
		    	return new Cart();
		    });
	}

	@Override
	public Cart search(CartId id) {
		  try {
              Aggregate<Cart> cart = cartRepository.load(id.asString());
              return cart.invoke( Function.identity());
          } catch(AggregateNotFoundException e) {
              return null;
          }
	}

}
