package office;

public class Employee {
	final int MIN_LENTH_FOR_NAME = 2;
	final int WORKING_HOURS_PER_DAY = 8;
	final int k;
	private String name;
	private Task currentTask;
	public int hoursLeft;
	AllWork allWork;

	Employee(String name , int k) {
		this.k = k;
		if (name != null && !name.equals("") && name.length() >= MIN_LENTH_FOR_NAME) {
			this.name = name;
		}
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		if (name != null && !name.equals("") && name.length() >= MIN_LENTH_FOR_NAME) {
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
	
	Task getCurrentTask(){
		return this.currentTask;
	}
	
	void setCurrentTask(Task currentTask){
		this.currentTask = currentTask;
	}
	
	AllWork getAllWork(){
		return this.allWork;
	}
	
	void setAllWork(AllWork allWork){
		this.allWork = allWork;
	}

	void work(){
		int result = 0;
		if (this.currentTask.workingHours > this.hoursLeft) {
			result = this.currentTask.workingHours - this.hoursLeft;
			this.hoursLeft = 0;
			this.currentTask.workingHours = result;
			System.out.println("Working hours left for the day: 0");
			System.out.println("Wroking hours left for the task: " + result);
			startWorkingDay();
			
		}
		if (this.currentTask.workingHours < this.hoursLeft) {
			result = this.hoursLeft - this.currentTask.workingHours;
			this.hoursLeft = result;
			this.currentTask.workingHours = 0;
			System.out.println("Working hours left for the day: " + result);
			System.out.println("Wroking hours left for the task: 0");
			this.hoursLeft = result;
			allWork.getNextTask();
		}
	}

	void showReport(Task s) {
		System.out.println("Name: " + this.name);
		System.out.println("Name of the task: " + s.name);
		System.out.println("Hours left: " + this.hoursLeft);
		System.out.println("Working hours left: " + s.workingHours);
		System.out.println();
	}
	
	void startWorkingDay(){
		System.out.println("New day for " + this.name + ".");
		
		this.hoursLeft = WORKING_HOURS_PER_DAY;
	}
}
