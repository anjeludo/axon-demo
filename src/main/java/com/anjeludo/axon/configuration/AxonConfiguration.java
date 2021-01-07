package com.anjeludo.axon.configuration;

import org.axonframework.common.caching.Cache;
import org.axonframework.common.caching.NoCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfiguration {
	
	 @Bean
	 public Cache cache() {
		  return NoCache.INSTANCE;
	 }

}
