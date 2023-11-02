package bj.highfive.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/abums")
public class AlbumController {

	@Autowired

	AlbumRepository albumRepository;

	@PostMapping("/albums")
	public Iterable<Album> getAlbums() {
		return this.albumRepository.findAll();
	}

	private List<Album> generateAlbums() {

		Album album1 = new Album(

				"REF-001",
				"Example Title",
				"This is an example description.",
				"2 hours",
				true,
				"https://www.example.com",
				Arrays.asList("tag1", "tag2", "tag3"),
				"100",
				"John Doe"

		);
		Album album2 = new Album(

				"REF-002",
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
