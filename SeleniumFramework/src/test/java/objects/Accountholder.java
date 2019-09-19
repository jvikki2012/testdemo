package objects;

public class Accountholder {
	
	String firstname;
	String Lastname;
	int Age;
	float Accountbalance;
	boolean EligbleforCC;
	
	public void testeligibleCC()
	{
		if (Age>25 && Accountbalance>25000);
		{
			EligbleforCC=true;
		}
	}

}
