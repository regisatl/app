package bj.highfive.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@Controller
@RequestMapping(path = "/api")
public class AlbumController {

	@Autowired
	AlbumRepository albumRepository;

	// create
	@PostMapping("/album")
	public @ResponseBody Album createAlbum(@RequestBody Album album) {
		return this.albumRepository.save(album);
	}

	@PostMapping("/albums")
	public @ResponseBody Iterable<Album> createAlbums(@RequestBody List<Album> albums) {
		return this.albumRepository.saveAll(albums);
	}

	@GetMapping("/albums")
	public @ResponseBody Iterable<Album> getAlbums() {
		return this.albumRepository.findAll();
	}

	// show
	@GetMapping("/albums/{id}")
	public @ResponseBody Album getAlbumById(@PathVariable Long id) {

		return this.albumRepository.findById(id).orElse(null);

	}

	// update
	@PutMapping("/albums")
	public @ResponseBody Album updateAlbum(@RequestBody Album album) {
		Album existingAlbum = this.albumRepository.findById(album.getId()).orElse(null);
		existingAlbum.setRef(album.getRef());
		existingAlbum.setName(album.getName());
		existingAlbum.setTitle(album.getTitle());
		existingAlbum.setDescription(album.getDescription());
		existingAlbum.setDuration(album.getDuration());
		existingAlbum.setStatus(album.getStatus());
		existingAlbum.setUrl(album.getUrl());
		existingAlbum.setTags(album.getTags());
		existingAlbum.setLike_count(album.getLike_count());

		return this.albumRepository.save(existingAlbum);
	}

	// delete
	@DeleteMapping("/albums/{id}")
	public @ResponseBody String deleteAlbum(@PathVariable Long id) {
		this.albumRepository.deleteById(id);
		return "The album with the id " + id + " was successfully deleted";
	}

}
