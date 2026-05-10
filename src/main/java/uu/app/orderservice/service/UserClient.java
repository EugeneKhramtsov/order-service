package uu.app.orderservice.service;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uu.app.orderservice.dto.UserDto;

@Service
@AllArgsConstructor
public class UserClient {

    private final RestTemplate restTemplate;

    public UserDto getUser(Long userId, HttpHeaders headers) {
        String authHeader = headers.getFirst("Authorization");

        HttpHeaders entityHeaders = new HttpHeaders();
        entityHeaders.add("Authorization", authHeader);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<UserDto> userResponse = restTemplate.exchange(
                "http://localhost:8181/users/" + userId,
                HttpMethod.GET,
                entity,
                UserDto.class
        );
        return userResponse.getBody();
    }
}
