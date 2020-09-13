package Project1;
import java.util.Random;

public class Moves {
	String name;
	String type;
	int power;
	int accuracy;
	
	public Moves(String name, String type, int power, int accuracy) {
		this.name = name;
		this.type = type;
		this.power = power;
		this.accuracy = accuracy;
	}
	
	public double getEffect() {
		Random rand = new Random();
		double[] rating = {0.64, 0.8, 1.0, 1.56}; //taken from  https://gaming.stackexchange.com/questions/275646/how-do-the-attack-and-defense-stats-work-in-pok%C3%A9mon-go
		return rating[rand.nextInt(4)];
	}
	
	public void print() {
		System.out.printf("\n%s \nType: %s\nPower: %d\nAccuracy: %d\n", this.name,this.type, this.power, this.accuracy);
	}
}
