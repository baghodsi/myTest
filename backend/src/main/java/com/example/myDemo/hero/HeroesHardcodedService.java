package com.example.myDemo.hero;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HeroesHardcodedService {

	private static List<Hero> heroes = new ArrayList<>();
	private static long idCounter = 0;

	static {
		heroes.add(new Hero(++idCounter, "10001", "Ali", "26", "123456"));
		heroes.add(new Hero(++idCounter, "10001", "Hamid", "45", "545456"));
		heroes.add(new Hero(++idCounter, "10002", "Vali", "52", "214555"));
		heroes.add(new Hero(++idCounter, "10002", "Hamed", "18", "546888"));
		heroes.add(new Hero(++idCounter, "10001", "Yaser", "34", "788655"));
	}

	public List<Hero> findAll() {
		return heroes;
	}

	public Hero save(Hero hero) {
		if (hero.getId() == -1 || hero.getId() == 0) {
			hero.setId(++idCounter);
			heroes.add(hero);
		} else {
			deleteById(hero.getId());
			//hero.setId(++idCounter);
			heroes.add(hero);
		}
		return hero;
	}

	public Hero deleteById(long id) {
		Hero hero = findById(id);

		if (hero == null)
			return null;
		if (heroes.remove(hero)) {
			return hero;
		}
		return null;
	}

	public Hero findById(long id) {
		for (Hero hero : heroes) {
			if (hero.getId() == id) {
				return hero;
			}
		}
		return null;
	}
}