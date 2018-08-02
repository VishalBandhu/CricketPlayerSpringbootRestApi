/**
 * 
 */
package com.mindtree.cricket.player.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.cricket.player.api.exception.PlayerNotFoundException;
import com.mindtree.cricket.player.api.model.CrickInfo;
import com.mindtree.cricket.player.api.model.Player;
import com.mindtree.cricket.player.api.repository.CrickInfoRepository;
import com.mindtree.cricket.player.api.repository.PlayerRepository;

/**
 * @author M1018383
 *
 */
@Service

public class PlayerService implements IPlayerService {
	
	@Autowired
    private PlayerRepository playerRepository;
	
	@Autowired
	private CrickInfoRepository crickInfoRepository;

	@Override
	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

	@Override
	public Player getPlayerByName(String name) throws Exception {
		Optional<Player> player = playerRepository.findById(name);
		if (!player.isPresent()) {
			throw new PlayerNotFoundException();
		}
		return player.get();
	}

	@Override
	public Player savePlayer(Player player) {
		return playerRepository.save(player);
	}
	@Override
	public Player updatePlayer(String name, Player playerParam) {
		Optional<Player> playerOp = playerRepository.findById(name);
		Player player = playerOp.get();
		player.setScore(playerParam.getScore());
        player.setNumberOfMatches(playerParam.getNumberOfMatches());
        Player updatedPlayer = playerRepository.save(player);
        return updatedPlayer;
	}

	@Override
	public void deletePlayer(String name) {
		Optional<Player> player = playerRepository.findById(name);
		playerRepository.delete(player.get());
	}

	@Override
	public CrickInfo savePlayerCrickInfo(CrickInfo crickInfo) {
		return crickInfoRepository.save(crickInfo);
	}
}
