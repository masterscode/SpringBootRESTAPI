package rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.entities.Location;
import rest.repos.LocationRepository;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository repository;

    public  List<Location> getAllLocations(){
        return repository.findAll();
    }
}
