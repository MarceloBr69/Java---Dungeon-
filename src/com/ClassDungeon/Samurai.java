package com.ClassDungeon;
import com.Character.Human;
public class Samurai extends Human {

	public Samurai(int strength, int intelligence, int stealth, int health) {
		super(strength, intelligence, stealth, health);
	}
	Human SamuraiClass = new Human(3,3,3,200);
	
	public void deathBlow() {
		System.out.println("Con la habilidad 'Death Blow' asesinarás a un enemigo, sacrificando el 50% de tu vida total.");
		health /= 2;
		
	}
	public void meditate() {
		System.out.println("Con la habiliadad 'Mediate', el Samurai se curará un 50% de su vida máxima.");
		health += (health/2);
	}
	public void howMany() {
		System.out.println("Actualmente el Samurai tiene " + health + " puntos de vida.");
	}

}
