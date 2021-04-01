package net.emmecilab.players.components;

import javax.annotation.PostConstruct;
import net.emmecilab.players.models.Player;
import net.emmecilab.players.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class H2DataLoader implements CommandLineRunner {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public void run(String... args) throws Exception {
        playerRepository.deleteAll();
        playerRepository.save(new Player("Francesco", "Totti", "Roma", "midfielder"));
        playerRepository.save(new Player("Alessandro", "Del Piero", "Juventus", "forward"));
        playerRepository.save(new Player("Mauro", "Icardi", "Juventus", "forward"));

    }
}
