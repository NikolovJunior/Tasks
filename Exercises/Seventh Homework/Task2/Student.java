package Task2;

public class Student {
	final int LAST_YEAR_IN_COLLEGE = 4;
	final int MAX_AGE_FOR_SCHOLARSHIP = 30;
	final int MIN_AGE_FOR_JOINING_THE_COLLEGE = 10;
	final int MIN_LENGTH_FOR_NAME = 2;
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		if (name != null && !name.equals("") && name.length() >= MIN_LENGTH_FOR_NAME) {
			this.name = name;
		}
		if (subject != null && !subject.equals("")) {
			this.subject = subject;
		}
		if (age > MIN_AGE_FOR_JOINING_THE_COLLEGE) { // в случай, че е гений
			this.age = age;
		}
	}

	void upYear() {
		this.yearInCollege++;
		if (yearInCollege == LAST_YEAR_IN_COLLEGE) {
			this.isDegree = true;
		} else {
			this.isDegree = false;
			System.out.println("The student is in " + this.yearInCollege
					+ " course.");
		}
	}

	double receiveScholarShip(double min, double amount) {
		if (age < MAX_AGE_FOR_SCHOLARSHIP && min < grade) {
			this.money += amount;
		}
		System.out.print(this.name + "'s scholarship money: ");
		return this.money;
	}
	

}
