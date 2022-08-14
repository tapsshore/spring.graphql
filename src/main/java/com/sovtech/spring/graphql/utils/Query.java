package com.sovtech.spring.graphql.utils;

public enum Query {
  page("page"),
  search("search");

  public final String label;

  Query(String label) {
    this.label = label;
  }
}
