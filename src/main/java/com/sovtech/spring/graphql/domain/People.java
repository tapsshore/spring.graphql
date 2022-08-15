package com.sovtech.spring.graphql.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {

  String name;
  String height;
  String mass;
  String gender;
  String homeworld;
}
