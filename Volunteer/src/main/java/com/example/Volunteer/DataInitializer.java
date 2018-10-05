package com.example.Volunteer;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component

public class DataInitializer {
    public static List< Volunteer > vols = new ArrayList< Volunteer >();
    public DataInitializer() {
        super();
        System.out.println("Initializing data...");
        initializeData();
    }
    public void initializeData() {
        Volunteer vol1 = new Volunteer();
        Volunteer vol2 = new Volunteer();
        Volunteer vol3 = new Volunteer();

        vol1.setFirstname("Jason");
        vol1.setLastname("Brenner");
        vol1.setServices("droptoschool");


        vol2.setFirstname("David");
        vol2.setLastname("Kelly");
        vol2.setServices("droptoschool");

        vol3.setFirstname("John");
        vol3.setLastname("Lebannon");
        vol3.setServices("droptoschool");

        vols.add(vol1);
        vols.add(vol2);
        vols.add(vol3);
        System.out.println("Number of Volunteers:" + vols.size());
    }
}