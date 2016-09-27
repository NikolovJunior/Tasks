import java.util.Scanner;

public class ExerciseThirteen {

	/*
	 * Да се състави програма, която да отгатне колко е студено/топло по
	 * въведената температура t в градус Целзий. Температурните интервали са:
	 * под -20 ледено студено; между 0 и -20 - студено; между 15 и 0 - хладно;
	 * между 25 и 15 - топло; над 25 – горещо. Входни данни: цяло число от
	 * интервала [-100..100]. Входни данни: цяло число от интервала [-100..100].
	 * Пример: 12 Изход: хладно
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int temperature;
		do {
			System.out.print("Enter temperature: ");
			temperature = input.nextInt();
		} while (temperature < -100 || temperature > 100);

		if (temperature <= -20) {
			System.out.println("Ice cold.");
		} else {
			if (temperature < 0 & temperature > -20) {
				System.out.println("Coldly.");
			}
			if (temperature < 15 & temperature >= 0) {
				System.out.println("Cold.");
			}
			if (temperature < 25 & temperature >= 15) {
				System.out.println("Warm.");
			}
			if (temperature >= 25) {
				System.out.println("Hot.");
			}
		}
		input.close();
	}

}
