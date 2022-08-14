package com.sovtech.spring.graphql.queries;

import com.sovtech.spring.graphql.services.PeopleSearchInterface;
import com.sovtech.spring.graphql.utils.PeopleResponse;
import org.springframework.stereotype.Component;

@Component
public class PeopleSearchQuery {

  final PeopleSearchInterface peopleSearchInterface;

  public PeopleSearchQuery(PeopleSearchInterface peopleSearchInterface) {
    this.peopleSearchInterface = peopleSearchInterface;
  }

  public PeopleResponse peopleResponse(String page){
    return peopleSearchInterface.getAllPeople(page);
  }
  public PeopleResponse searchPeople(String name){
    return peopleSearchInterface.searchPeopleByName(name);
  }

}
