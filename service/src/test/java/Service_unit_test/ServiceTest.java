package Service_unit_test;

import org.example.mymavenassignment.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Service.class})
public class ServiceTest {
    @Autowired
    Service service;

    @Test
    public void testGetStatement() {
        String expectedOutput = service.getStatement();
        System.out.println(expectedOutput);
        assertEquals("Hello, I am Service class.", expectedOutput);
    }

}
