package rest.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.entities.Location;
import rest.services.LocationService;

import java.util.List;

@RequestMapping("/location")
@RestController
public class LocationController {

    @Autowired
    private LocationService service;

    @GetMapping
    public ResponseEntity<List<Location>> allLocations(){
        List<Location> locations = service.getAllLocations();
        return new ResponseEntity<List<Location>>(locations,HttpStatus.OK);
    }
}
