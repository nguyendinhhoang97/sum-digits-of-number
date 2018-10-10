import java.util.Scanner;

public class SumDigitsinNumber {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = scanner.nextInt();
		System.out.println("Sum of digits in number: " + sumDigits(number));

	}

	public static long sumDigits(long number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}
}
