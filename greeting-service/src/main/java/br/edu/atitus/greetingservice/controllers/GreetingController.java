package br.edu.atitus.greetingservice.controllers;

<<<<<<< HEAD
import br.edu.atitus.greetingservice.models.GreetingRequest;
import br.edu.atitus.greetingservice.configs.GreetingConfig;
=======
import br.edu.atitus.greetingservice.configs.GreetingConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
>>>>>>> 63fd536 (última atualização)
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

<<<<<<< HEAD
=======
//    @Value("${greeting-service.greeting}")
//    private String greeting;
//    @Value("${greeting-service.default-name}")
//    private String defaultName;

>>>>>>> 63fd536 (última atualização)
    private final GreetingConfig config;

    public GreetingController(GreetingConfig config) {
        this.config = config;
    }

<<<<<<< HEAD
    @GetMapping({"", "/"})
    public String getGreeting(@RequestParam(required = false) String name) {
        if (name == null || name.isEmpty()) {
            name = config.getDefaultName();
        }

        return String.format("%s, %s!!!", config.getGreeting(), name);
    }

    @GetMapping("/{name}")
    public String getGreetingPath(@PathVariable String name) {
        return String.format("%s, %s!!!", config.getGreeting(), name);
    }

    // 👇 AGORA SIM, dentro da classe
    @PostMapping
    public String greetingPost(@RequestBody GreetingRequest request) {
        return String.format("%s, %s!!!", config.getGreeting(), request.getName());
=======

    @GetMapping({"", "/", "/{namePath}"})
    public ResponseEntity<String> getGreeting(
            @RequestParam(required = false) String name,
            @PathVariable(required = false) String namePath
    ) {
        if (name == null) {
            name = namePath != null ? namePath : config.getDefaultName();
        }

        String retorno = String.format("%s %s!!!", config.getGreeting(), name);
        return ResponseEntity.ok(retorno);
>>>>>>> 63fd536 (última atualização)
    }
}