package net.emmecilab.players.controllers;

import java.util.List;
import net.emmecilab.players.models.Player;
import net.emmecilab.players.services.PlayerServiceDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayersController {

    @Autowired
    private PlayerServiceDB playerService;

    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/players/{id}")
    public Player getPlayer(@PathVariable Long id) {
        return playerService.getPlayer(id);
    }

    @PostMapping("/players")
    //Alternative
    //@RequestMapping(value = "/players", method = RequestMethod.POST)
    public void addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
    }

    @RequestMapping(value = "/players/{id}", method = RequestMethod.PUT)
    public void updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        playerService.updatePlayer(id, player);
    }

    @RequestMapping(value = "/players/{id}", method = RequestMethod.DELETE)
    public void deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
    }
}
