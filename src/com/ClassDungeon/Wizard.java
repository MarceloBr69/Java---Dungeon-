package com.ClassDungeon;
import com.Character.Human;
public class Wizard extends Human {

	public Wizard(int strength, int intelligence, int stealth, int health) {
		super(strength, intelligence, stealth, health);
	}
	Human WizardClass = new Human(3,8,3,50);
	public void heal(){
		System.out.println("El Wizard puede usar 'Heal', esta habilidad curará al personaje según su inteligencia");
		health += intelligence; 
		System.out.println(health); 
	}
	
	public void FireBall() {
		System.out.println("También posee la habilidad 'Fire Ball' con esta, ataca a un enemigo, quitándole 3*Intelgiencia a un enemigo");
		health -= 3*intelligence;
	}
	
	
}
