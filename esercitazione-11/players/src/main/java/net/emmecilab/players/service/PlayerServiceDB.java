package net.emmecilab.players.service;

import net.emmecilab.players.model.Player;
import net.emmecilab.players.repository.PlayerRepository;
import net.emmecilab.players.service.PlayerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PlayerServiceDB implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayer(Long id) {
        Optional<Player> player = this.playerRepository.findById(id);
          if (player.isPresent()) {
              return player.get();
          } else {
            return null;
          }
    }

    public void addPlayer(Player player) {
        playerRepository.save(player);
    }

    public void updatePlayer(Long id, Player player) {
        playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

}
