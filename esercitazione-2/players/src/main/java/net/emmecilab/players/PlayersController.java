package net.emmecilab.players;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayersController {

	@GetMapping("/players")
	public List<Player> getAllPlayers() {

		List<Player> players = new ArrayList<>();
		players.add(new Player(1, "Francesco", "Totti", "Roma"));
		players.add(new Player(2, "Gonzalo", "Higuain", "Juventus"));
		players.add(new Player(3, "Mauro", "Icardi", "Inter"));

		return players;
	}

}
