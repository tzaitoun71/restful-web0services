package com.tariq.rest.webservices.restfulweb0services.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    //GET
    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    //GET
    @GetMapping(path = "/users/{id}")
    public User retrieveUser(@PathVariable Integer id) {
        return userDaoService.findById(id);
    }
}
