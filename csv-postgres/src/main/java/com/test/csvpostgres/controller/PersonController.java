package com.test.csvpostgres.controller;

import com.test.csvpostgres.service.PersonService;
import com.test.csvpostgres.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class PersonController {

    @Autowired
    PersonService personService;

    @Autowired
    public PersonServiceImpl ps;

    @RequestMapping("/")
    public String startPage() {
        return "startPage";
    }

    @RequestMapping("/startPage")
    public String backStartPage() {
        return "startPage";
    }

    @RequestMapping("csv")
    public void setDateInDB(){
        ps.savePersonData();
    }

    @GetMapping("getPersonLastHour")
    public String getPersonLastHour(Model model) {
        model.addAttribute("getPersonLastHour",  ps.getPersonLastHour());
        return "showPersonLastHour";
    }

    @GetMapping("getPersonStartButNotSend")
    public String getPersonStartButNotSend(Model model) {
        model.addAttribute("getPersonStartButNotSend", ps.getPersonStartButNotSend());
        return "showPersonStartButNotSend";
    }

    @GetMapping("getBest5Form")
    public String getBest5Form(Model model){
        model.addAttribute("getBest5Form", ps.getBest5Form());
        return "showBest5Form";
    }
}
