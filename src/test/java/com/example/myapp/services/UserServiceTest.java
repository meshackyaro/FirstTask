package com.example.myapp.services;

import com.example.myapp.data.repositories.UserRepository;
import com.example.myapp.dtos.requests.RegisterRequest;
import com.example.myapp.dtos.responses.RegisterResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void userRegistrationTest() {
        RegisterRequest request = new RegisterRequest();
        request.setUsername("jondoe");
        request.setPassword("password");
        RegisterResponse response = userService.registerUser(request);
        response.setMessage("Success");
        assertThat(response).isNotNull();


    }

}