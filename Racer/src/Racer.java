
public abstract class Racer {
	
	private static int numRacers = 0;
	
	//instance variables
	public String name; 
	public int speed;
	public Engine engine;
	
	public Racer() 
	{
		name = "not given";
		engine = new Engine();
		numRacers++;
	}
	
	public Racer(String name, int speed, Engine engine) 
	{
		this.name = name;
		this.speed = speed;
		this.engine = engine;
		numRacers++;
	}

	public static int getNumRacers() {
		return numRacers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public abstract boolean isDead();
	
	public String toString() {
		
		StringBuilder message = new StringBuilder();
		message.append("\n");
		message.append("****** Racer Information ******");
		message.append(" \n");
		message.append("Name: " + name + "\n");
		message.append("Speed: " + speed + "\n");
		message.append(engine);
		
		return message.toString();	
		
	}
	

}
