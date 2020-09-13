package Project1;

import java.util.ArrayList;

public class Pokemon {
	String name;
	String type;
	double attack;
	double defense;
	double HP;
	double speed;
	ArrayList<Moves> movesList;
	
	public Pokemon (String name, String type, int attack, int defense, int HP, int speed) {
		this.name = name;
		this.type = type;
		this.attack = attack;
		this.defense = defense;
		this.HP = HP;
		this.speed = speed;
		movesList = new ArrayList<Moves>();
		
	}
	
	public void addMove(String name, String type, int power, int accuracy) {
			movesList.add(new Moves(name, type, power, accuracy));
		}
	
	public void printStats() {
		System.out.printf("%s \nType: %s \nHP: %.0f \nAttack: %.0f \nDefense: %.0f \nSpeed: %.0f\n", 
				this.name, this.type, this.HP, this.attack, this.defense, this.speed);
	}
	
	public void getMoves() {
		for (int i = 0; i < movesList.size(); i++) {
			System.out.print("| " + movesList.get(i).name + " |");
		}
		System.out.println(" ");
	}
		
	public void use(String moveName, Pokemon poke) {
		Moves move = null;
		double damage = 0;
		double temp = poke.HP;
		
		for (int i = 0; i < movesList.size(); i++) {
			if (movesList.get(i).name.toUpperCase().equals(moveName.toUpperCase())) {
				move = movesList.get(i);
				break;
			}
		}
		
		double effect = move.getEffect();
		System.out.println(this.name + " used " + move.name + "!");
		
		if (move.type.equals("HEAL")) {
			this.HP = this.HP + (this.HP*0.25);
			System.out.println(this.name + " has healed itself!");
		} 
		else if (move.type.equals("ATTACK")) {
			poke.attack = poke.attack - (poke.attack*0.1);
			System.out.println(poke.name + " attack stat reduced by 10%!");
		}
		else if (move.type.equals("DEFENSE")) {
			this.defense = this.defense + (this.defense*0.1);
			System.out.println(this.name + " increased its defense!");
		}
		else if (move.type.equals(poke.type)) {
			damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*0.5*effect*move.power);
			// Equation from 
			// https://gaming.stackexchange.com/questions/275646/how-do-the-attack-and-defense-stats-work-in-pok%C3%A9mon-go
			// Multiplier info from
			// https://pokemondb.net/type
		} 
		else {
			if(move.type.equals("FIRE")) { //Fire type move damage
				if(poke.type.equals("WATER")) {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*0.5*effect*move.power);
				}
				else if (poke.type.equals("ELECTRIC") || poke.type.equals("PSYCHIC")) {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*effect*move.power);
				} 
				else {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*2*effect*move.power);
				}
			}
			else if (move.type.equals("WATER")) { //Water type move damage
				if(poke.type.equals("GRASS")) {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*0.5*effect*move.power);
				}
				else if (poke.type.equals("ELECTRIC") || poke.type.equals("PSYCHIC")) {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*effect*move.power);
				} 
				else {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*2*effect*move.power);
				}
			}
			else if (move.type.equals("GRASS")) {//Grass type move damage
				if(poke.type.equals("FIRE")) {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*0.5*effect*move.power);
				}
				else if (poke.type.equals("ELECTRIC") || poke.type.equals("PSYCHIC")) {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*effect*move.power);
				} 
				else {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*2*effect*move.power);
				}
			}
			else if (move.type.equals("ELECTRIC")) {//Electric type move damage
				if(poke.type.equals("GRASS")) {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*0.5*effect*move.power);
				}
				else if (poke.type.equals("FIRE") || poke.type.equals("PSYCHIC")) {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*effect*move.power); 
				} 
				else {
					damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*2*effect*move.power);
				}
			}
			else {//Psychic type move damage
				damage = ((this.attack/this.defense)*(poke.attack/poke.defense)*effect*move.power);
				 
			}
		}	
		
		poke.HP = poke.HP - damage;
		
		if (!move.type.equals("ATTACK") && !move.type.equals("DEFENSE") && !move.type.equals("HEAL")) {
			if (damage > (temp*0.5)) {
				System.out.println(move.name + " was super effective!");
			}
			if (damage > (temp*0.1) && damage <= (temp*0.5)) {
				System.out.println(move.name + " was effective!");
			}
			if (damage <= (temp*0.1)) {
				System.out.println(move.name + " was not very effective.");
			}
		}
	}
}
