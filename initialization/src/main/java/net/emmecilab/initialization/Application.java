package net.emmecilab.initialization;

import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("Eseguito il metodo postConstruct() della classe Application");
    }

}
