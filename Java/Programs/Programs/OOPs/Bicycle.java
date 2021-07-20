package Programs.OOPs;

public class Bicycle {

		public int gear;
		public int speed;

		Bicycle(int gear, int speed)
		{
			this.gear = gear;
			this. speed = speed;
		} 
 
		public void applyBreak(int decrement)
		{
			speed -= decrement;
		}

		public void speedUp(int increment)
		{
			speed += increment;
		}

		public String printInfo()
		{
			return ("No of gears are "+ gear + "\n" + "speed of bicycle is " + speed); 
		}
	}

	class MountainBike extends Bicycle
	{
		public int seatHeight;

		public MountainBike(int gear, int speed, int seatHeight)
		{
			super(gear,speed);

			this.seatHeight = seatHeight;
		}

		public void seatHeight(int newValue)
		{
			seatHeight = newValue;
		}

		public String printInfo()
		{
			return (super.printInfo() + "\n seat height is "+ seatHeight);
		}
	}
    class Test {

	   
	    public static void main (String[] args) {
	       
	    	MountainBike mb = new MountainBike(3, 100, 25);
			System.out.println(mb.printInfo()+"\n");
	    	
	    	mb.speedUp(20);
	    	System.out.println(mb.printInfo()+"\n");
	    	
	    	mb.seatHeight(22);
	    	System.out.println(mb.printInfo()+"\n");



	    }
	}
    

