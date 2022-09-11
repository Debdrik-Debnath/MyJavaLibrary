/*
* Author		: Debdrik Debnath
* Class Utility : Providing very specific Number System (Mathematics) utility functions that the author finds useful.
*/

package MyLib.MyMath;

import MyLib.*;

import java.util.Math;

public class NUM
{
	public static long LCM(long a, long b) { return a * b / HCF(a, b); }
	
	public static long HCF(long a, long b) { return b == 0 ? a : HCF(b, a % b); } /* Same as: */ public static long GCD(long a, long b) { return b == 0 ? a : HCF(b, a % b); }
	// GCD() and HCF() cover the same function. One can use either based on whether they call it GCD or HCF. The author personally prefers saying HCF.

	public static String rationalize(double d)
	{
		String s = Double.toString(d);
		s = s.substring(s.indexOf('.')+1, s.length());
		return s + " / " + ApintMath.pow(new Apint(10), s.length()).toString();
	}

	public static double round2(double d) { return (double) Math.round(d * 100) / 100; }
	public static double roundX_toY(double x, long y) { return System.out.printf("%.yf", x);}

	public static void main(String[] args)
	{
System.out.println(round2(3.145));
System.out.println(round2(3.146));
System.out.println(round2(3.143));
System.out.println(round2(3.1446));
System.out.println(round2(roundX_toY(13.1212232456454, 3)));

	}

	
	
}