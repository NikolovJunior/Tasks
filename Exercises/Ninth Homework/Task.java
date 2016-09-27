package office;

public class Task {
	final int MIN_LENGTH_FOR_NAME = 2;
	public static String name;
	public static int workingHours;
	
	Task(String name, int workingHours) {
		if (name != null && !name.equals("") && name.length() >= MIN_LENGTH_FOR_NAME) {
			this.name = name;
		}
		if (workingHours > 0) {
			this.workingHours = workingHours;
		}
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		if (name != null && name.length() >= MIN_LENGTH_FOR_NAME) {
			this.name = name;
		} else {
			System.out.println("Invalid name!");
		}
	}

	int getWorkingHours() {
		return workingHours;
	}

	void setWorkingHours(int workingHours) {
		if (workingHours > 0) {
			this.workingHours = workingHours;
		} else {
			System.out.println("Invalid working hours!");
		}
	}
}
