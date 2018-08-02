/**
 * 
 */
package com.mindtree.cricket.player.api;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.mindtree.cricket.player.api.model.Player;
import com.mindtree.cricket.player.api.repository.PlayerRepository;
import com.mindtree.cricket.player.api.service.PlayerService;

/**
 * @author M1018383
 *
 */
public class PlayerServiceTest {

	@Mock
	private PlayerRepository playerRepository;
	
	@InjectMocks
	private PlayerService playerService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testGetAllPlayers(){
		List<Player> playerList = new ArrayList<Player>();
		Player player1 = new Player("sachin", "100", "8000");
		Player player2 = new Player();
		player2.setName("ganguly");
		player2.setNumberOfMatches("11");
		player2.setScore("1000");
		player2.getName();
		player2.getNumberOfMatches();
		player2.getScore();
		playerList.add(player1);
		Mockito.when(playerRepository.findAll()).thenReturn(playerList);
		List<Player> result = playerService.getAllPlayers();
		Mockito.verify(playerRepository, Mockito.times(1)).findAll();
		assertEquals(1, result.size());
	}

}
