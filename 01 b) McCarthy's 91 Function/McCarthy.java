/*
 * Calculate the result of calling this method with arguments 50, 73, and 95.
 * Note that the recursion on line 5 is double.
 *
 *	int mcCarthy91(int n) {
 *		if (n > 100) {
 *			return n - 10;
 *		} else {
 *			return mcCarthy91(mcCarthy91(n+11));
 *		}
 *	}
 *
 * (Hint: If you get too confused, maybe writing a slightly modified version of
 * this code that prints the numbers on screen can help).
 */

public class McCarthy {
	
	public static void main(String[] args) {
		McCarthy temp = new McCarthy();
		temp.Launch();
	}
	
	public void Launch() {
		System.out.println(mcCarthy91(50));
		System.out.println(mcCarthy91(73));
		System.out.println(mcCarthy91(95));
	}
	
	int mcCarthy91(int n) {
		if (n > 100) {
			return n - 10;
		}
		else {
			return mcCarthy91(mcCarthy91(n + 11));
		}
	}
	
}
