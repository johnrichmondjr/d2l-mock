package edu.depaul.cdm.se452.d2l_mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CourseControllerIntegrationTest {

    @Autowired
    private CourseController courseController;

    @Test
    public void contextLoads() {
        assertThat(courseController).isNotNull();
    }
}
