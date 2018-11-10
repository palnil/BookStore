package com.yoshallc.herbal.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yoshallc.herbal.controllers.HerbalController;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@ExtendWith(MockitoExtension.class)
@WebAppConfiguration()
@EnableWebMvc
@ContextConfiguration(classes = {HerbalController.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
public class HerbalControllerTest {

    @Autowired
    WebApplicationContext wac;

    private MockMvc mockMvc;

    @BeforeEach
    void Setup(){

        log.info("[Enter] : Setup() in HerbalControllerTest");
    }


    //@Test
    void whenGetAllHerbals_Iscalled_StatusShouldbeOK() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        mockMvc.perform(get("/api/getallherbals"))
                .andDo(print())
                .andExpect(status().isOk());
    }


}
