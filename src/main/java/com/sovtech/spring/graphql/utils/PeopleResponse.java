package com.sovtech.spring.graphql.utils;

import com.sovtech.spring.graphql.domain.People;
import java.util.List;
import lombok.Data;

@Data
public class PeopleResponse {

  int count;
  String next;
  String previous;
  List<People> results;

}
