package com.gerasimenko.booklibrary.controller;

import com.gerasimenko.booklibrary.dao.DAOFactory;
import com.gerasimenko.booklibrary.dao.interfaces.IDAOLibraryUser;
import com.gerasimenko.booklibrary.entity.LibraryUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;

@Controller
@SessionAttributes("user")
public class Login {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "login_enter", method = RequestMethod.POST)
    public String loginEnter(@RequestParam Map<String, String> allRequestParams, ModelMap model) {
        String login = allRequestParams.get("login");
        String pass = allRequestParams.get("password");
        String page;
  //      ModelAndView modelAndView = new ModelAndView();
        IDAOLibraryUser userDAO = DAOFactory.createDAOLibraryUser();
        if (userDAO.checkUserPassword(login, pass) && userDAO.isUserNotBanned(login)) {
            LibraryUser libraryUser = userDAO.findUserByNick(login);
            Integer nock = libraryUser.getBooksAmount();
        //    System.out.println(libraryUser.);
       //     modelAndView.addObject("user", libraryUser);
            model.addAttribute("user", libraryUser);
            page = "mainPage";
        } else {
            if (!userDAO.isUserNotBanned(login)) model.put("errorMessage", "BAN_ERROR_MESSAGE");
            if (!userDAO.checkUserPassword(login, pass)) model.put("errorMessage", "LOGIN_ERROR_MESSAGE");
            page = "login";
        }
  //      modelAndView.setViewName(page);
  //      return modelAndView;
        return page;
    }

    @RequestMapping(value = "login_regist", method = RequestMethod.POST)
    public String loginRegist(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public String registration(ModelMap model) {
        return "registration";
    }
}
