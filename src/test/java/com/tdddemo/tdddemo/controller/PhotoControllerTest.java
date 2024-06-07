package com.tdddemo.tdddemo.controller;

import com.tdddemo.tdddemo.PhotoController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest(PhotoController.class)
@AutoConfigureMockMvc
public class PhotoControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
     void shouldFindAllPhotos() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/photos"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(3)));

    }

}
