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
@Table(name = "crickinfo")
public class CrickInfo {
	@Id
	private String pid;
	private String country;	
	private String battingStyle;
	private String bowlingStyle;
	
	public CrickInfo() {
		super();
	}
	public CrickInfo(String pidParam, String countryParam, String battingStyleParam, String bowlingStyleParam) {
		super();
		this.pid = pidParam;
		this.country = countryParam;
		this.battingStyle = battingStyleParam;
		this.bowlingStyle = bowlingStyleParam;
	}
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBattingStyle() {
		return battingStyle;
	}
	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}
	public String getBowlingStyle() {
		return bowlingStyle;
	}
	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
}
