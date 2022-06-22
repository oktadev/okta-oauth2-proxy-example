package com.okta.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Collections.emptyList;

@SpringBootApplication
public class EchoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EchoApplication.class, args);
    }

    @RestController
    static class EchoRestController {
        @RequestMapping("/**")
        Map<String, Object> echo(HttpServletRequest request,
                                 @RequestHeader HttpHeaders headers,
                                 @RequestBody(required = false) Map<String, Object> body) {

            Instant now = Instant.now();
            Cookie[] cookies = request.getCookies();

            Map<String, Object> result = new LinkedHashMap<>();
            result.put("clientIpAddress", request.getRemoteAddr());
            result.put("cookies", cookies == null ? emptyList() : Arrays.stream(cookies).toList());
            result.put("headers", headers.toSingleValueMap()); // simplify json response
            result.put("httpVersion", request.getProtocol());
            result.put("method", request.getMethod());
            result.put("body", body);
            result.put("queryString", request.getQueryString());
            result.put("startedDateTime", now);
            result.put("url", request.getRequestURL());

            return result;
        }
    }
}