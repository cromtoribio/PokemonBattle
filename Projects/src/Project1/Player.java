package Project1;
import java.util.ArrayList;

public class Player {
	String name;
	ArrayList<Pokemon> pokeDex;
	int pokeCount;
	Pokemon current;
	
	public Player(String name) {
		this.name = name;
		this.pokeDex = new ArrayList<Pokemon>();
		this.pokeCount = 0;
		this.current = null;
	}
	
	public void addPokemon(Pokemon poke) {
			this.pokeDex.add(poke);
			this.pokeCount++;
	}
	
	public void changePokemon(String name) {
		for (int i = 0; i < this.pokeDex.size(); i++) {
			if (this.pokeDex.get(i).name.toUpperCase().equals(name.toUpperCase())) {
				this.current = pokeDex.get(i);
				break;
			}
		}
	}

	
	public void deletePokemon(String name) {
		for (int i = 0; i < this.pokeDex.size(); i++) {
			if (this.pokeDex.get(i).name.toUpperCase().equals(name.toUpperCase())) {
				this.pokeDex.remove(i);
				this.pokeCount--;
				break;
			}
		}
	}
	
	public void seePokeDex() {
		
		System.out.println("Your Pokedex:");
		for (int i = 0; i < this.pokeDex.size(); i++) {
			System.out.print("|" + this.pokeDex.get(i).name + "|");
			}
		System.out.println(" ");
		}

}
