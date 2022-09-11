/*
* Author		: Debdrik Debnath
* Class Utility : Providing very specific Input-Output utility functions that the author finds useful.
*/

package MyLib.MyUtil.MyStdIO;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

private class customArr
{
	String[] arr = new String[getSize()];
	private long getSize(long size){return size;}
}

public class ASK
{
	/*
	public static String askType(String type, customArr arr)
	{
		String str = "";
		boolean flag = false;

		while (flag == false)
		{
			//System.out.print("Please enter the type of " + type + ".\t\t[Not case-sensitive.]");
			Scanner sc = new Scanner(System.in);
			str = (sc.nextLine().toLowerCase());
		
			if ((str.equals("cuboid")) || (str.equals("cylinder")) || (str.equals("cone")))    flag = true;
			else println ("Please enter a shape from the follwoing choices:\n\t> Cylinder\n\t> Cuboid\n\t> Cone\n\n\t...try again");
		}
	}
	*/

	public static String askString(String question)
	{
		System.out.println(question);
		Scanner sc = new Scanner(System.in);
		String returnValue = sc.nextLine();

		return returnValue;
	}

	public static char askChar(String question)
	{
		char returnValue = 0;
		boolean flag = false;
		while (flag == false)
		{
			System.out.println(question);
			Scanner sc = new Scanner(System.in);
			try {returnValue = sc.nextLine().charAt(0); /* If no error is produced, then */ flag = true;}
			catch (InputMismatchException e) {System.out.println("Enter an interger from -128 to 127 only.\n\ttry again...");}
		}

		return returnValue;
	}

	public static long askLong(String question)
	{
		long returnValue = 0;
		boolean flag = false;
		while (flag == false)
		{
			System.out.println(question);
			Scanner sc = new Scanner(System.in);
			try {returnValue = sc.nextLong(); /* If no error is produced, then */ flag = true;}
			catch (InputMismatchException e) {System.out.println("Enter an interger from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 only.\n\ttry again...");}
		}

		return returnValue;
	}

	public static int askInt(String question)
	{
		int returnValue = 0;
		boolean flag = false;
		while (flag == false)
		{
			System.out.println(question);
			Scanner sc = new Scanner(System.in);
			try {returnValue = sc.nextInt(); /* If no error is produced, then */ flag = true;}
			catch (InputMismatchException e) {System.out.println("Enter an interger from -2,147,483,648 to 2,147,483,647 only.\n\ttry again...");}
		}

		return returnValue;
	}

	public static short askShort(String question)
	{
		short returnValue = 0;
		boolean flag = false;
		while (flag == false)
		{
			System.out.println(question);
			Scanner sc = new Scanner(System.in);
			try {returnValue = sc.nextShort(); /* If no error is produced, then */ flag = true;}
			catch (InputMismatchException e) {System.out.println("Enter an interger from -32,768 to 32,767 only.\n\ttry again...");}
		}

		return returnValue;
	}

	public static byte askByte(String question)
	{
		byte returnValue = 0;
		boolean flag = false;
		while (flag == false)
		{
			System.out.println(question);
			Scanner sc = new Scanner(System.in);
			try {returnValue = sc.nextByte(); /* If no error is produced, then */ flag = true;}
			catch (InputMismatchException e) {System.out.println("Enter an interger from -128 to 127 only.\n\ttry again...");}
		}

		return returnValue;
	}

}