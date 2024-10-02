package edu.depaul.cdm.se452.d2l_mock.submission;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import edu.depaul.cdm.se452.d2l_mock.submission.dao.AssignmentRepository;
import edu.depaul.cdm.se452.d2l_mock.submission.entity.Assignment;

@SpringBootTest
public class AssignmentRepositoryTest {
    @Autowired
    private AssignmentRepository repo;

    @BeforeEach
    public void addAssignments() {
        var a1 = Assignment.builder()
        .name("HW3")
        .score("0/100")
        .dueDate("2024-10-28 23:59:59")
        .build();
        
        repo.save(a1);
    }


    //Expects 1 more assignment added on top of the two in data.sql
    @Test
    public void addAssignmentsAndFindAll() {
        long count = repo.count();
        List<Assignment> findAll = repo.findAll();

        assertNotEquals(0, count);
        assertEquals(3, findAll.size());

    }
    
}
