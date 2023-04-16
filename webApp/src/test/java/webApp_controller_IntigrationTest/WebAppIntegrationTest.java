package webApp_controller_IntigrationTest;


import org.example.mymavenassignment.WebApp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = WebApp.class)
public class WebAppIntegrationTest {

    // Injects the random port number that the web server is running on.
    @LocalServerPort
    private int port;

    // Creates a new instance of TestRestTemplate with HttpClientOption.ENABLE_REDIRECTS option enabled.
    private final TestRestTemplate restTemplate = new TestRestTemplate(HttpClientOption.ENABLE_REDIRECTS);


      //Tests the "/webapp" endpoint to ensure it returns the expected response.
    @Test
    public void testWebAppEndPoint_shouldReturnHelloWorldResponse() {
        // Constructs the URL to the "/webapp" endpoint using the random port number.
        String url = "http://localhost:" + port + "/webapp";

        // Sends a GET request to the "/webapp" endpoint using TestRestTemplate and retrieves the response.
        String response = restTemplate.getForObject(url, String.class);

        // Asserts that the response is "Hello, World!".
        assertEquals("Hello, World!", response);
    }
}