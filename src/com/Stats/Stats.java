package com.Stats;
import com.Character.Human;
import java.util.Scanner;
import com.ClassDungeon.Wizard;
import com.ClassDungeon.Ninja;
import com.ClassDungeon.Samurai;
public class Stats extends Human{

	public Stats(int strength, int intelligence, int stealth, int health) {
		super(strength, intelligence, stealth, health);
	}
	
	public void ClassCharacter() {
		Scanner input = new Scanner(System.in);
		System.out.println("Existen tres clases para escoger como humano: ");
		System.out.println("Samurai, Ninja y Wizard.");
		System.out.println("Escoge uno.");
		String Class = input.nextLine();
		System.out.println("Haz escogido: "+ Class + ".");
		
		switch(Class) {
			case "Samurai": {
				Samurai samuraiClass = new Samurai(3,3,3,200);
				Human samuraiClassStats = new Human(3,3,3,200);
				samuraiClass.deathBlow();
				samuraiClass.meditate();
				samuraiClass.howMany();
				System.out.println("Tus estadísticas como Ninja son: ");
				System.out.println("Fortaleza: "+samuraiClassStats.getStrength()+".");
				System.out.println("Inteligencia: "+samuraiClassStats.getIntelligence()+".");
				System.out.println("Sigilo: "+samuraiClassStats.getStealth()+".");
				System.out.println("Puntos de golpe: "+samuraiClassStats.getHealth()+".");
				break;
			}
			case "Ninja":{
				Ninja ninjaClass = new Ninja(3,3,10,100);
				Human ninjaClassStats = new Human(3,3,10,100);
				ninjaClass.steal();
				ninjaClass.runAway();
				System.out.println("Tus estadísticas como Ninja son: ");
				System.out.println("Fortaleza: "+ninjaClassStats.getStrength()+".");
				System.out.println("Inteligencia: "+ninjaClassStats.getIntelligence()+".");
				System.out.println("Sigilo: "+ninjaClassStats.getStealth()+".");
				System.out.println("Puntos de golpe: "+ninjaClassStats.getHealth()+".");
				break;
			}
			case "Wizard": {
				Wizard wizardClass = new Wizard(3,8,3,50);
				Human wizardClassStats = new Human(3,8,3,50);
				wizardClass.heal(); 
				wizardClass.FireBall();
				System.out.println("Tus estadisticas como Wizard son:");
				System.out.println("Fortaleza: "+ wizardClassStats.getStrength()+".");
				System.out.println("Inteligencia: "+wizardClassStats.getIntelligence()+".");
				System.out.println("Sigilo: "+wizardClassStats.getStealth()+".");
				System.out.println("Puntos de golpe: "+wizardClassStats.getHealth()+".");
				break;
			}
		}
	}
	
	
	
	
	
}
