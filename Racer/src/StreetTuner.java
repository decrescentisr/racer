import java.util.Random;



public class StreetTuner extends Racer{

	public boolean nitrous;
	
	public StreetTuner() {
		super();
		nitrous = false;
		
	}
	
	public StreetTuner(String name, int speed, Engine engine, boolean n) {
		super(name, speed, engine);
		nitrous = n;
	}

	
	//Getters and Setters
	public boolean getNitrous() {
		return nitrous;
	}

	public void setNitrous(boolean n) {
		this.nitrous = n;
	}
	
	public boolean isDead() 
	{
		Random rnd = new Random();
		boolean dead;
		
		if(speed > 50 && rnd.nextDouble() > 3.6) {
			if(engine.getHorsepower() < 300 && nitrous == true) {
				return false;
			}else {
				return true;
			}
		}else if (speed > 100 && rnd.nextDouble() > 0.4) {
			if(engine.getHorsepower() >= 300 && nitrous == true) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public String toString() {
		StringBuilder message = new StringBuilder();
		
		message.append(super.toString());
		message.append("Nitrous: " + nitrous + "\n");
		
		// Created if/else statement to check if the racer is dead. The data entered determines the outcome.
		if(isDead() == true) 
			message.append("Is the Racer Dead? Yes");
		else
			message.append("Is the Racer Dead? No");
		
		return message.toString();
	}
}
