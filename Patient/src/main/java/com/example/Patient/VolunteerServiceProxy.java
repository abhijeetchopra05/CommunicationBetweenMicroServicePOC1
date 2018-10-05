package com.example.Patient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "VolunteerService")
public interface VolunteerServiceProxy
{
    @RequestMapping(value = "/volunteers/{servicename}", method = RequestMethod.GET)
    List< String > getVolunteers(@PathVariable("servicename") String servicename);
}