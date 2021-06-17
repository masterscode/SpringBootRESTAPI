package rest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import rest.entities.microservices.GitProfile;

@RestController
public class MicroServiceDemo {
    @Autowired
    private WebClient.Builder webClient;

    private final String childService = "localhost:5000";

    @GetMapping("/m")
    public GitProfile getGitProfile(){
        return webClient
                .build()
                .get()
                .uri(childService +"/webclient")
                .retrieve()
                .bodyToMono(GitProfile.class)
                .block();
    }
}
