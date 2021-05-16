package rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.entities.Dog;
import rest.repos.DogRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DogService {
    @Autowired
    DogRepository repository;
    public List<String> retrieveDogBreed(){
        List<Dog> dogsWithTheSameBreed =  getAllDogs();

        return dogsWithTheSameBreed.stream()
                .map(Dog::getBreed)
                .collect(Collectors.toList());
    }
    public String retrieveDogBreedById(Dog dog){
        return repository
                .findDogById(dog.getId())
                .getBreed();
    }
    public List<String> retrieveDogNames(){
        List<Dog> allDogs = getAllDogs();
        return allDogs.stream()
                .map(Dog::getName)
                .collect(Collectors.toList());

    }
    public List<Dog> getAllDogs(){
        return repository.findAll();
    }
}
