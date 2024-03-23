package com.Event;
import com.Stats.Stats;
public class Event extends Stats{

	public Event(int strength, int intelligence, int stealth, int health) {
		super(strength, intelligence, stealth, health);
		// TODO Auto-generated constructor stub
	}
	public void EventAsault() {
		System.out.println("Ha ocurrido un evento: ");
		System.out.println("Has sido asaltado por un samurai humano ");
		System.out.println("Se calculará su Fortaleza con tus puntos de golpe ");
		health -= strength; 
		System.out.println("Tus puntos de golpe son: "+health);
	}
}
