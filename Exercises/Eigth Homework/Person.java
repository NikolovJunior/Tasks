public class Person {
	
	private final short MAX_AGE = 120;
	public boolean isMale;
	public String name;
	public int age;

	public Person(String name, int age, boolean isMale) {
		if (name != null && !name.equals("") && name.length() > 1) {
			this.name = name;
		}
		if (age > 0 && age < MAX_AGE) {
			this.age = age;
		}
		if (isMale == true && isMale == false) {
			this.isMale = isMale;
		}
	}

	void showPersonInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.isMale);
	}

}
