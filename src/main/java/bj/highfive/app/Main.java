package bj.highfive.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

@RestController
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@GetMapping("/albums")
	public List<Album> getAlbums() {
		return generateAlbums();
	}

	private List<Album> generateAlbums() {

		Album album1 = new Album (

			"1",
			"REF-456",
			"Example Title",
			"This is an example description.",
			"2 hours",
			true,
			"https://www.example.com",
			Arrays.asList("tag1", "tag2", "tag3"),
			"100",
			"John Doe"
			
		);
		Album album2 = new Album (
			 "2",
			 "REF-001",
			 "Different Title",
			 "Another description for an example.",
			 "1 hour",
			 false,
			 "https://www.another-example.com",
			Arrays.asList("java", "programming", "example"),
			 "50",
			 "Jane Smith"
			
			
		);

		System.out.println(album1);
		System.out.println(album2);

		return Arrays.asList(album1, album2);
	}

}
