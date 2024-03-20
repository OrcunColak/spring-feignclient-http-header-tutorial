package com.colak.springfeignclienttutorial.apigateway.feignclient;

import com.colak.springfeignclienttutorial.quote.controller.QuoteResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.net.URI;

@FeignClient(name = "quoteClient", url = "https://this-is-a-placeholder.com")
public interface QuoteClient {

    @GetMapping(path = "/getQuote/{id}", produces = "application/json")
    ResponseEntity<QuoteResponse> getQuote(URI baseUrl, @RequestHeader HttpHeaders headers, @PathVariable("id") int id);
}
