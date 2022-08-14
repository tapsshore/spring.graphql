package com.sovtech.spring.graphql.services;

import com.sovtech.spring.graphql.utils.PeopleResponse;

public interface PeopleSearchInterface {

  PeopleResponse getAllPeople(String page);

  PeopleResponse searchPeopleByName(String name);
}
