package no.kristiania.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpClientTest {
    @Test
    void shouldRecieveStatus() {
        HttpClient client = new HttpClient("httpbin.org", 80, "/status/200");
        assertEquals(200, client.getStatusCode());
    }
}
