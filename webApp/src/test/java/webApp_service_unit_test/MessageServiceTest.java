package webApp_service_unit_test;

import org.example.mymavenassignment.webApp_services.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MessageService.class})
public class MessageServiceTest {

    @Autowired
    private MessageService messageService;

    @Test
    public void getMessage_withInputString_shouldReturnExpectedMessage() {
        String expectedMessage = "Hello, World!";
        String actualMessage = messageService.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void getMessage_shouldReturnNonNullMessage() {
        String message = messageService.getMessage();
        assertNotNull(message);
    }

    @Test
    public void getMessage_shouldReturnNonEmptyMessage() {
        String message = messageService.getMessage();
        assertFalse(message.isEmpty());
    }

}

