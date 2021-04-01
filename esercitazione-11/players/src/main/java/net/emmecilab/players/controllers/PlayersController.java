package net.emmecilab.players.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @ApiOperation(value = "View a list of players")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved list")
        ,
       @ApiResponse(code = 401, message = "You are not authorized to access this resource")
        ,
       @ApiResponse(code = 404, message = "List not found")
    })
    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @ApiOperation(value = "Get a player")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved player")
        ,
       @ApiResponse(code = 401, message = "You are not authorized to access this resource")
        ,
       @ApiResponse(code = 404, message = "Player not found")
    })
    @GetMapping("/players/{id}")
    public Player getPlayer(@PathVariable Long id) {
        return playerService.getPlayer(id);
    }

    @ApiOperation(value = "Add a new player")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Player added successfully")
        ,
       @ApiResponse(code = 401, message = "You are not authorized to access this resource")
    })
    @PostMapping("/players")
    public void addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
    }

    @ApiOperation(value = "Update a player")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Player updated successfully")
        ,
       @ApiResponse(code = 401, message = "You are not authorized to access this resource")
        ,
       @ApiResponse(code = 404, message = "Player not found")
    })
    @RequestMapping(value = "/players/{id}", method = RequestMethod.PUT)
    public void updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        playerService.updatePlayer(id, player);
    }

    @ApiOperation(value = "Delete a player")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Player deleted successfully")
        ,
       @ApiResponse(code = 401, message = "You are not authorized to access this resource")
        ,
       @ApiResponse(code = 404, message = "Player not found")
    })
    @RequestMapping(value = "/players/{id}", method = RequestMethod.DELETE)
    public void deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
    }
}
