package com.projectwithsecurity.wildcodeschool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }
    @GetMapping("/avengers/assemble")
    public String shield() {
        return "Avengers... Assemble";
    }
    @GetMapping("/secret-bases")
    public ArrayList<String>   wildschool() {
        ArrayList<String> listEcoles = new ArrayList<String>();
        listEcoles.add("Biarits");
        listEcoles.add("Bordeaux");
        listEcoles.add("Marseille");
        listEcoles.add("Paris");
        listEcoles.add("Loupe");
        listEcoles.add("Orléans");
        listEcoles.add("Metz");
        listEcoles.add("Lille");
        listEcoles.add("Lyon");
        listEcoles.add("Nantes");
        listEcoles.add("Tours");
        listEcoles.add("Reins");
        listEcoles.add("Strasbourg");
        listEcoles.add("Toulouse");
        listEcoles.add("Amsterdam");
        return  listEcoles;
    }


}
