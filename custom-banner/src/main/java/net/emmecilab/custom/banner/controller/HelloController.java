package net.emmecilab.custom.banner.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mauro Cicolella
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello() throws UnknownHostException {
        String hostname = InetAddress.getLocalHost().getHostName();
        return "Hello from Microservice Demo running on " + hostname + "!!";
    }
}
