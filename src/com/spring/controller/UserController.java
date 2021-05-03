package com.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.User;

@Controller
public class UserController {
	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("userHome", "user", new User());
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("user") User user, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", user.getName());
        model.addAttribute("contactNumber", user.getContactNumber());
        model.addAttribute("id", user.getId());
        return "userView";
    }
}
