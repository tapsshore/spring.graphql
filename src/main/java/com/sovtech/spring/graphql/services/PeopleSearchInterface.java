package com.sovtech.spring.graphql.services;

import com.sovtech.spring.graphql.utils.PeopleResponse;

public interface PeopleSearchInterface {

  PeopleResponse getPeople(String page);

  PeopleResponse searchByName(String name);
}
