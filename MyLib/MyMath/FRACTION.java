/*
* Author		: Debdrik Debnath
* Class Utility : Providing very specific Fraction-Related (Mathematics) utility functions that the author finds useful.
*/

package MyLib.MyMath;

import java.util.Math;

public class FRACTION
{
	private static long hcf(long a, long b) { return b == 0 ? a : hcf(b, a % b); }
	// Only to be used in this class.

	public static String asFraction(long a, long b)
	{
		return lowestNumerator (a, b) + "/" + lowestDenominator(a, b);
	}

	public static long lowestNumerator(long a, long b)
	{
		long gcd = hcf(a, b);
		return (a / gcd);
	}

	public static long lowestDenominator(long a, long b)
	{
		long gcd = hcf(a, b);
		return (b / gcd);
	}
}