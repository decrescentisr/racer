import javax.swing.JOptionPane;


public class MainClass {

	public static void main(String[] args) 
	{
		Racer[] racerList = new Racer[3];
		racerList[0] = new HotRod();
		collectRacerInformation(racerList[0]);
		displayRacerInformation(racerList[0]);
		
		//Display number of racers created
		System.out.println("Racer #: " + Racer.getNumRacers());;
		
		racerList[1] = new StreetTuner();
		collectRacerInformation(racerList[1]);
		displayRacerInformation(racerList[1]);
		
		racerList[2] = new StreetTuner();
		collectRacerInformation(racerList[2]);
		displayRacerInformation(racerList[2]);
	}

	public static void collectRacerInformation(Racer rac) 
	{
		Exception exception = new Exception();

		boolean badInput = true;
		// Prompt for and then set the name, speed, cylinders, and horsepower
		rac.setName(getInput("Name"));
		do {
			try {
				int speed = Integer.parseInt(getInput("Speed"));
				if (speed >= 0) {
					rac.setSpeed(speed);
					badInput = false;
				} else {
					throw exception;
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Speed should be greater than 0","Error", JOptionPane.PLAIN_MESSAGE);
			}
		} while(badInput);

		badInput = true;
		do {
			try {
				int cylinders = Integer.parseInt(getInput("Cylinders"));
				if (cylinders >= 0) {
					rac.engine.setCylinders(cylinders);
					badInput = false;
				} else {
					throw exception;
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Cylinders should be greater than 0","Error", JOptionPane.PLAIN_MESSAGE);
			}
		} while(badInput);

		badInput = true;
		do {
			try {
				int hp = Integer.parseInt(getInput("Horsepower"));
				if (hp >= 0) {
					rac.engine.setHorsepower(hp);
					badInput = false;
				} else {
					throw exception;
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Horsepower should be greater than 0","Error", JOptionPane.PLAIN_MESSAGE);
			}
		} while(badInput);



		// Check to see if Racer object passed in is a HotRod or a StreetTuner
		if(rac instanceof HotRod)
		{
			badInput = true;
			do {
				try {
					String strBlower = getInput("Blower").toLowerCase();
					if (strBlower.equals("true") || strBlower.equals("1")) {
						((HotRod) rac).setBlower(true);
						badInput = false;
					} else if(strBlower.equals("false") || strBlower.equals("0")) {
						((HotRod) rac).setBlower(false);
						badInput = false;
					}else
					{
						throw exception;
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please type \"true\" or \"false\" for blower","Error", JOptionPane.PLAIN_MESSAGE);
				}
			} while(badInput);
		}
				
			if(rac instanceof StreetTuner) 
			{
				badInput = true;
				do {
					try {
						String strNitrous = getInput("Nitrous").toLowerCase();
						if (strNitrous.equals("true") || strNitrous.equals("1")) {
							((StreetTuner) rac).setNitrous(true);
							badInput = false;
						}else if(strNitrous.equals("false") || strNitrous.equals("0")) {
							((StreetTuner) rac).setNitrous(false);
							badInput = false;
						}else {
							throw exception;
						}
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Please type \"true\" or \"false\" for nitrous","Error", JOptionPane.ERROR_MESSAGE);
						
					}
				}while(badInput);
			}
		}
	
	public static void displayRacerInformation(Racer rac) 
	{
		System.out.println(rac);
	}
	
	public static void displayNumberOfRacers() 
	{	
		//Display number of racers created
		System.out.println("Total Racers: " + Racer.getNumRacers());
		
	}
	
	public static String getInput(String input) 
	{
		String stringInput = "";
		stringInput = JOptionPane.showInputDialog(" Enter the " + input);
		
		return stringInput;
	}
	

}
