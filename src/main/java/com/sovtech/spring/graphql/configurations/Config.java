package com.sovtech.spring.graphql.configurations;

import com.sovtech.spring.graphql.services.PeopleSearchImplementation;
import com.sovtech.spring.graphql.services.PeopleSearchInterface;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class Config {

  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder.build();
  }

  @Bean
  public PeopleSearchInterface peopleSearchInterface(){
    return new PeopleSearchImplementation(restTemplate(new RestTemplateBuilder()));
  }
}
