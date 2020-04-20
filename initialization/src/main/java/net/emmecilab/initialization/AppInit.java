package net.emmecilab.initialization;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class AppInit {

    @PostConstruct
    public void init() {
        System.out.println("Eseguito il metodo init() della classe AppInit");
    }
}
