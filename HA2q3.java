/*
 Program: Write a java program to input a four-digit number from command line argument and find sum of the first and last digit of the number.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
*/
public class HA2q3
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]), dig, sum=0, temp=num;
		dig=temp%10; temp/=10;
		sum+=dig;
		dig=temp%10; temp/=10; dig=temp%10; temp/=10; dig=temp%10;
		sum+=dig;
		System.out.println("Given number: "+num+"\nSum of the first and the last digit: "+sum);
	}
}