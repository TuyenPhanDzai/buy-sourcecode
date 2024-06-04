package org.example.buysourcecode.controller;


import jakarta.validation.Valid;
import org.example.buysourcecode.dto.User.SignUpUserRequest;
import org.example.buysourcecode.dto.User.UserReponse;
import org.example.buysourcecode.model.User;
import org.example.buysourcecode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public UserReponse SignUp(@RequestBody @Valid SignUpUserRequest request) {
        User user = userService.findUserByUsername(request.getUsername());
//        if (user != null) {
//
//        }
        user = User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .build();
        userService.createUser(user);
        return UserReponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .build();
    }

}
