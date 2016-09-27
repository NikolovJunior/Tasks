public class Employee extends Person {
	private final short MAX_AGE = 120;
	private final short MIN_AGE_FOR_OVERTIME = 18;
	private final short WORKING_HOURS_PER_DAY = 8;
	private final double COEFFICIENT_FOR_OVERTIME = 1.5;
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if (name != null && !name.equals("") && name.length() > 1) {
			this.name = name;
		}
		if (age > 0 && age < MAX_AGE) {
			this.age = age;
		}
		if (isMale == true && isMale == false) {
			this.isMale = isMale;
		}
		if (daySalary > 0) {
			this.daySalary = daySalary;
		}

	}

	void calculateOvertime(double hours) {
		double overtime = 0.0d;
		if (age > MIN_AGE_FOR_OVERTIME) {
			overtime = ((daySalary / WORKING_HOURS_PER_DAY) * hours)
					* COEFFICIENT_FOR_OVERTIME;
			System.out.println(this.name + "'s overtime slaray: " + overtime);
			// this.daySalary += overtime;
		} else {
			overtime = 0.0;
		}
	}

	void showEnployeeInfo() {
		showPersonInfo();
		System.out.println("Salaray: " + this.daySalary);
	}

}
