package webApp_controller_IntigrationTest;

import org.example.mymavenassignment.WebApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = WebApp.class)
public class WebAppIntegrationTest {

    @LocalServerPort
    private int port;

    private final TestRestTemplate restTemplate = new TestRestTemplate(HttpClientOption.ENABLE_REDIRECTS);

    @Test
    public void testHelloWorldEndpoint_returnsHelloWorld() {
        String url = "http://localhost:" + port + "/webapp";
        String response = restTemplate.getForObject(url, String.class);
        assertEquals("Hello, World!", response);
    }

}
