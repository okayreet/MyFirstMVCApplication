package com.example.myfirstmvcapp.controller;


//import com.example.myfirstmvc.user.User;
//import com.example.myfirstmvc.user.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//

import com.example.myfirstmvcapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@Controller
public class UserController {

    private final UserService userService;
    private final ModelAndView modelAndView = new ModelAndView();

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ModelAndView getUsers(@RequestParam(value = "user_name", required = false) String user_name, Model model) {

        if (user_name == null || user_name.isBlank() || user_name.isEmpty()) {
            model.addAttribute("users", userService.getUsers());
        } else {
            model.addAttribute("users", userService.getUserByName(user_name.toLowerCase().trim()));
        }

        modelAndView.setViewName("users");
        return modelAndView;
    }

    @GetMapping({"/", "", "login", "home"})
    private ModelAndView getIndex() {
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
