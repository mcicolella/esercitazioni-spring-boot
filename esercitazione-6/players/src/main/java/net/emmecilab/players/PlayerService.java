package net.emmecilab.players;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService {

	private List<Player> players = new ArrayList<>(Arrays.asList(new Player(1, "Francesco", "Totti", "Roma", "midfielder"),
			new Player(2, "Gonzalo", "Higuain", "Juventus", "forward"), new Player(3, "Mauro", "Icardi", "Inter", "forward")));

	public List<Player> getAllPlayers() {
		return players;
	}

	public Player getPlayer(int id) {

		return players.stream()
				.filter(p -> p.getId() == id)
				.findFirst()
				.get();
	}
	
	public void addPlayer(Player player){
		players.add(player);
	}

	public void updatePlayer(int id, Player player) {
		for(int i=0; i < players.size(); i++){
			Player p = players.get(i);
			if(p.getId()==id){
				players.set(i, player);
			}
		}
		
	}

	public void deletePlayer(int id) {
		players.removeIf(p -> p.getId()==id);
		
	}

}
