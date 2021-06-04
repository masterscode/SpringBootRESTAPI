package rest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.entities.microservices.GitProfile;

@RestController
public class MicroServiceDemo {
    @GetMapping("/m")

    public GitProfile getGitProfile(){
        return null;
    }
}
