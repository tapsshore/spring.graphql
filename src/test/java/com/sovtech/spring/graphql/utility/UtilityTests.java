package com.sovtech.spring.graphql.utility;

import static org.assertj.core.api.Assertions.assertThat;

import com.sovtech.spring.graphql.utils.Query;
import com.sovtech.spring.graphql.utils.Utility;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application.yml")
public class UtilityTests {
  @Value("${swapi.url}")
  private String swapiUrl;

  @Test
  void buildUriShouldReturnCorrectUrlWhenPageIsEntered() {
    String pageUri = Utility.buildUri(Query.page, "1", swapiUrl, swapiUrl);
    assertThat(pageUri).isEqualTo(swapiUrl + "?page=1");
  }

  @Test
  void buildUriShouldReturnCorrectUrlWhenSearchIsEntered() {
    String searchUri = Utility.buildUri(Query.search, "Luke Skywalker", swapiUrl, swapiUrl);
    assertThat(searchUri).isEqualTo(swapiUrl + "?search=Luke Skywalker");
  }

  @Test
  void buildUriShouldThrowAnExceptionWhenInvalidUrlIsEnterAndReturnDefaultUrl() {
    String searchUri = Utility.buildUri(Query.search, "Luke Skywalker", "swapiUrl", swapiUrl);
    System.out.println(searchUri);
    assertThat(searchUri).isEqualTo(swapiUrl);
  }
}
