/*
* Author		: Debdrik Debnath
* Class Utility : Providing very specific Fraction-Related (Mathematics) utility functions that the author finds useful.
*/

package MyLib.MyMath;

import java.lang.Math.*;

public class FRACTION
{
	private static long hcf(long a, long b) { return b == 0 ? a : hcf(b, a % b); }
	// Only to be used in this class.

	public static String asFraction(long a, long b)
	{
		return lowestNumerator(a, b) + "/" + lowestDenominator(a, b);
	}

	public static String asMixedFraction(long a, long b)
	{
		long
			n = lowestNumerator (a, b),
			d = lowestDenominator(a, b),
			q = (int) (n / d);
		
		return
		(
			(lowestNumerator (a, b) > lowestDenominator(a, b)) ?
				q + " " + (n - (q * d)) + "/" + d
				:
				lowestNumerator (a, b) + "/" + lowestDenominator(a, b)
		);
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