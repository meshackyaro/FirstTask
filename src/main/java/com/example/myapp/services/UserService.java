package com.example.myapp.services;

import com.example.myapp.data.model.User;
import com.example.myapp.data.repositories.UserRepository;
import com.example.myapp.dtos.requests.RegisterRequest;
import com.example.myapp.dtos.responses.RegisterResponse;
import com.example.myapp.exceptions.UserAlreadyExistException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public RegisterResponse registerUser(RegisterRequest request) {
        User user = new User();
        user.setUsername(request.getUsername().toLowerCase());
        user.setPassword(request.getPassword());
        user = userRepository.save(user);

        RegisterResponse response = new RegisterResponse();
        response.setMessage("Success");
        return response;
    }
}
