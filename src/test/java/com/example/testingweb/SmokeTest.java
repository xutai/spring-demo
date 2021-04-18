package com.example.testingweb;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
//@DirtiesContext

public class SmokeTest {

    @Autowired
    private HomeController controller;

    @Test
    public void contextLoads() throws RuntimeException {
        assertThat(controller).isNotNull();
    }

}
