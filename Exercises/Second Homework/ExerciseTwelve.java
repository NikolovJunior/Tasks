public class ExerciseTwelve {

	/*
	 * Задача 12: Да се състави програма, която извежда всички естествени
	 * трицифрени числа, които нямат еднакви цифри т.е. 100,101, 606 и т.н. не
	 * се извеждат.
	 */
	public static void main(String[] args) {
		for (int i = 102; i <= 987; i++) {
			int units = i % 10; // присвоява единиците
			int tenths = i % 100; // присвоява последните 2 цифри
			int tenths2 = (tenths - units) / 10; // присвоява десетиците
			int hundreds = (i - tenths) / 100; // присвоява стотиците
			if (hundreds == units || units == tenths2 || tenths2 == hundreds) {

			} else {
				System.out.print(i + " ");
			}
		}

	}

}
