/**
 * 
 */
package com.mindtree.cricket.player.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.cricket.player.api.model.Player;

/**
 * @author M1018383
 *
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

}
