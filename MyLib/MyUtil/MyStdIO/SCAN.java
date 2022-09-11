/*
* Author		: Debdrik Debnath
* Class Utility : Providing a very specific Input utility function that the author finds useful.
*/

package MyLib.MyUtil.MyStdIO;

import java.util.Scanner;

public class SCAN
{
    public static String scanln()
	{
		Scanner sc = new Scanner(System.in);
		String returnValue = sc.nextLine();
		return returnValue;
	}
}