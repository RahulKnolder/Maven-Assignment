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
    public void shouldReturnExpectedMessage() {
        // Given
        String expectedMessage = "Hello, World!";

        // When
        String actualMessage = messageService.getMessage();

        // Then
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void shouldReturnNonNullMessage() {
        // Given - none

        // When
        String message = messageService.getMessage();

        // Then
        assertNotNull(message);
    }

    @Test
    public void shouldReturnNonEmptyMessage() {
        // Given - none

        // When
        String message = messageService.getMessage();

        // Then
        assertFalse(message.isEmpty());
    }


}

