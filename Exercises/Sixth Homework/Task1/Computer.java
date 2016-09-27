package Task1;

public class Computer {

	int year;
	float price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem){
		if((!newOperationSystem.equals(""))&&(newOperationSystem != null)){
			operationSystem = newOperationSystem;
			System.out.println("New operation system is: " + operationSystem);
		}else{
		if(newOperationSystem.equalsIgnoreCase(operationSystem)){
			System.out.println("Operation System was just reinstalled. ");
		}
		}
	}
	void useMemory(int memoryUsage){
		if(memoryUsage >= freeMemory){
			System.out.println("Not enough free memory!");
		}
		if(memoryUsage < freeMemory){
		    freeMemory -= memoryUsage;
			System.out.println("Free memory is: " + freeMemory);
		}
	}
	
}
