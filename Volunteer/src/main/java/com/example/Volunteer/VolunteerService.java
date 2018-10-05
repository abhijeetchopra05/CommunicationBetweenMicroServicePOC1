package com.example.Volunteer;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class VolunteerService {
    @Autowired
    DataInitializer initializer;
    public VolunteerService() {
        super();
    }
    public List< String > findVolunteers(String servicename) {
        List < String > volnames = new ArrayList<>();
        List < Volunteer > vols = initializer.vols;
        for (Volunteer vol: vols) {
            System.out.println(vol.getServices() + ":" + vol.getFirstname());
            if (vol.getServices().contains(servicename)) {
                volnames.add(vol.getFirstname() + " " + vol.getLastname());
            }
        }
        return volnames;
    }
}
