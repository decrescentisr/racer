import java.util.Random;


public class HotRod extends Racer {
	
	private boolean blower;

	public HotRod() 
	{
		super();
		blower = false;
	}
	
	public HotRod(String name, int speed, Engine engine, boolean b) 
	{
		super(name, speed, engine);
		blower = b;
	}

	public boolean isBlower() {
		return blower;
	}

	public void setBlower(boolean blower) {
		this.blower = blower;
	}
	
	public boolean isDead() 
	{
		Random rnd = new Random();
		boolean dead;
		
		if(speed > 50 && rnd.nextDouble() > 0.6) 
		{
			if(engine.getHorsepower() < 300 && blower == true) {
				return false;
			} else {
				return true;
			}
		} else if(speed > 100 && rnd.nextDouble() > 0.4) {
			if(engine.getHorsepower() >= 300 && blower == true) {
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
		message.append("Blower: " + blower + "\n");
		
		// Created if/else statement to check if the racer is dead. The data entered determines the outcome.
		if(isDead() == true)
			message.append("Is the Racer Dead? Yes");
		else
			message.append("Is the Racer Dead? No");
		
		return message.toString();
	}
}
