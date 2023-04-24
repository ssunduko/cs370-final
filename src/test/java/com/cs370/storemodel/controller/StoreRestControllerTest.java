package com.cs370.storemodel.controller;

import org.json.JSONException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StoreRestControllerTest {
    private static HttpHeaders headers;
    @LocalServerPort
    private Integer port;
    @Autowired
    private TestRestTemplate restTemplate;

    @BeforeAll
    static void init() {

        headers = new HttpHeaders();
        headers.setBasicAuth("sergey", "chapman");
    }

    @Test
    public void testGetStoreById() throws IllegalStateException, JSONException {

        String expectedJson = "{\"id\": 1, \"address\":\"75 Forbes\", \"description\":\"My First Store\"}";

        ResponseEntity<String> response = restTemplate.exchange(
                "http://localhost:" + port + "/stores/1", HttpMethod.GET, new HttpEntity<String>(headers),
                String.class);

        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        System.out.println(response);
        JSONAssert.assertEquals(expectedJson, response.getBody(), true);
    }

}
