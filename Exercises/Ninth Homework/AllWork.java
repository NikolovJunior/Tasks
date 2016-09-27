package office;

public class AllWork {
	final int FREE_PLACES = 10;
	Task[] tasks;
	int freePlacesForTask;
	int currentUnassignedTask;

	AllWork() {
		this.tasks = new Task[FREE_PLACES];
		this.freePlacesForTask = FREE_PLACES;
		this.currentUnassignedTask = 1;

	}

	void addTask(Task t) {
		if (this.freePlacesForTask > 0) {
			this.freePlacesForTask--;
			tasks[this.freePlacesForTask] = t;
			System.out.println("New task is added.");
		} else {
			System.out.println("There are no free places for new tasks.");
		}
	}

	Task getNextTask() {
		System.out.println();
		System.out.print("Next task is: ");
		int temp = 0;
		for(int index = 0 ; index < tasks.length ; index++){
			if(tasks[index].name != null){
				temp = index;
				System.out.println(this.tasks[index].name);
			}
		}
		return tasks[temp];
	}

	boolean isAllWorkDone() {
			if (this.tasks[9].workingHours == 0) {
				System.out.println("All work  is done.");
				return true;
			} else {
				System.out.println("There is still work to do. Go back to work.");
				return false;
			}
	}

}
