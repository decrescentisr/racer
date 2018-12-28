
public class Engine {

	public int cylinders;
	public int horsepower;
	
	public Engine() 
	{
		this.cylinders = 0;
		this.horsepower = 0;
	}
	
	public Engine(int cylinders, int horsepower) 
	{
		this.cylinders = cylinders;
		this.horsepower = horsepower;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	public String toString() 
	{
		StringBuilder message = new StringBuilder();
		message.append("Cylinders: " + cylinders);
		message.append("Horsepower: " + horsepower + "\n");
		return message.toString();
	}

}
