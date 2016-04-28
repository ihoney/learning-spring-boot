package com.example;

import com.example.bookpub.BookPubApplication;
import com.example.bookpub.entity.Book;
import com.example.bookpub.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BookPubApplication.class)
@WebIntegrationTest("server.port:0")
public class BookPubApplicationTests {

	@Autowired
	private WebApplicationContext context;

	@Autowired
	private BookRepository bookRepository;

	@Value("${local.server.port}")
	private int port;

    private MockMvc mockMvc;
    private RestTemplate restTemplate = new TestRestTemplate();

    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

	@Test
	public void contextLoads() {
        assertEquals(1, bookRepository.count());
	}

    @Test
    public void webappBookIsbnApi() {
        Book book = restTemplate.getForObject("http://localhost:" + port + "/books/978-1-78528-415-1", Book.class);
        assertNotNull(book);
        assertEquals("Packt", book.getPublisher().getName());
    }

    @Test
    public void webappPublisherApi() throws Exception {
        mockMvc.perform(get("/publishers/1")).
                andExpect(status().isOk()).
                andExpect(content().contentType(MediaType.parseMediaType("application/hal+json"))).
                andExpect(content().string(containsString("Packt"))).
                andExpect(jsonPath("$.name").value("Packt"));
    }
}
