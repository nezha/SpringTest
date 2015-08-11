package hello;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private static final Logger log = (Logger) LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args){
		SpringApplication.run(Application.class);
	}
	//this implements method
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());
	}
	
	
}
