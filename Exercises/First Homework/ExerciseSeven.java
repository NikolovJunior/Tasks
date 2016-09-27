import java.util.Scanner;

public class ExerciseSeven {
	/*
	 * Въведете 3 променливи от клавиатурата – час (целочислен тип), сума пари
	 * (число с плаваща запетая), дали съм здрав – булев тип. Съставете
	 * програма, която взема решения на базата на тези данни по следния начин: -
	 * ако съм болен, няма да излизам - ако имам пари, ще си купя лекарства -
	 * ако нямам – ще стоя вкъщи и ще пия чай - ако съм здрав, ще отида на кино
	 * с приятели - ако имам по-малко от 10 лв, ще отида на кафе. Полученото
	 * решение покажете като съобщение в конзолата.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("The time is: ");
		int time = input.nextInt(); //времето не се използва
		System.out.print("I have: ");
		float money = input.nextFloat();
		System.out.println("lv.");
		System.out.print("Am i healthy?");
		boolean healthy = input.nextBoolean();
		if (healthy == false && money <= 0) {
			System.out.println("I will stay at home and i will drink tea.");
		} else if (healthy == false && money > 0) {
			System.out.println("I will buy medicaments.");
		} else if (healthy == true && money < 10) {
			System.out.println("I will go to Coffee.");
		} else if (healthy == true && money >= 10) {
			System.out.println("I will go to cinema.");
		}

		input.close();
	}

}
