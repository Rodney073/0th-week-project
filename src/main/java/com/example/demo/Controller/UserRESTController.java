package com.example.demo.Controller;

//import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRESTController {
/*
    private final UserService userService;

    @Autowired
    public UserRESTController(UserService userService) {
        this.userService = userService;
    }*/

    @GetMapping("/")
    public String home () {
        return ("<h1>Hello World!<h1/>");
    }


    @GetMapping("/user")
    public String user () {
        return ("<h1>Hello User!<h1/>");
    }

    @GetMapping("/admin")
    public String admin () {
        return ("<h1>Hello Admin!<h1/>");
    }


}
