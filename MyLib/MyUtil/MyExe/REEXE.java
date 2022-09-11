/*
* Author		: Debdrik Debnath
* Class Utility : Providing a very specific execution function that the author finds useful.
*/

package MyLib.MyUtil.MyExe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class REEXE
{
	public static void reExecution()
	{
		try
		{
			System.out.println("To stop, enter 0 or a non-numeric value.");
			System.out.println("To run the program again, enter a non-zero numeric value less than 9223372036854775807.\n");
			long Yes$No; 
			Scanner reexecutionObj = new Scanner(System.in);
			Yes$No = reexecutionObj.nextLong();
			if (Yes$No == 0)
			{
				System.out.println("Exiting the program . . . ");
				System.exit(0);
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("Exiting the program . . . ");
			System.exit(0);
		}
	}
	// First put your entire code in an infinite while loop.
	// Then call this method right at the end of the while loop (not after it)

}