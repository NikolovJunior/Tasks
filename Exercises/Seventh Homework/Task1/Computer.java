package Task1;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "WinXP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		if (year >= 1934 && year < 2017) {
			this.year = year;
		}
		if (price > 0.0d) {
			this.price = price;
		}
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = this.hardDiskMemory;
		}
		if (freeMemory <= hardDiskMemory) {
			this.freeMemory = freeMemory;
		}

	}

	void changeOperationSystem(String newOperationSystem) {
		if ((!newOperationSystem.equals("")) && (newOperationSystem != null)) {
			operationSystem = newOperationSystem;
			System.out.println("New operation system is: " + operationSystem);
		} else {
			if (newOperationSystem.equalsIgnoreCase(operationSystem)) {
				System.out.println("Operation System was just reinstalled. ");
			}
		}
	}

	void useMemory(int memoryUsage) {
		if (memoryUsage >= freeMemory) {
			System.out.println("Not enough free memory!");
		}
		if (memoryUsage < freeMemory) {
			freeMemory -= memoryUsage;
			System.out.println("Free memory is: " + freeMemory);
		}
	}

	int comparePrice(Computer comp) {
		if (comp != null && this.price > 0) {
			double result = comp.price - this.price;
			if (Math.abs(result - 1.0) <= 0.000001) {
				return 0;
			}
			if (comp.price < this.price) {
				return -1;
			}
			if (comp.price > this.price) {
				return 1;
			}
		}
		return 0;
	}

}
