/*
 * Do you see anything wrong with the following code? How would you fix it?
 *
 *	String doggyMethod(int n) {
 * 		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
 *		if (n <= 0) {
 * 			return "";
 *		}
 *		return result;
 *	}
 *
 * My answer:-
 * The if statement is after the recursion and so therefore it is never
 * reached and it loops forever. It is fixed by bringing forward the if
 * statement.
 */

public class Doggy {
	
	public static void main(String[] args) {
		Doggy temp = new Doggy();
		temp.Launch();
	}
	
	public void Launch() {
		System.out.println(doggyMethod(10));
	}
	
	String doggyMethod(int n) {
		if(n <= 0) {
			return "";
		}
		String result = doggyMethod(n - 3) + n + doggyMethod(n - 2);
		return result;
	}

}
