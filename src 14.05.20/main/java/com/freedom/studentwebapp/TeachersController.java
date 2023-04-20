package com.freedom.studentwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "alma", method = RequestMethod.GET)
public class TeachersController {

    @RequestMapping(value = "alma", method = RequestMethod.GET)
    public String main(){
        return "main";
    }
}
