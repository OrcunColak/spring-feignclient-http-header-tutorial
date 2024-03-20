package com.colak.springfeignclienttutorial.apigateway.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Run on default port 8080
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class ApiGatewayControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    // Gather Quotes from Service
    @Test
    void testGather() {
        String getUrl = "http://localhost:8080/api/gateway/getQuote/1";

        ResponseEntity<String> response = restTemplate.getForEntity(getUrl, String.class);
        String message = response.getBody();
        assert message != null;

        assertEquals("Quote : 1", message);
    }

}
