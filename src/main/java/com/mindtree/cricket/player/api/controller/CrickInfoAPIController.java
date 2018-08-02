package com.mindtree.cricket.player.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mindtree.cricket.player.api.exception.PlayerNotFoundException;
import com.mindtree.cricket.player.api.model.CrickInfo;
import com.mindtree.cricket.player.api.service.PlayerService;

@RestController
public class CrickInfoAPIController {
	private static final String baseURL = "http://cricapi.com/api/playerStats?";
	private static final String apikey="&apikey=OetvgqF459TLettXOPBl4J7ZJBG2";
	@Autowired
	private PlayerService playerService;
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@GetMapping("/getPlayerStatusFromCrickAPI/{pid}")
	public CrickInfo getPlayerStatusFromCrickAPI(@PathVariable String pid) throws Exception {
		String crickInfoURL = baseURL+"pid="+pid+apikey;
		CrickInfo crickInfo = restTemplate().getForObject(crickInfoURL, CrickInfo.class);
		if (crickInfo.getPid() == null) {
			throw new PlayerNotFoundException();
		}
		return playerService.savePlayerCrickInfo(crickInfo);
	}
}
