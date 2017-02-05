
public class Car {
	

	public static void main(String args[])
	{
	}
			
	public int gear = 1;
	public int location = 0;
	public int DESTINATION = 250;
	public int speed = 0;
	
	
    void reverseGear() {
	gear = -1;	
	}

	void gearUp() {
		if (gear == 6)
		{
			System.out.println("I cannot increase the gear anymore");
		}
		else
		{
			if (gear == -1)
			{
				gear = 1;
			}
		else
		{
		gear = gear + 1;
	    }
		}
	    }
		
	void gearDown() {
		if (gear == 1)
		{
		System.out.println("I cannot decrease the gear anymore");
		}
		else
		{
		if (gear == -1)
		{
		System.out.println("I cannot decrease the gear because the car is in reverse gear");
		}
		else
		{ 
		gear = gear -1;
		}
		}
	    }
	

	int reportGear() {	
		return gear;
	}
	 
	
	int reportLocation() {
		return location;
	}
	
	int reportRemaining() {
		return DESTINATION - location;
	}

	void moveByTime(int time){
		if(time>0)	
		{
		speed = gear*20;
        int delta = speed * time;
		location = location + delta;
		}
		else
		{
		System.out.println("Time should be positive!");
		}
	}
	
boolean isArrived(){
	if (location == 0){
		return true;
        }
		else {
			
		return false;
		}



	

	//public void moveByTime(int i) {
		// TODO Auto-generated method stub
		
	

	//public String isArrived1() {
		// TODO Auto-generated method stub
		
	}
	}