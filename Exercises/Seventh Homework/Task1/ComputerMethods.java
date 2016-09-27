package Task1;

import java.util.Scanner;

public class ComputerMethods {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Computer comp = new Computer();
		Computer compTwo = new Computer();
/*
		System.out.println("Is it laptop?");
		boolean isLaptop = true; // input.nextBoolean();
		comp.isNotebook = isLaptop;
		System.out.println(comp.isNotebook);
		System.out.println("Price: ");
		double cost = input.nextInt();
		comp.price = cost;
		System.out.println("Year of manufacture: ");
		double manufacture = input.nextInt();
		comp.year = manufacture;
		System.out.println("Capacity of the hard disk: ");
		double capacity = input.nextInt();
		comp.hardDiskMemory = capacity;
		System.out.println("Free space of the hard disk: ");
		double freeSpace = input.nextInt();
		comp.freeMemory = freeSpace;
		System.out.println("Operation System:");
		String os = input.next();
		comp.operationSystem = os;

		System.out.println("Is it laptop?");
		boolean isLaptopTwo = false;
		compTwo.isNotebook = isLaptopTwo;
		System.out.println(compTwo.isNotebook);
		*/
		System.out.println("Price: ");
		double costTwo = input.nextInt();
		compTwo.price = costTwo;
		System.out.println("Year of manufacture: ");
		int manufactureTwo = input.nextInt();
		compTwo.year = manufactureTwo;
		System.out.println("Capacity of the hard disk: ");
		double capacityTwo = input.nextInt();
		compTwo.hardDiskMemory = capacityTwo;
		System.out.println("Free space of the hard disk: ");
		double freeSpaceTwo = input.nextInt();
		compTwo.freeMemory = freeSpaceTwo;
		/*
		System.out.println("Operation System:");
		String osTwo = input.next();
		compTwo.operationSystem = osTwo;
		*/
		/*
		System.out.println("Enter new OS for first computer: ");
		String newOS = input.next();
		comp.changeOperationSystem(newOS);
		System.out.println("Add new memory to the hard disk of the second comuter: ");
		int newMemory = input.nextInt();
		compTwo.useMemory(newMemory);
		*/
		//след прилагането на методите
//		System.out.println("Frist computer information is: " + "Notebook: "
//				+ comp.isNotebook + ". Price: " + comp.price
//				+ ". Year of manufacture: " + comp.year + ". Operation System: "
//				+ comp.operationSystem + ". Hard Disk Memory: "
//				+ comp.hardDiskMemory + ". Free memory: " + comp.freeMemory);
		
		System.out.println("Frist computer information is: " + "Notebook: "
				+ compTwo.isNotebook + ". Price: " + compTwo.price
				+ ". Year of manufacture: " + compTwo.year + ". Operation System: "
				+ compTwo.operationSystem + ". Hard Disk Memory: "
				+ compTwo.hardDiskMemory + ". Free memory: " + compTwo.freeMemory);

		Computer c = new Computer(2000,1000,200,150);
		System.out.println(c.comparePrice(compTwo));
		
		input.close();
	}

}
