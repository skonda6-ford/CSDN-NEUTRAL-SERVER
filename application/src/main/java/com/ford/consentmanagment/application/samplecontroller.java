package com.ford.consentmanagment.application;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class samplecontroller {




    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public void greeting()
    {
        System.out.println("In greeting controller");
    }
}