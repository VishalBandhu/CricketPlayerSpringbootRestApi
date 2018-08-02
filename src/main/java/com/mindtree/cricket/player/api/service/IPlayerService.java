/**
 * 
 */
package com.mindtree.cricket.player.api.service;

import java.util.List;
import java.util.Optional;

import com.mindtree.cricket.player.api.model.CrickInfo;
import com.mindtree.cricket.player.api.model.Player;

/**
 * @author M1018383
 *
 */
public interface IPlayerService {
	public List<Player> getAllPlayers();
	public Player getPlayerByName(String name) throws Exception;
	public Player savePlayer(Player player);
	public Player updatePlayer(String name, Player player);
	public void deletePlayer(String name);
	public CrickInfo savePlayerCrickInfo(CrickInfo crickInfo);
}
