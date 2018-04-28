package com.friends.friendsquiz.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.friends.friendsquiz.constants.TestConstants;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mvc;
    
    @Test
	public void testHomeApi() throws Exception {
    	
    	 mvc.perform(get("/")
                 .contentType(MediaType.TEXT_HTML)).andExpect(status().isOk())
                 .andExpect(content().contentType(TestConstants.CONTENT_TYPE_HTML_CHARSET_UTF_8));    	 
    
	}

}
