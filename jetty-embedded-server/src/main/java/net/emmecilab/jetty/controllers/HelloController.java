package net.emmecilab.jetty.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mauro Cicolella
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello()  {
        return "Hello world from Spring Boot!!";
    }
}
