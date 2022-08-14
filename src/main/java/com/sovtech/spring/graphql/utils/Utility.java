package com.sovtech.spring.graphql.utils;

import org.springframework.web.util.UriComponentsBuilder;

public class Utility {

  public static String buildUri(Query key, String value, String swapiUrl, String swapiUrlDefault) {
    try {
      String param = key == Query.page ?
          Query.page.toString() : Query.search.toString();
      return UriComponentsBuilder.fromHttpUrl(swapiUrl)
          .queryParam(param.toLowerCase(), value).build().toUriString();
    } catch (IllegalArgumentException illegalArgumentException) {
      illegalArgumentException.printStackTrace();
      return swapiUrlDefault;
    }
  }
}
