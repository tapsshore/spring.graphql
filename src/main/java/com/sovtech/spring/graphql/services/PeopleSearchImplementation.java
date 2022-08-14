package com.sovtech.spring.graphql.services;

import com.sovtech.spring.graphql.utils.PeopleResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class PeopleSearchImplementation implements PeopleSearchInterface {

  @Value("${swapi.url}")
  private String swapiUrl;

  public PeopleSearchImplementation(RestTemplate restTemplate) {
  }

  @Override
  public PeopleResponse getAllPeople(String page) {
    return null;
  }

  @Override
  public PeopleResponse searchPeopleByName(String name) {
    return null;
  }
}
