package Task3;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;

	Employee(String name) {
		if (name != null && !name.equals("") && name.length() >= 2) {
			this.name = name;
		}
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		if (name != null && !name.equals("") && name.length() >= 2) {
			this.name = name;
		} else {
			System.out.println("Invalid name!");
		}
	}

	int getHoursLeft() {
		return this.hoursLeft;
	}

	void setHoursLeft(int hoursLeft) {
		if (hoursLeft > -1) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("Invalid hours left!");
		}
	}

	void work(Task t) {
		int result = 0;
		if (t.workingHours > this.hoursLeft) {
			result = t.workingHours - this.hoursLeft;
			this.hoursLeft = 0;
			t.workingHours = result;
			System.out.println("Working hours left for the day: 0");
			System.out.println("Wroking hours left for the task: " + result);
		}
		if (t.workingHours < this.hoursLeft) {
			result = this.hoursLeft - t.workingHours;
			this.hoursLeft = result;
			t.workingHours = 0;
			System.out.println("Working hours left for the day: " + result);
			System.out.println("Wroking hours left for the task: 0");
		}
		this.showReport(t);
	}

	void showReport(Task s) {
		System.out.println("Name: " + this.name);
		System.out.println("Name of the task: " + s.name);
		System.out.println("Hours left: " + this.hoursLeft);
		System.out.println("Working hours left: " + s.workingHours);
		System.out.println();
	}

}
