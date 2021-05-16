package rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.services.DogService;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {
    @Autowired
    private DogService service;

    @GetMapping("/breeds")
    public ResponseEntity<List<String>> getAvailableBreeds(){
        List<String> breeds = service.retrieveDogBreed();
        return new ResponseEntity<>(breeds, HttpStatus.OK);
    }
    @GetMapping("/names")
    public ResponseEntity<List<String>> getNames(){
        List<String> names = service.retrieveDogNames();
        return new ResponseEntity<>(names, HttpStatus.OK);
    }

}
