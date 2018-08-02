/**
 * 
 */
package com.mindtree.cricket.player.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.cricket.player.api.model.Player;
import com.mindtree.cricket.player.api.service.IPlayerService;
import com.mindtree.cricket.player.api.model.StatusResp;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
/**
 * @author M1018383
 *
 */
@RestController
public class CricketPlayerAPIController {
	@Autowired
    IPlayerService playerService;

    @GetMapping("/players")
    @ApiOperation(value = "get player details ")
	@ApiResponses({ @ApiResponse(code = 200, message = "player details has been found "),
			@ApiResponse(code = 400, message = "player details may not exist "),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping("/players")
    @ApiOperation(value = "create a new player", response = StatusResp.class)
	@ApiResponses({ @ApiResponse(code = 200, message = "player created successfully"),
			@ApiResponse(code = 400, message = "player has not been created successfully"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    public Player createPlayer(@Valid @RequestBody Player player) {
        return playerService.savePlayer(player);
    }

    @GetMapping("/player/{name}")
    @ApiOperation(value = "get player details by name ")
	@ApiResponses({ @ApiResponse(code = 200, message = "player details has been found by name  "),
			@ApiResponse(code = 400, message = "player details may not exist "),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    public ResponseEntity<Player> getPlayerByName(@PathVariable(value = "name") String name) {
    	Player playerByName = null;
    	try {
			playerByName = playerService.getPlayerByName(name);
		} catch (Exception ex) {
			return new ResponseEntity<Player>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Player>(playerByName, HttpStatus.OK);
    }

    @PutMapping("/player/{name}")
    @ApiOperation(value = "create a new player", response = StatusResp.class)
	@ApiResponses({ @ApiResponse(code = 200, message = "player created successfully"),
			@ApiResponse(code = 400, message = "player has not been created successfully"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    public Player updatePlayer(@PathVariable(value = "name") String name,
                                           @Valid @RequestBody Player playerParam) {
        return playerService.updatePlayer(name, playerParam);
    }

    @DeleteMapping("/player/{name}")
    @ApiOperation(value = "delete player by their id")
	@ApiResponses({ @ApiResponse(code = 200, message = "player has been Deleted successfully"),
			@ApiResponse(code = 400, message = "Unable to Delete player"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    public ResponseEntity<?> deletePlayer(@PathVariable(value = "name") String name) {
    	playerService.deletePlayer(name);
        return ResponseEntity.ok().build();
    }
}
