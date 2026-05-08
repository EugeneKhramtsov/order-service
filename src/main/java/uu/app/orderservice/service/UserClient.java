package uu.app.orderservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uu.app.orderservice.dto.UserDto;

@Service
@AllArgsConstructor
public class UserClient {

    private final RestTemplate restTemplate;

    public UserDto getUser(Long userId) {
        return restTemplate.getForObject("http://localhost:8181/users/" + userId, UserDto.class);
    }
}
