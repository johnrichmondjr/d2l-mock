package edu.depaul.cdm.se452.d2l_mock.student;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import edu.depaul.cdm.se452.d2l_mock.course.*;

@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepo;

    @Test
    public void testStudentRepo(){
        long id1 = 1;
        Student s1 = studentRepo.findById(id1).get();
        assertEquals("Santa", s1.getFirstName());
        assertEquals("Claus", s1.getLastName());
        assertEquals("A Christmas Carol", s1.getProfile().getBooks());
        assertEquals(2, s1.getEnrollments().size());
        List<StudentEnrollment> se1 = s1.getEnrollments();
        Course c = se1.get(0).getCourse();

        assertEquals(1, se1.get(0).getId());
        assertEquals(2, se1.get(1).getId());

        assertEquals("SE 452", c.getName());

    }

}
