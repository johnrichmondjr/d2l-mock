package edu.depaul.cdm.se452.d2l_mock.student;


import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentServiceTest {
    @Autowired
    private StudentRepository repo;

    @Autowired
    private MockMvc mvc;

    private static final String studenturl = "/api/students";

    @Test
    public void getStudents() throws Exception{
        ResultActions response = mvc.perform(MockMvcRequestBuilders.get(studenturl));

        int count = (int)repo.count();


        response.andExpect(MockMvcResultMatchers.status().isOk());
		response.andExpect(MockMvcResultMatchers.jsonPath("$.size()", CoreMatchers.is(count)));

    }
    
}
