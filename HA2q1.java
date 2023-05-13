/*
 Program: Write a java program to take three inputs from command line argument as principle, rate and time. Find Simple interest.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
*/
public class HA2q1
{
	public static void main(String args[])
	{
		double prin=Double.parseDouble(args[0]), rate=Double.parseDouble(args[1]), time=Double.parseDouble(args[2]);
		double SI=(prin*rate*time)/1200.0;
		System.out.println("Principle amount: "+prin+"\nRate: "+rate+"\nTime: "+time+"\nSimple interest for given months as time: "+SI);
	}
}