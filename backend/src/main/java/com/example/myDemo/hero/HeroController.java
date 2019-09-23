package com.example.myDemo.hero;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class HeroController {

	@Autowired
	private HeroesHardcodedService heroManagementService;

	@GetMapping("/heroes")
	public List<Hero> getAllHeroes() {
		return heroManagementService.findAll();
	}

	@GetMapping("/heroes/{id}")
	public Hero getHero(@PathVariable long id) {
		return heroManagementService.findById(id);
	}

	@DeleteMapping("/heroes/{id}")
	public ResponseEntity<Void> deleteHero(@PathVariable long id) {

		Hero hero = heroManagementService.deleteById(id);

		if (hero != null) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.notFound().build();
	}

	@PutMapping("/heroes")
	public ResponseEntity<Hero> updateHero(@RequestBody Hero hero) {

		heroManagementService.save(hero);

		return new ResponseEntity<Hero>(hero, HttpStatus.OK);
	}

	@PostMapping("/heroes")
	public ResponseEntity<Hero> saveHero(@RequestBody Hero hero) {

		heroManagementService.save(hero);

		return new ResponseEntity<Hero>(hero, HttpStatus.OK);
		
	}

}