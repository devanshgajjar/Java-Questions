import java.util.Scanner;

class FY_02_HM {
	static Scanner  xd = new Scanner (System.in);
	static {
	System.out.println("Enter movie :");
	}
	static String words = xd.nextLine();
//	private static String word = words[(int) (words.length)];
	private static String asterisk = new String(new char[words.length()]).replace("\0", "*");
	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (count <9 && asterisk.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess);
		}
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += words.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			countTries();
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(words)) {
			System.out.println("Correct! You win! The movie was " + words);
		}
	}

	public static void countTries() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");

		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
		}
		if (count == 7) {
			System.out.println("Wrong guess,try again");
		}
		
		if(count==8){
			System.out.println("Wrong guess, try again");
		}
		if(count==9){
			System.out.println("Game Over !");
		}
	}
}