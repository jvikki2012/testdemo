package objects;

public class accholderonjs 
{
	
	public static void main(String[] args)
	{
		Accountholder tom = new Accountholder();
		Accountholder Henry = new Accountholder();
		Accountholder Sara = new Accountholder();
		
		tom.firstname="tom";
		tom.Lastname="rich";
		tom.Age=21;
		tom.Accountbalance=10000;
		tom.testeligibleCC();
		System.out.println("Is tom eligible for CC? "+ tom.EligbleforCC);
		
		
	}

}
