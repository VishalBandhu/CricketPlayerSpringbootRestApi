/**
 * 
 */
package com.mindtree.cricket.player.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author M1018383
 *
 */
@Entity
@Table(name = "players")
public class Player {
	@Id
	private String name;
	private String numberOfMatches;
	private String score;
	
	public Player() {
		super();
	}

	public Player(String nameParam, String numberOfMatchesParam, String scoreParam) {
		super();
		this.name = nameParam;
		this.numberOfMatches = numberOfMatchesParam;
		this.score = scoreParam;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param id the id to set
	 */
	public void setName(String nameParam) {
		this.name = nameParam;
	}

	/**
	 * @return the numberOfMatches
	 */
	public String getNumberOfMatches() {
		return numberOfMatches;
	}

	/**
	 * @param playerName the numberOfMatches to set
	 */
	public void setNumberOfMatches(String numberOfMatchesParam) {
		this.numberOfMatches = numberOfMatchesParam;
	}

	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}

	/**
	 * @param highestScore the highestScore to set
	 */
	public void setScore(String ScoreParam) {
		this.score = ScoreParam;
	}
}
