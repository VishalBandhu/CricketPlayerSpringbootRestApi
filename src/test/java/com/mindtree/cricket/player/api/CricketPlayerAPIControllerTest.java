/**
 * 
 */
package com.mindtree.cricket.player.api;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mindtree.cricket.player.api.model.Player;

/**
 * @author M1018383
 *
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CricketPlayerSpringbootRestApiApplication.class)
@SpringBootTest
public class CricketPlayerAPIControllerTest {
	private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;
	@Before
	public void testSetUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();		
    }

	/*@Test
    public void testGetAllPlayers() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/players").accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.*", hasSize(4))).andDo(print());
    }*/
	/*@Test
    public void testCreatePlayer() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/players")
		        .contentType(MediaType.APPLICATION_JSON)
		        .content("{\"name\" : \"fgh\", \"numberOfMatches\" : \"4\",\"score\" : \"96\" }")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.name").exists())
				.andExpect(jsonPath("$.numberOfMatches").exists())
				.andExpect(jsonPath("$.score").exists())
				.andDo(print());
    }*/
	
	/*@Test
	public void testGetPlayerByName() throws Exception {
		mockMvc.perform(
				MockMvcRequestBuilders.get("/player/dhoni").accept(
						MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.name").exists())
				.andExpect(jsonPath("$.numberOfMatches").exists())
				.andExpect(jsonPath("$.score").exists()).andDo(print());
	}*/
	
	/*@Test
	public void testUpdatePlayer() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/player/dhoni")
		        .contentType(MediaType.APPLICATION_JSON)
		        .content("{\"name\" : \"df\", \"numberOfMatches\" : \"100\",\"score\" : \"8000\" }")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.name").exists())
				.andExpect(jsonPath("$.numberOfMatches").exists())
				.andExpect(jsonPath("$.score").exists())
				.andDo(print());
	}*/
	
	/*@Test
	public void testDeletePlayer() throws Exception {

		mockMvc.perform(
				MockMvcRequestBuilders.get("/player/dhoni").accept(
						MediaType.APPLICATION_JSON))
				
				.andDo(print());
	}
*/
}
