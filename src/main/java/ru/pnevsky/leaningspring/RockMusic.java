package ru.pnevsky.leaningspring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

	@Override
	public String getSong() {
		return "Show must go on";
	}

}

