package Task3;

public class Task {
	public String name;
	public int workingHours;
	
	Task(String name, int workingHours) {
		if (name != null && !name.equals("") && name.length() >= 2) {
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
		if (name != null && name.length() > 1) {
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
