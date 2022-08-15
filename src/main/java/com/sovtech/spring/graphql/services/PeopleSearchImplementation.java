package com.sovtech.spring.graphql.services;

import com.sovtech.spring.graphql.utils.PeopleResponse;
import com.sovtech.spring.graphql.utils.Query;
import com.sovtech.spring.graphql.utils.Utility;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PeopleSearchImplementation implements PeopleSearchInterface {

  @Value("${swapi.url}")
  private String swapiUrl;

  private final RestTemplate restTemplate;


  public PeopleSearchImplementation(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public PeopleResponse getAllPeople(String page) {
    return restTemplate.getForObject(
        Utility.buildUri(
            Query.page,
            page == null ? "1" : page,
            swapiUrl,
            swapiUrl
        ),
        PeopleResponse.class);
  }

  @Override
  public PeopleResponse searchPeopleByName(String name) {
    return restTemplate.getForObject(
        Utility.buildUri(
            Query.search,
            name,
            swapiUrl,
            swapiUrl
        ),
        PeopleResponse.class);
  }
}
