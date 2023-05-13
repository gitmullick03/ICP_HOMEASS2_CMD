/*
 Program: The surface area of a cylinder can be defined as A= πr2+2πrh, where r and h are the radius and height of the cylinder respectively. Write a java program to find the area where r and h are inputted from command line argument. Hint: Use Math.PI.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
*/
public class HA2q2
{
	public static void main(String args[])
	{
		double r=Double.parseDouble(args[0]), h=Double.parseDouble(args[1]);
		double sa=(Math.PI*(Math.pow(r,2)))+(2*Math.PI*r*h);
		System.out.println("Radius of cylinder: "+r+"\nHeight of cylinder: "+h+"\nSurface area of cylinder: "+sa);
	}
}