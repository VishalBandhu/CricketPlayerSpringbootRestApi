/*package com.mindtree.cricket.player.api.crickinfo;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Before;
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

import com.mindtree.cricket.player.api.CricketPlayerSpringbootRestApiApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CricketPlayerSpringbootRestApiApplication.class)
@SpringBootTest
public class CrickInfoAPIControllerTest {
private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;
	@Before
	public void testSetUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

	@Test
    public void testGetAllPlayers() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/getPlayerStatusFromCrickAPI/35320").accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.*", hasSize(4))).andDo(print());
    }

}
*/