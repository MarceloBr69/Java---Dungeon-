package com.Character;
import com.Stats.Stats;
import com.Event.Event;
public class HumanTest {

	public static void main(String[] args) {
		Stats StatsCharacter = new Stats(3, 3, 3, 100);
		StatsCharacter.ClassCharacter();
		//StatsCharacter.StatCharacter();
		Event EventoCharacter = new Event(3, 3, 3, 100);
		EventoCharacter.EventAsault();

	}

}
