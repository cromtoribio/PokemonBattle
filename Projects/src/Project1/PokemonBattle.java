package Project1;

import java.util.ArrayList;
import java.util.Scanner;


public class PokemonBattle {
	
	public static Pokemon getPokemon(ArrayList<Pokemon> poke, String name) {
		Pokemon pokemon = null;
		for (int i = 0; i < poke.size(); i++) {
			if (poke.get(i).name.toUpperCase().equals(name.toUpperCase())) {
				pokemon = poke.get(i);
				break;
			}
		}
		return pokemon;
	}
	
	public static void remove(ArrayList<Pokemon> poke, String name) {
		for (int i = 0; i < poke.size(); i++) {
			if (poke.get(i).name.toUpperCase().equals(name.toUpperCase())) {
				poke.remove(i);
				break;
			}
		}
	}
	
	public static boolean isPokemon(ArrayList<Pokemon> poke, String input) {
		boolean isName = false;
		for (int i = 0; i < poke.size(); i++) {
			if (poke.get(i).name.toUpperCase().equals(input.toUpperCase())) {
				isName = true;
				break;
			}
			else {
				isName = false;
			}
		}
		return isName;
	}
	
	public static boolean isMove(ArrayList<Moves> moves, String name) {
		boolean isMove = false;
		for (int i = 0; i < moves.size(); i++) {
			if (moves.get(i).name.toUpperCase().equals(name.toUpperCase())) {
				isMove = true;
				break;
			}
			else {
				isMove = false;
			}
		}
		return isMove;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you ready to play?");
		System.out.println("Enter 'Y' to continue, or anything else to quit.");
		String consent = scan.nextLine();
		
		while (consent.toUpperCase().equals("Y")) {
		
			System.out.println("Pokemon 2.0 Loading....");
			System.out.println("Creating Pokemon...");
			ArrayList<Pokemon> pokeDex = new ArrayList<Pokemon>();
			String[] names = {"Charizard", "Cresselia", "Bulbasaur", "Blastoise", "Pikachu", "Gyarados", "Blaziken", "Raiku", "Celebi", "Mewtwo"};
			String[] type = {"FIRE", "PSYCHIC", "GRASS", "WATER", "ELECTRIC", "WATER", "FIRE", "ELECTRIC", "GRASS", "PSYCHIC"};
			int[] attack = {84, 70, 49, 18, 55, 125, 120, 85, 100, 110};
			int[] defense = {78, 120, 49, 100, 40, 79, 70, 75, 100, 90};
			int[] HP = {78, 120, 45, 79, 35, 95, 80, 90, 100, 106};
			int[] speed = {100, 85, 45, 78, 90, 81, 80, 115, 100, 130};
		
			for (int i = 0; i < names.length; i++) {
				pokeDex.add(new Pokemon(names[i], type[i], attack[i], defense[i], HP[i], speed[i]));
			}
					
			System.out.println("Training Pokemon..."); //add moves
			
			pokeDex.get(0).addMove("Heat Wave", "FIRE", 95, 100);
			pokeDex.get(0).addMove("Slash", "FIRE", 70, 100);
			pokeDex.get(0).addMove("Fire Spin", "FIRE", 35, 100);
			pokeDex.get(0).addMove("Smokescreen", "DEFENSE", 0, 100);
			
			pokeDex.get(1).addMove("Psycho Cut", "PSYCHIC", 70, 100);
			pokeDex.get(1).addMove("Confusion", "PSYCHIC", 50, 100);
			pokeDex.get(1).addMove("Psych Shock" , "PSYCHIC", 110, 100);
			pokeDex.get(1).addMove("Protect", "ATTACK", 0, 0);
			
			pokeDex.get(2).addMove("Growl", "DEFENSE", 0, 100);
			pokeDex.get(2).addMove("Slash", "GRASS", 60, 100);
			pokeDex.get(2).addMove("Seed Bomb", "GRASS", 80, 100);
			pokeDex.get(2).addMove("Tackle", "GRASS", 40, 100);
			
			pokeDex.get(3).addMove("Water Gun", "WATER", 40, 100);
			pokeDex.get(3).addMove("Skull Bash", "WATER", 90, 100);
			pokeDex.get(3).addMove("Iron Defense", "DEFENSE", 0, 0);
			pokeDex.get(3).addMove("Hydro Pump", "WATER", 110, 80);
			
			pokeDex.get(4).addMove("Thunderbolt", "ELECTRIC", 90, 100);
			pokeDex.get(4).addMove("Slam", "ELECTRIC", 80, 75);
			pokeDex.get(4).addMove("Growl", "ATTACK", 0, 100);
			pokeDex.get(4).addMove("Spark", "ELECTRIC", 65, 100);
			
			pokeDex.get(5).addMove("Rain Dance", "HEAL", 0, 0);
			pokeDex.get(5).addMove("Aqua Tail", "WATER", 90, 90);
			pokeDex.get(5).addMove("Waterfall", "WATER", 80, 100);
			pokeDex.get(5).addMove("Hyper Beam", "WATER", 150, 90);
	
			pokeDex.get(6).addMove("Fire Punch", "FIRE", 75, 100);
			pokeDex.get(6).addMove("Growl", "FIRE", 10, 100);
			pokeDex.get(6).addMove("Quick Attack", "FIRE", 40, 100);
			pokeDex.get(6).addMove("Bulk Up", "HEAL", 0, 0);
			
			pokeDex.get(7).addMove("Discharge", "ELECTRIC", 80, 100);
			pokeDex.get(7).addMove("Roar", "ATTACK", 0, 0);
			pokeDex.get(7).addMove("Thunder Shock", "ELECTRIC", 40, 100);
			pokeDex.get(7).addMove("Quick Attack", "ELECTRIC", 40, 100);
			
			pokeDex.get(8).addMove("Leaf Storm", "GRASS", 130, 100);
			pokeDex.get(8).addMove("Healing Wish", "HEAL", 0, 0);
			pokeDex.get(8).addMove("Seed Bomb", "GRASS", 80, 100);
			pokeDex.get(8).addMove("Uproar", "GRASS", 90, 100);
			
			pokeDex.get(9).addMove("Psystrike", "PSYCHIC", 100, 100);
			pokeDex.get(9).addMove("Drain Punch", "PSYCHIC", 75, 100);
			pokeDex.get(9).addMove("Iron Tail", "PSYCHIC", 100, 75);
			pokeDex.get(9).addMove("Protect", "HEAL", 0, 0);
			

			System.out.println("Welcome to the Pokemon Battle Zone!");
			System.out.println("Who are the Pokemasters?");
			
			//Get Player Names
			System.out.println("Enter Player 1's name:");
			Player p1 = new Player (scan.nextLine());
			
			System.out.println("Enter Player 2's name:");
			Player p2 = new Player (scan.nextLine());
			
			//Inform about 3 Pokemon Limit
			System.out.print("\n");
			System.out.print("\n");
			System.out.println("Each player gets to take 3 pokemon into battle. Choose wisely!\n");
			
			//Players alternate choosing a Pokemon
			for (int i = 0; i < p1.pokeDex.size(); i++) {
				p1.pokeDex.remove(i);
			} // if new game, resets player pokedex
			
			for (int i = 0; i < p2.pokeDex.size(); i++) {
				p2.pokeDex.remove(i);
			} // if new game, resets player pokedex
			
			int count = 0;
			while (count < 6) {
				System.out.println("Available Pokemon: ");
				for (int i = 0; i < pokeDex.size(); i++) {
					System.out.print("|" + pokeDex.get(i).name + "|");
				}
				
				System.out.println();
				System.out.println();
				
				if (count % 2 == 0) {//Player 1 Chooses
					System.out.println(p1.name + ", choose a pokemon:");
					System.out.println("Or enter 'STATS' to see stats.");
					String choice = scan.nextLine();
					
					while(isPokemon(pokeDex, choice) == false && !choice.toUpperCase().equals("STATS")) {
						System.out.println("That pokemon is unavailable! Try again.");
						System.out.println(p1.name + ", choose a pokemon:");
						System.out.println("Or enter 'STATS' to see stats.");
						choice = scan.nextLine();
					}
					
					while(choice.toUpperCase().equals("STATS")) {
						System.out.println("Which pokemon do you want to see?");
						String poke = scan.nextLine();
						
						while(isPokemon(pokeDex, poke) == false) {
							System.out.println("That pokemon is unavailable! Try again.");
							System.out.println("Which pokemon do you want to see?");
							poke = scan.nextLine();
						}
						
						getPokemon(pokeDex, poke).printStats();
						
						System.out.println("Available Pokemon: ");
						for (int i = 0; i < pokeDex.size(); i++) {
							System.out.print("|" + pokeDex.get(i).name + "|");
						}
						System.out.println();
						System.out.println(p1.name + ", choose a pokemon:");
						System.out.println("Or enter 'STATS' to see stats.");
						choice = scan.nextLine();
					}
					
					p1.addPokemon(getPokemon(pokeDex, choice)); 
					remove(pokeDex, choice);
				}
				else {// Player 2 Chooses
					System.out.println(p2.name + ", choose a pokemon:");
					System.out.println("Or enter 'STATS' to see stats.");
					String choice2 = scan.nextLine();
						
					while(isPokemon(pokeDex, choice2) == false && !choice2.toUpperCase().equals("STATS")) {
						System.out.println("That pokemon is unavailable! Try again.");
						System.out.println(p2.name + ", choose a pokemon:");
						System.out.println("Or enter 'STATS' to see stats.");
						choice2 = scan.nextLine();
					}
					
					while(choice2.toUpperCase().equals("STATS")) {
						System.out.println("Which pokemon do you want to see?");
						String poke = scan.nextLine();
						
						while(isPokemon(pokeDex, poke) == false) {
							System.out.println("That pokemon is unavailable! Try again.");
							System.out.println("Which pokemon do you want to see?");
							poke = scan.nextLine();
						}
						
						getPokemon(pokeDex, poke).printStats();
						
						System.out.println("Available Pokemon: ");
						for (int i = 0; i < pokeDex.size(); i++) {
							System.out.print("|" + pokeDex.get(i).name + "|");
						}
						System.out.println();
						System.out.println(p2.name + ", choose a pokemon:");
						System.out.println("Enter 'STATS' to see stats.");
						choice2 = scan.nextLine();
					}
									
					p2.addPokemon(getPokemon(pokeDex, choice2));	
					remove(pokeDex, choice2);
				}
				count++;
		}
		//end of while loop and player choices
			
			System.out.println();
			System.out.println();
			
			System.out.println("Prepare for Battle");
			System.out.println(p1.name + ", choose your pokemon!");
			p1.seePokeDex();
			String choice = scan.nextLine();
			
			while(isPokemon(p1.pokeDex,choice) == false) { //check correct input
				System.out.println("You don't have that pokemon!");
				System.out.println(p1.name + ", choose your pokemon:");
				choice = scan.nextLine();
			}
			
			p1.changePokemon(choice);
			
			System.out.println();
			System.out.println();
			
			System.out.println(p2.name + ", choose your pokemon!");
			p2.seePokeDex();
			String choice2 = scan.nextLine();
			
			while(isPokemon(p2.pokeDex,choice2) == false) {//check correct input
				System.out.println("You don't have that pokemon!");
				System.out.println(p2.name + ", choose your pokemon:");
				choice2 = scan.nextLine();
			}
			
			p2.changePokemon(choice2);
	
			for (int i = 0; i < 20; i++) {
				System.out.println();
			}
			
			//Game Play
			if (p1.current.speed > p2.current.speed) {
				System.out.println(p1.current.name + " gets first move!");
				System.out.println(p1.name + ", what would you like to do?");
				p1.current.getMoves();
				System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
				String move1 = scan.nextLine();
				
				while (isMove(p1.current.movesList, move1) == false && !move1.toUpperCase().equals("CHANGE") && !move1.toUpperCase().equals("INFO")) {
					System.out.println("Invalid entry.");
					System.out.println(p1.name + ", what would you like to do?");
					p1.current.getMoves();
					System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
					move1 = scan.nextLine();
				}
				
				while (p1.pokeCount != 0 || p2.pokeCount != 0) {
					for (int i = 0; i < 5; i++) {
						System.out.println();
					}
					
					if (move1.toUpperCase().equals("CHANGE")) {
						System.out.println("Choose a new Pokemon");
						p1.seePokeDex();
						choice = scan.nextLine();
						
						while(isPokemon(p1.pokeDex,choice) == false) { //check correct input
							System.out.println("You don't have that pokemon!");
							System.out.println(p1.name + ", choose your pokemon:");
							choice = scan.nextLine();
						}
						
						p1.changePokemon(choice);
						System.out.println(p1.name + " changed to " + p1.current.name + "!");
					} else {
						while(move1.toUpperCase().equals("INFO")) {
							for (int i = 0; i < p1.current.movesList.size(); i++) {
								p1.current.movesList.get(i).print();
							}
							
							System.out.println(p1.name + ", what would you like to do?");
							System.out.println("Type 'INFO' to see move info.");
							move1 = scan.nextLine();
													
							while (isMove(p1.current.movesList, move1) == false && !move1.toUpperCase().equals("INFO")) {
								System.out.println("Invalid entry.");
								System.out.println(p1.name + ", what would you like to do?");
								System.out.println("Type 'INFO' to see move info.");
								move1 = scan.nextLine();
							}
							
						}
						p1.current.use(move1, p2.current);
								
						if (p2.current.HP >= 25) {
							System.out.printf("%s has %.2f HP left!\n", p2.current.name, p2.current.HP);
						} 
						if (p2.current.HP > 0 && p2.current.HP < 25) {
							System.out.printf("%s is critical! %.2f HP left!\n", p2.current.name, p2.current.HP);
						}
						if (p2.current.HP <= 0) {
							System.out.printf("%s has been defeated!\n", p2.current.name);
							p2.deletePokemon(p2.current.name);
		
							if (p2.pokeCount == 0) {
								break;
							}
							else if(p2.pokeCount == 1) {
								p2.changePokemon(p2.pokeDex.get(0).name);
								System.out.printf("%s, %s is your last pokemon!\n", p2.name, p2.current.name);
							} 
							else {
								System.out.println(p2.name + " choose another Pokemon!");
								p2.seePokeDex();
								choice2 = scan.nextLine();
								while(isPokemon(p2.pokeDex,choice2) == false) {//check correct input
									System.out.println("You don't have that pokemon!");
									System.out.println(p2.name + ", choose your pokemon:");
									choice2 = scan.nextLine();
								}
								p2.changePokemon(choice2);
								System.out.println(p2.name + " changed to " + p2.current.name + "!");
							}
						}
					}
					
					if (p2.pokeCount > 1 ) {
						System.out.println(p2.name + ", what would you like to do?");
						p2.current.getMoves();
						System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
					}
					else {
						System.out.println(p2.name + ", what would you like to do?");
						System.out.println("Type 'INFO' to see move info.");
						p2.current.getMoves();
					}
					
					String move2 = scan.nextLine();	
					while (isMove(p2.current.movesList, move2) == false && !move2.toUpperCase().equals("CHANGE") && !move2.toUpperCase().equals("INFO")) {
						System.out.println("Invalid entry.");
						System.out.println(p2.name + ", what would you like to do?");
						p2.current.getMoves();
						System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
						move2 = scan.nextLine();
					}
					
					for (int i = 0; i < 5; i++) {
						System.out.println();
					}
					
					if (move2.toUpperCase().equals("CHANGE")) {
						System.out.println("Choose a new Pokemon");
						p2.seePokeDex();
						choice2 = scan.nextLine();
						
						while(isPokemon(p2.pokeDex,choice2) == false) { //check correct input
							System.out.println("You don't have that pokemon!");
							System.out.println(p2.name + ", choose your pokemon:");
							choice2 = scan.nextLine();
						}
						
						p2.changePokemon(choice2);
						System.out.println(p2.name + " changed to " + p2.current.name + "!");
					} else {
						while(move2.toUpperCase().equals("INFO")) {
							for (int i = 0; i < p2.current.movesList.size(); i++) {
								p2.current.movesList.get(i).print();
							}
							
							System.out.println(p2.name + ", what would you like to do?");
							System.out.println("Type 'INFO' to see move info.");
							move2 = scan.nextLine();
													
							while (isMove(p2.current.movesList, move2) == false && !move2.toUpperCase().equals("INFO")) {
								System.out.println("Invalid entry.");
								System.out.println(p2.name + ", what would you like to do?");
								System.out.println("Type 'INFO' to see move info.");
								move2 = scan.nextLine();
							}
							
						}
						p2.current.use(move2, p1.current);
										
						if (p1.current.HP >= 25) {
							System.out.printf("%s has %.2f HP left!\n", p1.current.name, p1.current.HP);
						} 
						if (p1.current.HP > 0 && p1.current.HP < 25) {
							System.out.printf("%s is critical! %.2f HP left!\n", p1.current.name, p1.current.HP);
						}
						if (p1.current.HP <= 0) {
							System.out.printf("%s has been defeated!\n", p1.current.name);
							p1.deletePokemon(p1.current.name);
							
							if (p1.pokeCount == 0) {
								break;
							} 
							else if(p1.pokeCount == 1) {
								p1.changePokemon(p1.pokeDex.get(0).name);
								System.out.printf("%s, %s is your last pokemon!\n", p1.name, p1.current.name);
							}
							else {
								System.out.println(p1.name + " choose another Pokemon!");
								p1.seePokeDex();
								choice = scan.nextLine();
								while(isPokemon(p1.pokeDex,choice) == false) { //check correct input
									System.out.println("You don't have that pokemon!");
									System.out.println(p1.name + ", choose your pokemon:");
									choice = scan.nextLine();
								}
								p1.changePokemon(choice);
								System.out.println(p1.name + " changed to " + p1.current.name + "!");
							}
						}
					}
					
					if (p1.pokeCount > 1 ) {
						System.out.println(p1.name + ", what would you like to do?");
						p1.current.getMoves();
						System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
					}
					else {
						System.out.println(p1.name + ", what would you like to do?");
						System.out.println("Type 'INFO' to see move info.");
						p1.current.getMoves();
					}
					move1 = scan.nextLine();
					
					while (isMove(p1.current.movesList, move1) == false && !move1.toUpperCase().equals("CHANGE") && !move1.toUpperCase().equals("INFO")) {
						System.out.println("Invalid entry.");
						System.out.println(p1.name + ", what would you like to do?");
						p1.current.getMoves();
						System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
						move1 = scan.nextLine();
					}
				}
					
			} else {
				System.out.println(p2.current.name + " gets first move!");
				System.out.println(p2.name + ", what would you like to do?");
				p2.current.getMoves();
				System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
				String move2 = scan.nextLine();
				
				while (isMove(p2.current.movesList,move2) == false && !move2.toUpperCase().equals("CHANGE") && !move2.toUpperCase().equals("INFO")) {
					System.out.println("Invalid entry.");
					System.out.println(p2.name + ", what would you like to do?");
					p2.current.getMoves();
					System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
					move2 = scan.nextLine();
				}
				
				while (p1.pokeCount != 0 || p2.pokeCount != 0) {
					for (int i = 0; i < 5; i++) {
						System.out.println();
					}
					
					if (move2.toUpperCase().equals("CHANGE")) {
						System.out.println("Choose a new Pokemon");
						p2.seePokeDex();
						choice2 = scan.nextLine();
						
						while(isPokemon(p2.pokeDex,choice2) == false) { //check correct input
							System.out.println("You don't have that pokemon!");
							System.out.println(p2.name + ", choose your pokemon:");
							choice2 = scan.nextLine();
						}
						
						p2.changePokemon(choice2);
						System.out.println(p2.name + " changed to " + p2.current.name + "!");
					} else {
						while(move2.toUpperCase().equals("INFO")) {
							for (int i = 0; i < p2.current.movesList.size(); i++) {
								p2.current.movesList.get(i).print();
							}
							
							System.out.println(p2.name + ", what would you like to do?");
							System.out.println("Type 'INFO' to see move info.");
							move2 = scan.nextLine();
													
							while (isMove(p2.current.movesList, move2) == false && !move2.toUpperCase().equals("INFO")) {
								System.out.println("Invalid entry.");
								System.out.println(p2.name + ", what would you like to do?");
								System.out.println("Type 'INFO' to see move info.");
								move2 = scan.nextLine();
							}
							
						}
						p2.current.use(move2, p1.current);
						
						if (p1.current.HP >= 25) {
							System.out.printf("%s has %.2f HP left!\n", p1.current.name, p1.current.HP);
						} 
						if (p1.current.HP > 0 && p1.current.HP < 25) {
							System.out.printf("%s is critical! %.2f HP left!\n", p1.current.name, p1.current.HP);
						}
						if (p1.current.HP <= 0) {
							System.out.printf("%s has been defeated!\n", p1.current.name);
							p1.deletePokemon(p1.current.name);
		
							if (p1.pokeCount == 0) {
								break;
							}
							else if (p1.pokeCount == 1) {
								p1.changePokemon(p1.pokeDex.get(0).name);
								System.out.printf("%s, %s is your last pokemon!\n", p1.name, p1.current.name);
							} else {
								System.out.println(p1.name + " choose another Pokemon!");
								p1.seePokeDex();
								choice = scan.nextLine();
								while(isPokemon(p1.pokeDex,choice) == false) {//check correct input
									System.out.println("You don't have that pokemon!");
									System.out.println(p1.name + ", choose your pokemon:");
									choice = scan.nextLine();
								}
								p1.changePokemon(choice);
								System.out.println(p1.name + " changed to " + p1.current.name + "!");
							}
						}
					}
					
					if (p1.pokeCount > 1 ) {
						System.out.println(p1.name + ", what would you like to do?");
						p1.current.getMoves();
						System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
					}
					else {
						System.out.println(p1.name + ", what would you like to do?");
						System.out.println("Type 'INFO' to see move info.");
						p1.current.getMoves();
					}
					String move1 = scan.nextLine();
					
					while (isMove(p1.current.movesList, move1) == false && !move1.toUpperCase().equals("CHANGE") && !move1.toUpperCase().equals("INFO")) {
						System.out.println("Invalid entry.");
						System.out.println(p1.name + ", what would you like to do?");
						p1.current.getMoves();
						System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
						move1 = scan.nextLine();
					}
					
					for (int i = 0; i < 5; i++) {
						System.out.println();
					}
					
					if (move1.toUpperCase().equals("CHANGE")) {
						System.out.println("Choose a new Pokemon");
						p1.seePokeDex();
						choice = scan.nextLine();
						
						while(isPokemon(p1.pokeDex,choice) == false) { //check correct input
							System.out.println("You don't have that pokemon!");
							System.out.println(p1.name + ", choose your pokemon:");
							choice = scan.nextLine();
						}
						
						p1.changePokemon(choice);
						System.out.println(p1.name + " changed to " + p1.current.name + "!");
					}
					else {
						while(move1.toUpperCase().equals("INFO")) {
							for (int i = 0; i < p1.current.movesList.size(); i++) {
								p1.current.movesList.get(i).print();
							}
							
							System.out.println(p1.name + ", what would you like to do?");
							System.out.println("Type 'INFO' to see move info.");
							move1 = scan.nextLine();
													
							while (isMove(p1.current.movesList, move1) == false && !move1.toUpperCase().equals("INFO")) {
								System.out.println("Invalid entry.");
								System.out.println(p1.name + ", what would you like to do?");
								System.out.println("Type 'INFO' to see move info.");
								move1 = scan.nextLine();
							}
							
						}
						p1.current.use(move1, p2.current);
										
						if (p2.current.HP >= 25) {
							System.out.printf("%s has %.2f HP left!\n", p2.current.name, p2.current.HP);
						} 
						if (p2.current.HP > 0 && p2.current.HP < 25) {
							System.out.printf("%s is critical! %.2f HP left!\n", p2.current.name, p2.current.HP);
						}
						if (p2.current.HP <= 0) {
							System.out.printf("%s has been defeated!\n", p2.current.name);
							p2.deletePokemon(p2.current.name);
							
							if (p2.pokeCount == 0) {
								break;
							}
							else if (p2.pokeCount == 1) {
								p2.changePokemon(p2.pokeDex.get(0).name);
								System.out.printf("%s, %s is your last pokemon!\n", p2.name, p2.current.name);
							} else {
								System.out.println(p2.name + " choose another Pokemon!");
								p2.seePokeDex();
								choice2 = scan.nextLine();
								while(isPokemon(p2.pokeDex,choice2) == false) { //check correct input
									System.out.println("You don't have that pokemon!");
									System.out.println(p2.name + ", choose your pokemon:");
									choice2 = scan.nextLine();
								}
								p2.changePokemon(choice2);
								System.out.println(p2.name + " changed to " + p2.current.name + "!");
							}
						}
					}
					
					if (p2.pokeCount > 1 ) {
						System.out.println(p2.name + ", what would you like to do?");
						p2.current.getMoves();
						System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
					}
					else {
						System.out.println(p2.name + ", what would you like to do?");
						System.out.println("Type 'INFO' to see move info.");
						p2.current.getMoves();
					}
					move2 = scan.nextLine();
					
					while (isMove(p2.current.movesList, move2) == false && !move2.toUpperCase().equals("CHANGE") && !move2.toUpperCase().equals("INFO")) {
						System.out.println("Invalid entry.");
						System.out.println(p2.name + ", what would you like to do?");
						p2.current.getMoves();
						System.out.println("Type 'CHANGE' to switch pokemon. Type 'INFO' to see move info.");
						move2 = scan.nextLine();
					}
				}
					
			}
			
			System.out.println();
			//Check Winner
			if (p1.pokeCount > p2.pokeCount) {
				System.out.println(p1.name + " is the PokeMaster!");
				System.out.println("Better luck next time, " + p2.name + "!\n");
			} else {
				System.out.println(p2.name + " is the PokeMaster!");
				System.out.println("Better luck next time, " + p1.name + "!\n");
			}
			
			System.out.println("Would you like to play again?");
			System.out.println("Enter 'Y' to continue, or anything else to quit.");
			consent = scan.nextLine();
		}
		
		System.out.println("Thanks for playing!");
		scan.close();
	}
}
