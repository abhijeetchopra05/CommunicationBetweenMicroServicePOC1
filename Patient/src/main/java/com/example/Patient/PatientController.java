package com.example.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    VolunteerServiceProxy proxy;

    @RequestMapping("/")
    public String home() {
        return "Hello World from Patient application";
    }


    @RequestMapping(value = "/volunteernames/{aidname}", method = RequestMethod.GET)
    public List< String > listVolunteernames(@PathVariable("aidname") String aidname) {
        System.out.println("listVolunteers via Feign");
        List < String > volunteers = proxy.getVolunteers(aidname);
        return volunteers;
    }
}
