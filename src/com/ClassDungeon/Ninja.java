package com.ClassDungeon;
import com.Character.Human;
public class Ninja extends Human{

	public Ninja(int strength, int intelligence, int stealth, int health) {
		super(strength, intelligence, stealth, health);
	}
	
	Human NinjaClass = new Human(3,3,10,100);
	
	public void steal() {
		System.out.println("Con la habilidad 'Steal', roba salud del enemigo segun el sigilo del personaje");
		health += stealth;
	}
	
	public void runAway() {
		System.out.println("Con la habilidad 'Run Away', pierde 10 puntos de vida, pero aumenta su velocidad");
		health -= 10;
	}
}
