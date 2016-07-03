package com.gerasimenko.booklibrary.controller;

import com.gerasimenko.booklibrary.entity.LibraryUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class Localization {

    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String welcome(ModelMap model) {
        return "welcome";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "login";
    }
    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public String registration(ModelMap model) {
        return "registration";
    }

    @RequestMapping(value = "login_enter", method = RequestMethod.GET)
    public String loginEnter(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "mainPage", method = RequestMethod.GET)
    public String mainPage(@ModelAttribute LibraryUser user, ModelMap model) {
        System.out.println(user.getIdTypeUser());
        return "mainPage";
    }
}
