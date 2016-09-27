package office;

public class Loading {

	public static void main(String[] args) {
		AllWork job = new AllWork();
		for(int index = 0 ; index < job.FREE_PLACES ; index++){
			job.tasks[index].workingHours = (int)(Math.random()*12);
			System.out.println(job.tasks[index].workingHours + " ");
		}
		System.out.println();
		job.tasks[0].name = "Maintaining the server.";
		job.tasks[1].name = "Parking the cars.";
		job.tasks[2].name = "Selling technology.";
		job.tasks[3].name = "Doing HR stuffs.";
		job.tasks[4].name = "Programing";
		job.tasks[5].name = "Driving taxi.";
		job.tasks[6].name = "Cleaning the desk.";
		job.tasks[7].name = "Maintaining the internet.";
		job.tasks[8].name = "Buy new stuff for the new employers.";
		job.tasks[9].name = "Installing OS to the new PC's.";
		
		job.addTask(job.tasks[0]);
		job.addTask(job.tasks[1]);
		job.addTask(job.tasks[2]);
		job.addTask(job.tasks[3]);
		job.addTask(job.tasks[4]);
		job.addTask(job.tasks[5]);
		job.addTask(job.tasks[6]);
		job.addTask(job.tasks[7]);
		job.addTask(job.tasks[8]);
		job.addTask(job.tasks[9]);
		
		
		Employee grisha = new Employee("Grigor");
		Employee alex = new Employee("Alexander");
		Employee ivan = new Employee("Ivan");
		
		int count = 1;
		int countWork = 0; 
		while(true){
			System.out.printf("Day %1$d: ",count);
			System.out.println();
			count++;
			grisha.startWorkingDay();
			alex.startWorkingDay();
			ivan.startWorkingDay();			
			grisha.work();
			alex.work();
			ivan.work();
			if(job.isAllWorkDone()){
				break;
			}
		}
		
	}

}
