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
 */

public class Doggy {
	
	public static void main(String[] args) {
		Doggy temp = new Doggy();
		temp.Launch();
	}
	
	public void Launch() {
		System.out.println(doggyMethod(5));
	}
	
	String doggyMethod(int n) {
		String result = doggyMethod(n - 3) + n + doggyMethod(n - 2);
		if(n <= 0) {
			return "";
		}
		return result;
	}

}
