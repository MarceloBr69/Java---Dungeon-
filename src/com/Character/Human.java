package com.Character;

public class Human {
	public int strength;
	public int  intelligence;
	public int  stealth;
	public int  health;
	
	public Human(int strength, int intelligence, int stealth, int health) {
		this.strength = strength; 
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
	
	
}
