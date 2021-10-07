package net.emmecilab.players;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import net.emmecilab.players.model.Player;
import net.emmecilab.players.repository.PlayerRepository;

@DataJpaTest
@Testcontainers
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PlayerRepositoryTests {

	@Container
	MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:latest")
			.withDatabaseName("players")
			.withUsername("emmecilab")
			.withPassword("emmecilab");
	
	@Autowired
	PlayerRepository playerRepository;
	

	@Test
	void shouldSavePlayer() {
      Player newPlayer = new Player(null, "Ciro", "Immobile", "Lazio", "forwarder");
      Player savedPlayer = playerRepository.save(newPlayer);
      assertThat(savedPlayer).usingRecursiveComparison()
      .ignoringFields("id").isEqualTo(newPlayer);
	}

}
