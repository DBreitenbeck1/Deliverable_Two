import java.util.Scanner;

public class Deliv2 {
	public static void main(String[] args) {
		String input;
		String message;
		int checksum = 0;
		int result;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter Message:");
		input = scnr.nextLine().toUpperCase();

		System.out.print("Your encoded message is: ");
		for (int i = 0; i < input.length(); ++i) {
			result = input.codePointAt(i);
			if (result < 65 || result > 90) {
				result = 0;
				message = (""); 
			} else {
				checksum += result;
				result = result - 64;

				if (i != (input.length() - 1)) {
					message = (String.valueOf(result)) + "-";
				} else {
					message = (String.valueOf(result));
				}
				System.out.print(message);
			}
		}
		System.out.println("\nMessage checksum is: " + checksum);

		scnr.close();
	}
}
